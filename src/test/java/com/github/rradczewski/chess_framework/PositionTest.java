package com.github.rradczewski.chess_framework;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class PositionTest {
    @Test
    public void APositionCanBeConstructedFromString() {
        Position a1 = new Position("A1");

        assertThat(a1.getX(), is(1));
        assertThat(a1.getY(), is(1));

        Position h8 = new Position("H8");

        assertThat(h8.getX(), is(8));
        assertThat(h8.getY(), is(8));
    }

    @Test
    public void APositionCanBeConstructedFromACharAndAnInt() {
        Position a1 = new Position('A', 2);

        assertThat(a1.getX(), is(1));
        assertThat(a1.getY(), is(2));

        Position h8 = new Position('H', 5);

        assertThat(h8.getX(), is(8));
        assertThat(h8.getY(), is(5));
    }

    @Test
    public void ToStringWorks() {
        assertThat(new Position("A1").toString(), is("A1"));
        assertThat(new Position("H8").toString(), is("H8"));
    }
}
