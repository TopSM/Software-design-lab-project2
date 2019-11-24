package project.pkg2;
import javafx.scene.canvas.*;
import javafx.scene.paint.Color;

public class MyCircle extends MyOval{
    
    private double myArea;
    private double myCircum;
    private Color C;
    
    public MyCircle( double xP, double yP,double myRadius, Color C){
        super(xP,yP,myRadius,myRadius); 
        myArea=0;
        myCircum=0;
    }
    public double getAreaNum(){
        myArea=Math.PI*Math.pow((getRadius()/2), 2);
        return myArea;
    }
    public double getPerimeterNum(){
        myCircum=2*Math.PI*(getRadius()/2);
        return myCircum;
    }
    public double getRadius(){    
        return getXRadius();
    }    
    @Override
    public String toString(){
        return String.format("Circle\nArea: %s\nPerimeter: %s\nRadius: %s\n",getArea(),getPerimeter(),getRadius());
    }
    @Override
    public void draw(GraphicsContext gc){
        System.out.printf("%s\n",this);
        gc.fillOval(getX(), getY(), getRadius(), getRadius());
    }
}
