package assignments.section5;

import java.util.ArrayList;
class MagicalPotionShop<Potion> {
    private ArrayList<Potion> potions = new ArrayList<>();

    public ArrayList<Potion> addPotions(ArrayList<Potion>potions, Potion potionType){
        this.potions = potions;
        potions.add(potionType);
        return potions;
    }
}
class MagicalPotion{
    private String name;
    private String effect;

    public MagicalPotion(String name, String effect) {
        this.name = name;
        this.effect = effect;
    }
}

