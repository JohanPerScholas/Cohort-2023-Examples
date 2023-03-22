package org.example;

public class AreaComputer {

    public static final double PI = 3.14159;

    /** Main Method **/
    public static void main(String[] args){
        double radius;
        double area;

        // Assign a radius
        radius = 20;

        // Compute area
        area = radius * radius * PI;

        // Display results
        System.out.println("The area for the circle of radius " + radius + " is " + area);
    }
}
