/**
 * test
 */

public class Microphone {
    // instance variables /property /fields
    private String name;
    private String color;
    private int model;

    // public Microphone constructor

    public Microphone(String name, String color, int model) {
        this.name = name;
        this.color = color;
        this.model = model;
    }

    // Actions methods
    public void turnoff() {
        System.out.println(this.name + " Turn Off");
    }

    public void turnon() {
        System.out.println(this.name + " Turn on");

    }

    public void setVolume() {
        System.out.println(this.name + " Setting Volume");

    }

    public String showDescription() {
        return "Microphone name " + this.name + " with color:" + this.color + " and its model " + this.model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }
}
