public class Point3D  extends Point2D{


    private float z =0.0f;


    public Point3D(float x, float y,float z ){
        super();
        this.z=z;
    }
    public Point3D(){}

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x,float y,float z) {

        this.getX();
        this.getY();
        this.getZ();

    }
    public float getXYZ() {
        float y;
        float x;
        float [] Araa = {x,y,z};
        return Araa[3];
    }

    @Override
    public String toString() {
        return "(x,y,z)";
    }
}
