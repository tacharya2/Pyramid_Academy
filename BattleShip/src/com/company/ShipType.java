package com.company;

public enum ShipType {
    CARRIER(1),
    CRUISER(2),
    BATTLESHIP(2),
    DESTROYER(3),
    SUBMARINE(4),
    ;
    private final Integer label;

    ShipType(Integer label) {
        this.label = label;
    }

    public Integer getLabel() {
        return label;
    }
}
