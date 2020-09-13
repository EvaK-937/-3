package ru.mirea.kicha0819.lab6;

public class Restangle extends Shape {
    protected double width;
    protected double length;

    public Restangle() {
        this.Filled = false;
        this.Color = "blue";
        this.length = 5.0D;
        this.width = 4.0D;
    }

    public Restangle(double width, double length) {
        this.Filled = false;
        this.Color = "blue";
        this.width = width;
        this.length = length;
    }

    public Restangle(String color, boolean filled, double width, double length) {
        this.Filled = filled;
        this.Color = color;
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return this.length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return this.width * this.length;
    }

    public double getPerimeter() {
        return 2.0D * (this.width + this.length);
    }

    public String toString() {
        return super.toString();
    }
}
