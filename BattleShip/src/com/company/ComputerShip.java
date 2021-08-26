package com.company;

import java.util.List;

public class ComputerShip extends Ship2 {
    @Override
    void add(Square square) {

    }

    @Override
    boolean isPlacementOk(List<Ship2> ships, Board board) {
        return false;
    }

    @Override
    List<Square> getFields() {
        return null;
    }

    @Override
    ShipType getShipType() {
        return null;
    }
}
