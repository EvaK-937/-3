package ru.mirea.kicha0819.lab6;
import java.lang.*;
import java.math.*;
public abstract class Shape {
    protected String Color;
    protected boolean Filled;
    protected String color;

    public Shape() {
        this.Filled = false;
        this.Color = "blue";
    }

    public Shape(String color, boolean filled) {
        this.Color = color;
        this.Filled = filled;
    }

    public String getColor() {
        return this.Color;
    }

    public void setColor(String color) {
        this.Color = color;
    }

    public boolean isFilled() {
        return this.Filled;
    }

    public void setFilled(boolean filled) {
        this.Filled = filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public String toString() {
        return "Shape{Color='" + this.Color + "', Filled=" + this.Filled + "}";
    }
}
