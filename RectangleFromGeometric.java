package com.esther.wk05;
//Extends: (subclass) inherits from (superclass)
public class RectangleFromGeometric extends GeometricObject {

    private double width;
    private double height;

    public RectangleFromGeometric(){

    }

    public RectangleFromGeometric(double width, double height){

    }

    public RectangleFromGeometric(double width, double height, String colour, boolean filled){

    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(){
        return (this.height * this.width);
    }

    public double getPerimeter(){
        return (2*(this.height + this.width));
    }
}
