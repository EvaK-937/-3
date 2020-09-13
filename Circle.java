package ru.mirea.kicha0819.lab6;
import java.awt.*;
import java.lang.*;
import java.math.*;
public class Circle extends Shape {
    protected double radius;

    public Circle() {
        this.Filled = false;
        this.Color = "blue";
        this.radius = 1.0D;
    }

    public Circle(double radius) {
        this.Filled = false;
        this.Color = "blue";
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        this.Filled = filled;
        this.Color = color;
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return 3.141592653589793D * this.radius * this.radius;
    }

    public double getPerimeter() {
        return 6.283185307179586D * this.radius;
    }

    public String toString() {
        return super.toString();
    }
}
