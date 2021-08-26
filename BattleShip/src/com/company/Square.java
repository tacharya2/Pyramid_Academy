package com.company;

public class Square {
    private int x;
    private int y;
    private SquareStatus squareStatus;

    public Square(int x, int y, SquareStatus squareStatus) {
        // constructor. Needed while the data is private plus to customize the instance of the object
        // Whenever an object of Square is created; it can take all these parameters.
        this.x = x;
        this.y = y;
        this.squareStatus = squareStatus;
    }

    public void setSquareStatus(SquareStatus squareStatus) {
        this.squareStatus = squareStatus;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public SquareStatus getSquareStatus() {
        return squareStatus;
    }
    public char getCharacter(){
        char result = ' ';
        switch (squareStatus) {
            case EMPTY:
                result = 'E';
                break;
            case HIT:
                result = 'H';
                break;
            case MISS:
                result = 'M';
                break;
            case SHIP:
                result = 'S';
                break;
            case OCEAN:
                result = 'O';
                break;
        }
        return result;
    }
}
