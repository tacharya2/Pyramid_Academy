package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);
    private List<Board> boards = new ArrayList<>();
    int shipChoice;
    List<Integer> coordinatesAndShipType = new ArrayList<>();

    public List<Board> getBoards(){
        generateBoard();
        return boards;
    }
    public void generateBoard(){
        System.out.print("Select height:");
        int x = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Select width: ");
        int y = scanner.nextInt();

        Board board1 = new Board(x , y);
        Board board2 = new Board(x , y);

        boards.add(board1);
        boards.add(board2);
    }
    public Input(){

    }
    public int getIntegerShipOption(){
      shipChoice  = scanner.nextInt();
      scanner.nextLine();
      return shipChoice;
    }
    private List<Integer> askCoordinatesForShipAndType(){
        coordinatesAndShipType = new ArrayList<>();
        System.out.println("Select the row for ship: ");
        int row = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Select the column for ship: ");
        int col = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Select the ship type: " +
                "\n 1. CARRIER \n 2. CRUISER \n 3. BATTLESHIP \n 4. DESTROYERS \n 5. SUBMARINE \n");

        int shipType = scanner.nextInt();
        coordinatesAndShipType.add(row);
        coordinatesAndShipType.add(col);
        coordinatesAndShipType.add(shipType);

        return coordinatesAndShipType;
    }
    public Ship createShip(int player){
        int gamePlayer = player + 1;
        Square shipPrt;
        Ship ship;
        System.out.println("player " + gamePlayer + " place the ship");
        coordinatesAndShipType = askCoordinatesForShipAndType();
        int row = coordinatesAndShipType.get(0);
        int col = coordinatesAndShipType.get(1);
        int shipType = coordinatesAndShipType.get(2);
        shipPrt = new Square(row, col, SquareStatus.SHIP);
        ship  = new Ship(new ArrayList<>(), ShipType.values()[shipType - 1]);
        boards.get(player).buildShip(shipPrt,ship);
        return ship;
    }
    public int[] shoot(int player){
        int gamePlayer = player + 1;
        System.out.println("Player " + gamePlayer + " shoot");
        System.out.print("Select row: ");
        int row = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Select column: ");
        int col = scanner.nextInt();
        scanner.nextLine();
        return new int[]{row, col};
    }
}