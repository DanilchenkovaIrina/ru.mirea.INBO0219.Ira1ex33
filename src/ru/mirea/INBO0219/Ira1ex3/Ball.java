package ru.mirea.INBO0219.Ira1ex3;

public class Ball {
    private String Type;
    private int Radius;

    public Ball(String type, int radius) {
        this.Type = type;
        this.Radius = radius;
    }

    public String getType() {
        return this.Type;
    }

    public int getRadius() {
        return this.Radius;
    }

    public void setType(String name) {
        this.Type = name;
    }

    public void setRadius(int radius) {
        this.Radius = radius;
    }

    public String toString() {
        return this.Type + " мяч имеет радиус " + this.Radius + "см.";
    }

    public void intoMmRadius() {
        System.out.println(this.Type + " мяч радиус которого был переведен в миллиметры имеет радиус " + this.Radius * 10 + " мм.");
    }
}
