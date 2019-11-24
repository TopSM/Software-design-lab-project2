package project.pkg2;
import javafx.scene.canvas.*;

public class MyLine extends MyShape{
    
    private double length;
    private double angle;
    private final double x2;
    private final double y2; 
    
    //MODIFYING MEMBER METHODS
    public MyLine( double xP, double yP,double xend, double yend){
        super(xP,yP);
        x2=xend;
        y2=yend;
        length=0;
        angle=0;
    }
    public double getLength(){
        length=Math.sqrt(Math.pow((getX()-x2), 2)+ Math.pow(getY()-y2, 2));
        return length;
    }
    public double getxAngle(){
        angle=Math.tan((getY()-y2)/(getX()-x2));
        angle=Math.toDegrees(angle);
        return angle;
    }
    //OVERRIDEN MEMBER METHODS
    @Override
    public String toString(){
        return String.format("String\nLength: %s\nAngle to X: %s\n",getLength(),getxAngle());
    }
    @Override
    public void draw(GraphicsContext gc){
        System.out.printf("%s\n", this);
        gc.strokeLine( getX(),getY(), x2, y2);
    }
    @Override
    public String getPerimeter() {
        return String.format("Can only return the length which is: %s",getLength());
    }
    @Override
    public String getArea() {
       return String.format("there is no area for a line");
    }
}
