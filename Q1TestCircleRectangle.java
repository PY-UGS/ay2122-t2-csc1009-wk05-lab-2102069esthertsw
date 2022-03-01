package com.esther.wk05;

public class Q1TestCircleRectangle {
    public static void main(String[] args){
        CircleFromGeometric circle = new CircleFromGeometric(1);
        System.out.println("A circle "+ circle.toString());
        System.out.println("The colour is " + circle.getColour());
        System.out.println("The radius is " + circle.getRadius());
        System.out.println("The area is " + circle.getArea());
        System.out.println("The diameter is " + circle.getDiameter());

        RectangleFromGeometric rectangle = new RectangleFromGeometric(2, 4);
        System.out.println("\nA rectangle " + rectangle.toString());
        System.out.println("The area is " + rectangle.getArea());
        System.out.println("The perimeter is " + rectangle.getPerimeter());
    }
}
