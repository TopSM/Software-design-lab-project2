package project.pkg2;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.geometry.BoundingBox;

abstract public class MyShape implements MyShapePositionInterface{
    private double Xnum;
    private double Ynum;
    //MODIFYING MEMBER METHODS
    public MyShape(double Xnum, double Ynum){
        this.Xnum = Xnum;
        this.Ynum = Ynum;
    }   
    public void setX(double newX){ Xnum = newX;  }
    public void setY(double newY){ Ynum = newY; }
    public void setColor(GraphicsContext gc,Color C){
        gc.setFill(C);
        gc.setStroke(C);
    }
    public void ShiftXY(int x, int y){
        Xnum+=x;
        Ynum+=y;
    }
    //RETURN METHODS
    public double getX(){ return Xnum; }
    public double getY(){ return Ynum; }

    //ABSTRACT MEMBER METHODS
    public abstract void draw(GraphicsContext gc);
    //IMPLEMENTED OVERRIDEN ABSTRACT METHODS

    @Override
    public boolean doOverlap(BoundingBox mr,BoundingBox mo){

        if(  mo.intersects(mr)){
            System.out.println("yes they overlap");
        }
        return mo.intersects(mr);
    }
    @Override
    public void distanceTo(double x, double y){
        double dx, dy,distance;
        dx=Math.abs(x-getX());
        dy=Math.abs(y-getY());
        distance = Math.sqrt(Math.pow(dx,2)+Math.pow(dy, 2));
        System.out.println("Distace from center to ("+x+","+y+") is "+distance );
    }
    @Override
    public void getPoint(double x, double y){
        System.out.println("Point ("+x+","+y+")");
    }
    @Override
    public void getBoundingbox(BoundingBox mr){
        Class c = mr.getClass();
        System.out.println(c);
        System.out.println("the bounding box is "+mr.getWidth()+", "+mr.getHeight());
    }
    @Override
    public void moveTo(double x, double y){
        x+=getX();
        y+=getY();
    }
    //NON-IMPLEMENTED OVERRIDEN ABSTRACT METHODS
    @Override
    public abstract String getPerimeter();
    @Override
    public abstract String getArea();
    @Override
    public abstract String toString();


}

