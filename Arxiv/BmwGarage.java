package Arxiv;

public class BmwGarage {
    private String name;
    private String color;
    private int model;
    private int speed;
    DynamicArray dynamicArray = new DynamicArray();


    BmwGarage(String name, String color, Integer model, Integer speed) {
        this.name = name;
        this.color = color;
        this.model = model;
        this.speed = speed;
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

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
