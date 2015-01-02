package com.github.rradczewski.chess_framework;

public class Position {
    private static final char CHAR_OFFSET = 'A'-1;

    final char x;
    final char y;

    public Position(char x, char y) {
        if(x > CHAR_OFFSET) {
            x -= CHAR_OFFSET;
        }
        this.x = x;
        this.y = y;
    }

    public Position(char x, int y) {
        this(x, ((char) y));
    }

    public Position(String pos) {
        this(pos.charAt(0), Integer.parseInt(pos.substring(1)));
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return String.format("%s%s", Character.toString((char) (this.x + CHAR_OFFSET)), String.valueOf(this.getY()));
    }
}
