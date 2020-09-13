package ru.mirea.kicha0819.lab6;

public class Square extends Restangle {
    protected double side;

    public Square() {
        this.Filled = false;
        this.Color = "blue";
        this.side = 4.0D;
    }

    public Square(double side) {
        this.Filled = false;
        this.Color = "blue";
        this.side = side;
    }

    public Square(double side, boolean filled, String color) {
        this.Filled = filled;
        this.Color = color;
        this.side = side;
    }

    public double getSide() {
        return this.side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setWidth(double side) {
        super.setWidth(side);
    }

    public void setLength(double side) {
        super.setLength(side);
    }

    public String toString() {
        return super.toString();
    }
}