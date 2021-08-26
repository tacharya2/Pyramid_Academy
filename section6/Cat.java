package assignments.section6;

abstract class Cat extends Animal implements Walking{

    @Override
    public String makingSound(){
        return "I am a Cat...";
    }

    @Override
    public String walkAbout() throws InterruptedException {
        return ("I AM A CAT WALKING ABOUT!");
    }
}
