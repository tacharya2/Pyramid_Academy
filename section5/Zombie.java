package assignments.section5;

public class Zombie {
    String brainLust = "Half-time";
    float strength = 2.8f;
    int intelligence = 6;
    String compassion = "non-passionate(risky)";

    public String explode(String shotPoint){
        String result = "";
        switch (shotPoint){
            case "head-shot":
                result =  "fall";
                break;
            case "stomach-shot":
                result =  "explode";
                break;
            case "leg-shot":
                result =  "crawl";
        }
        return result;
    }
}
