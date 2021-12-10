package com.lesson2.classes;

import lombok.Getter;
import lombok.Setter;

public class Cylinder extends Circle {
    @Getter
    @Setter
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height > 0 ? height : 10;
    }

    public Cylinder(double height) {
        this.height = height > 0 ? height : 10;
    }

    public Cylinder() {
        this.height = 10;
    }

    @Override
    public double getArea() {
        return 2 * Math.PI * radius * (radius + this.height);
    }

    public double getVolume() {
        return Math.PI * Math.pow(radius, 2) * this.height;
    }

    @Override
    public String toString() {
        return "Cylinder:" +
                "\n\t- height: " + this.height +
                "\n\t- area: " + String.format("%.1f", this.getArea()) +
                "\n\t- volume: " + String.format("%.1f", this.getVolume());
    }
}
