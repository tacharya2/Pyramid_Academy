package OOPS;

import java.util.ArrayList;

public class Cell extends Actor{
    private ArrayList<Actor> actors;

   public Cell(Coordinates coordinates){ // Constructor
       setCoordinates(coordinates);
   }

   public ArrayList<Actor> getActors(){ // getter for actor
      if(actors == null){
          actors = new ArrayList<>();
      }
      return actors;
   }

    public void setActors(ArrayList<Actor> actors) { // setter for actor
        this.actors = actors;
    }
}
