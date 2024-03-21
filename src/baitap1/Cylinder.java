package baitap1;

public class Cylinder extends Circle  {
    private double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public  Cylinder(double height, double radius, String color){
        super(radius,color);
        this.height = height;

    }
    public double getVolume(){
        return getArea() * height;
    }

    @Override
    public String toString() {
        return String.format("| dien tich = %.2f | mau = %s | chieu dai %f |",
                getRadius(),getColor(),getHeight());
    }
}
