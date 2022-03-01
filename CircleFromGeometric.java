package com.esther.wk05;

import static java.lang.Math.pow;

//Extends: (subclass) inherits from (superclass)
public class CircleFromGeometric extends GeometricObject{
    private double radius;

    public CircleFromGeometric(){

    }

    public CircleFromGeometric(double radius){

    }

    public CircleFromGeometric(double radius, String colour, boolean filled){

    }

    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getArea(){
        double area  = Math.PI * pow(this.radius, 2);
        return area;
    }
    public double getPerimeter(){
        double perimeter = Math.PI * 2 * this.radius;
        return perimeter;
    }

    public double getDiameter(){
        return (2*this.radius);
    }

    public void printCircle(){
    }


}
