package com.lesson2;

import com.lesson2.classes.Circle;
import com.lesson2.classes.Cylinder;


import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Circle[] circles = generateCircles(scanner);
        String maxArea = getMaxArea(circles);

        Cylinder[] cylinders = generateCylinders(scanner);
        String averageVolume = getAverageVolume(cylinders);

        scanner.close();

        System.out.println("\n===== RESULT =====");
        System.out.printf("Max area - %s\n", maxArea);
        System.out.printf("Average volume - %s", averageVolume);
    }

    public static Circle[] generateCircles(Scanner scanner) {
        final int N;

        System.err.print("Enter the number of circles: ");
        N = scanner.nextInt();
        scanner.nextLine();

        Circle[] circles = new Circle[N];

        for (int i = 0; i < N; i++) {
            Circle circle = new Circle();

            System.out.print("Enter the radius: ");
            circle.setRadius(scanner.nextDouble());
            scanner.nextLine();

            circles[i] = circle;
        }

        return circles;
    }

    public static String getMaxArea(Circle[] circles) {
        Double[] areas = new Double[circles.length];

        for (int i = 0; i < circles.length; i++) {
            areas[i] = circles[i].getArea();
        }

        double max = Collections.max(Arrays.asList(areas));

        return String.format("%.1f", max);
    }

    public static Cylinder[] generateCylinders(Scanner scanner) {
        final int N;

        System.err.print("\nEnter the number of cylinders: ");
        N = scanner.nextInt();
        scanner.nextLine();

        Cylinder[] cylinders = new Cylinder[N];

        for (int i = 0; i < N; i++) {
            Cylinder cylinder = new Cylinder();

            System.out.print("Enter the radius: ");
            cylinder.setRadius(scanner.nextDouble());

            System.out.print("Enter the height: ");
            cylinder.setHeight(scanner.nextDouble());

            cylinders[i] = cylinder;
        }

        return cylinders;
    }

    public static String getAverageVolume(Cylinder[] cylinders) {
        double volume = 0;

        for (Cylinder cylinder : cylinders) {
            volume += cylinder.getVolume();
        }

        return String.format("%.1f", volume / cylinders.length);
    }
}

