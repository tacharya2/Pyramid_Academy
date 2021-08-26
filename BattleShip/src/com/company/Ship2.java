package com.company;

import java.util.List;

public abstract class Ship2 {
    public ShipType shipTypeList;
    public List<Square> squareList;

    abstract void add(Square square);

    abstract boolean isPlacementOk(List<Ship2> ships, Board board);

    abstract List<Square> getFields();

    abstract ShipType getShipType();

}
