package baitap2;

public class Point3D extends Point2D {
    private float z;

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public Point3D (float z, float x, float y ){
        super(x,y);
        this.z= z;

    }
    public void setXYZ (float z){
        this.z= z;
    }
    public float[] arr1 (float x,float y,float z){
        float[] arr1 = {x,y,z};
        return arr1;
    }

    @Override
    public String toString() {
        return String.format("gia tri x la : %.2f | gia tri y la : %.2f | gia tri z la: %.2f",
               getX(),getY(),getZ());
    }
}
