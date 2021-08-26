package OOPS;

import java.util.Random;

public class Goblin extends Entity {
        public Goblin(Coordinates coordinates) {
            this.setCoordinates(coordinates);
            this.setSymbol("\uD83E\uDDDF");

            this.setHealth(new Random().nextInt(10) + 2);
            this.setAttackPower(new Random().nextInt(getHealth()) / 2 + 1);
        }

        @Override
        public String toString() {
            return "Goblin: " + getHealth() + getHealth() + "; attackPower = " + getAttackPower();
        }
}
