package com.esther.wk05;

import java.text.DecimalFormat;

public abstract class Shape {
    protected double dim1;
    protected double dim2;
    private static final DecimalFormat df = new DecimalFormat("0.00");
    public Shape(double dim1, double dim2){
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    public abstract double area();

    public static void main(String[] args){
        Rectangle r = new Rectangle(9,5);
        Triangle t = new Triangle(10,8);
        Circle c = new Circle(5,5);
        Ellipse e = new Ellipse(7,7);
        Square s = new Square(6,6);
        Shape figref; //doesn't create an object
        figref = r;
        System.out.println("Area is " + df.format(figref.area()));
        figref = t;
        System.out.println("Area is " + df.format(figref.area()));
        figref = c;
        System.out.println("Area is " + df.format(figref.area()));
        figref = e;
        System.out.println("Area is " + df.format(figref.area()));
        figref = s;
        System.out.println("Area is " + df.format(figref.area()));
    }
}

class Ellipse extends Shape {   //Try extends Circle
    public Ellipse(double dim1, double dim2){
        super(dim1, dim2);
    }
    public double area() {
        System.out.println("Inside Area for Ellipse.");
        double area = Math.PI * super.dim1 * super.dim2;
        return area;
    }
}
class Circle extends Shape {
    public Circle(double dim1, double dim2){
        super(dim1, dim2);
    }
    public double area() {
        System.out.println("Inside Area for Circle.");
        double area = Math.PI * super.dim1 * super.dim1;
        return area;
    }
}

class Rectangle extends Shape{
    public Rectangle(double dim1, double dim2){
        super(dim1, dim2);
    }
    public double area(){
        double area = super.dim1 * super.dim2;
        System.out.println("Inside Area for Rectangle.");
        return area;
    }
}

class Triangle extends Shape{
    public Triangle(double dim1, double dim2){
        super(dim1, dim2);
    }
    public double area(){
        System.out.println("Inside Area for Triangle.");
        double area = 0.5 * super.dim1 * super.dim2;
        return area;
    }
}

class Square extends Shape{
    public Square(double dim1, double dim2){
        super(dim1, dim2);
    }
    public double area(){
        System.out.println("Inside Area for Square.");
        double area = super.dim1 * super.dim2;
        return area;
    }
}




