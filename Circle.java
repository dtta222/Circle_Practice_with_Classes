//*************************************************************************
//Week 12 - Practice Assignment
//Circle.java
//Date: 04/26/2023
//Author: David Taylor
//Class: CIT 149–19Z1–78178
//Instructor: Krishna Nandanoor
//Purpose: The Circle class models a circle with a radius and color
//*************************************************************************

public class Circle {
    // private instance variable, not accessible from outside this class
    private double radius;

    public Circle() { // 1st (default) constructor
        radius = 1.0;
    }

    /** Constructs a Circle instance with the given radius and default color */
    public Circle(double r) { // 2nd constructor
        radius = r;
    }


    /** Returns the radius */
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    /** Returns the area of this Circle instance */
    public double getArea() {
        return radius*radius*Math.PI;
    }

    public double getCircumference() {
        return 2*Math.PI*getRadius();
    }

    public String toString() {
        return "Radius: " + radius + "\n" + "Circumference: " + getCircumference() + "\n";
    }
}
