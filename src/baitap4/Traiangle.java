package baitap4;

import baitap1.Main;

public class Traiangle  extends  Shape{
    private double side1;
    private double side2;
    private  double side3;
    public Traiangle(double side1,double side2,double side3){
        this.side1 =side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
    public  double getArea(){
        double area = (side1 + side2 + side3)/2;
        return Math.sqrt(area*(area - side1)*(area - side2)* (area - side3));
    }
    public  double getPerimeter(){
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        return String.format("cac canh tam giac chu vi:  \n canh 1: %f \n canh 2: %f \n canh 3: %f \n lấy chu vi %f  \n lấy diện tích %f",
                side1,side2,side3,getPerimeter(),getArea());
    }
}
