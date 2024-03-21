package baitap2;

public class Point2D {
    private float x;
    private float y;
    public Point2D(float x,float y){
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y){
        this.x = x;
        this.y = y;

    }
    public float[] getXY(float x,float y){
        float [] arr = {x,y};
        return arr;
    }

    @Override
    public String toString() {
        return String.format("gia tri x la: %f | gia tri y la: %f",getX(),getY());
    }
}
