package com.company;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Ship> shipsPlayer1= new ArrayList<>();
    private List<Ship> shipsPlayer2= new ArrayList<>();

    List<Board> boards;

    public void gameLogic(){
        Input board1 = new Input();
        boards = board1.getBoards();
        Board boardForPlayer1 = boards.get(0);
        Board boardForPlayer2 = boards.get(1);
        for(int i = 0; i < 2; i++){
            Ship one = board1.createShip(0);
            while(one.isPlacementOk(one,shipsPlayer1,boardForPlayer1) == false){
                one = board1.createShip(0);
            }
            shipsPlayer1.add(one);
        }
        for(int i = 0; i < 2; i++){
            Ship one = board1.createShip(1);
            while(one.isPlacementOk(one,shipsPlayer2,boardForPlayer2) == false){
                one = board1.createShip(1);
            }
            shipsPlayer2.add(one);
        }
        Player player1 = new Player(shipsPlayer1, boardForPlayer2);
        Player player2 = new Player(shipsPlayer2, boardForPlayer1);

        boolean gameOn = true;

        Display display = new Display();
        System.out.println("<<<<<<<<<<<<<<<<< Player1 Board <<<<<<<<<<<<<<<");
        display.printBoard(boardForPlayer1);
        System.out.println("-----------------------------------------------");
        System.out.println("<<<<<<<<<<<<<<<<< Player2 Board <<<<<<<<<<<<<<<");
        display.printBoard(boardForPlayer2);

        int numberOfShipsPlayer1 = player1.numberOfSquaresOfShips(shipsPlayer1);
        int numberOfShipsPlayer2 = player2.numberOfSquaresOfShips(shipsPlayer2);
        while (gameOn){
            int []ShootCoordinates;
            ShootCoordinates = board1.shoot(0);
            if(player2.handleShots(ShootCoordinates[0], ShootCoordinates[1])){
                display.printBoard(player2.getBoard());
                numberOfShipsPlayer2--;
            }else{
                display.printBoard(player2.getBoard());
            }
            if(numberOfShipsPlayer2 == 0){
                display.printBoard(player2.getBoard());
                System.out.println("Player 1 wins");
                break;
            }
            ShootCoordinates = board1.shoot(1);
            if(player1.handleShots(ShootCoordinates[0], ShootCoordinates[1])){
                display.printBoard(player1.getBoard());
                numberOfShipsPlayer1--;
            }else{
                display.printBoard(player1.getBoard());
            }
            if(numberOfShipsPlayer1 == 0){
                display.printBoard(player1.getBoard());
                System.out.println("Player 2 wins");
                break;
            }
        }
    }
}
