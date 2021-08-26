package assignments.section6;

public class Animal {
    protected String name;
    protected int age;
    protected String breed;
    protected String color;

    public Animal(String name, int age, String breed, String color) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.color = color;
    }

    public Animal() {

    }
    public String makingSound(){
        return "I am an Animal...";
    }
}

