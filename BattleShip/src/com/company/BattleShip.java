package com.company;

public class BattleShip {
    private Display display;
    public Game game;
    private Input input;

    public BattleShip() {
        display = new Display();
    }

    public void start() {
        display.printMenu();
        mainMenu();
    }

    public void mainMenu() {
        int choice;
        boolean exit = false;
        input = new Input();

        while (!exit) {
            display.printMenuOptions();
            System.out.println("Enter your choice");
            System.out.println();
            choice = input.getIntegerShipOption();

            switch (choice) {
                case 0:
                    display.printMessages("You choose to play the game");
                    game.gameLogic();
                    break;
                case 1:
                    System.out.flush();
                    display.gameRules();
                    break;
                case 2:
                    display.printMessages("You choose to exit of the game");
                    exitGame();
                    exit = true;
                    break;

            }
        }
    }
    public void exitGame() {
        display.printExitMessage();
        System.exit(0);
    }
}