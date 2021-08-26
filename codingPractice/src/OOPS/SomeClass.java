package OOPS;

public class SomeClass {
    private int age;
    String name;

    public void info(){
        name = "Tek";
        age = 36;
        System.out.println("Name: " + name +"\n"+"Age: " + age);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
