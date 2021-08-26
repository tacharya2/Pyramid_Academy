package assignments.section6;

abstract class Dog extends Animal implements Walking {

    @Override
    public String makingSound() {
        return "I am a Dog...";
    }

    @Override
    public String walkAbout() throws InterruptedException {
        return ("I AM A DOG WALKING ABOUT!");
    }
}
