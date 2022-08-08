public class Point2D {

    private float x=0.0f;
    private float y=0.0f;

    //float Araa []={x,y};

     public Point2D(float x,float y){
         this.x=x;
         this.y=y;

     }

     public Point2D(){}

    public float getX() {
        return x;
    }


    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float x,float y) {
        this.y = y;
    }



    public void setXY(float x,float y) {

         this.x=x;
        this.y = y;
    }

    public float getXY() {
        float [] Araa ={x,y};
         return Araa[2];

    }

    @Override
    public String toString() {

         return "(x,y)";
    }



    public static void main(String[] args){





    }



}
