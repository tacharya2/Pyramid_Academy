package assignments.section5;

public class YakAttack {
    private String x;
    private String y;

    public YakAttack(String x, String y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "The yak shaves " + this.x + " back, and rides a " + this.y + " into the sunset";
    }
}
