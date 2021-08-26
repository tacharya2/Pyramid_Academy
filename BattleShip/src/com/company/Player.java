package com.company;

import java.util.List;

public class Player {
    private List<Ship> ships;
    private Board board;
    private int remainingShips = 0;

    public Player(List<Ship> ships, Board board) {
        this.ships = ships;
        this.board = board;
    }
    public Board getBoard() {
        return board;
    }
    public int numberOfSquaresOfShips(List<Ship> ships){
        int sumOfAllShips = 0;
        for(Ship ship:ships){
            sumOfAllShips += ship.getShipType().getLabel();
        }

        return sumOfAllShips;
    }
    public boolean handleShots(int x, int y){
        for(Ship ship : ships){
            for(Square square: ship.getFields()){
                if(square.getX() == x && square.getY() == y && square.getSquareStatus().equals(SquareStatus.SHIP)){
                    square.setSquareStatus(SquareStatus.HIT);
                    board.getSquare(x,y).setSquareStatus(SquareStatus.HIT);
                    return true;
                }else if(square.getY() == y && square.getX() == x && square.getSquareStatus().equals(SquareStatus.HIT)){
                    square.setSquareStatus(SquareStatus.HIT);
                    board.getSquare(x, y).setSquareStatus(SquareStatus.HIT);
                    System.out.println("Already hit");
                    return false;

                }
               {

                }
            }
        }
        board.getSquare(x, y).setSquareStatus(SquareStatus.MISS);
        System.out.println("Miss!");
        return false;
    }
}
