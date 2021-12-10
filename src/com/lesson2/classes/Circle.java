package com.lesson2.classes;

import lombok.Getter;
import lombok.Setter;

public class Circle {
    @Getter
    @Setter
    protected double radius;

    public Circle(double radius) {
        this.radius = radius > 0 ? radius : 10;
    }

    public Circle() {
        this.radius = 10;
    }

    public double getLength() {
        return 2 * Math.PI * this.radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public String toString() {
        return "Circle:" +
                "\n\t- radius: " + this.radius +
                "\n\t- length: " + String.format("%.1f", this.getLength()) +
                "\n\t- area: " + String.format("%.1f", this.getArea());
    }
}
