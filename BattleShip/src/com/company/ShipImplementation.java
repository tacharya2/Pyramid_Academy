package com.company;

import java.util.List;

class PlayerShip extends Ship2 {
    public ShipType shipTypeList;
    public List<Square> squareList;

    @Override
    void add(Square square) {
        this.add(square);
    }


    @Override
    boolean isPlacementOk(List<Ship2> ships, Board board) {
        int count = 0;
        for(int i = 0; i < this.getFields().size(); i++){
            if(this.getFields().get(i).getY() > board.getSizeY() || this.getFields().get(i).getX() > board.getSizeX() ){
                count++;
            }
            for(int k = 0; k < ships.size(); k++){
                for(int z = 0; z < ships.get(k).getFields().size(); z++){
                    if(this.getFields().get(i).getX() == ships.get(k).getFields().get(z).getX() &&
                            this.getFields().get(i).getY() == ships.get(k).getFields().get(z).getY()){
                        count++;
                    }
                }
            }
        }

        if(count == 0){
            return true;
        }else{
            return false;
        }
    }

    @Override
    List<Square> getFields() {
      return this.squareList;
    }

    @Override
    ShipType getShipType() {
        return this.shipTypeList;
    }


}
