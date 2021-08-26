package assignments.section6;

public class TV {
    private String size;
    private String brand;

    public TV(String size, String brand) {
        this.size = size;
        this.brand = brand;
    }
    public TV(){

    }
    private String playingSound(){

        return "la..la..la..";
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
