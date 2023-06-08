//*************************************************************************
//Practice Assignment
//TestCircle.java
//Date: 04/26/2023
//Author: David Taylor
//Purpose: A Test Driver for the Circle class
//*************************************************************************

public class TestCircle {
    public static void main(String[] args) {

        // Construct the instance c1 by invoking the "default" constructor
        Circle c1 = new Circle();
        System.out.println("\nc1:");
        System.out.println("The circle has radius of " + c1.getRadius() + " and area of " + c1.getArea());

        // Construct the instance c2 by invoking the second constructor
        Circle c2 = new Circle(2.0);
        System.out.println("\nc2:");
        System.out.println("The circle has radius of " + c2.getRadius() + " and area of " + c2.getArea());

        // construct an instance of Circle
        Circle c4 = new Circle();

        // change radius
        c4.setRadius(5.5);

        System.out.println("\nc4:");
        // Print radius via getter
        System.out.println("radius is: " + c4.getRadius());
        // Print circumference via getter
        System.out.println("circumference is: " + c4.getCircumference());

        // construct an instance of Circle
        Circle c5 = new Circle(5.5);

        System.out.println("\nc5:");
        System.out.println(c5.toString());  // explicit call

        // construct an instance of Circle
        Circle c6 = new Circle(6.6);

        System.out.println("\nc6:");
        System.out.println(c6.toString()); // explicit call

        System.out.println(c6);            // println() calls toString() implicitly, same as above

        System.out.println("Operator '+' invokes toString() too: \n" + c6); // '+' invokes toString() too

    }
}
