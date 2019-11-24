package project.pkg2;
import javafx.scene.canvas.GraphicsContext;

public class MyOval extends MyShape{
    
    private double myArea; 
    private double myCircum;
    private final double myXRadius;
    private final double myYRadius;
    
    //MODIFYING MEMBER METHODS
    public MyOval(double xp, double yp,double length,double width){
        super(xp, yp);
        myYRadius= width;
        myXRadius= length;
        myArea=0;
        myCircum=0;        
    }    
    //RETURN MEMBER METHODS
    public double getXRadius(){
        return myXRadius;
    }
    public double getYRadius(){
        return myYRadius;
    }
    public double ovalArea(){
        double plength=getXRadius();
        double pwidth=getYRadius();        
        myArea=Math.PI*pwidth*plength;
        return myArea;
    }
    public double ovalPerimeter(){
        double plength=myXRadius/2;
        double pwidth=myYRadius/2;        
        myCircum= 2*Math.PI*(Math.sqrt((Math.pow(plength, 2)+Math.pow(pwidth,2))/2));
        return myCircum;
    }
    //OVERRIDEN METHODS
    @Override
    public String toString() {
        return String.format("Oval\nArea: %s\nPerimeter: %s\nRadiusX: %s\nRadiusY: %s",ovalArea(),ovalPerimeter(),getXRadius(),getYRadius());
    }
    @Override
    public void draw(GraphicsContext gc){
        System.out.printf("%s\n",this);
        gc.fillOval(getX(), getY(), getXRadius(), getYRadius());
    }

    @Override
    public String getPerimeter() {
        return String.format("the perimeter of this rectangle is: %s",ovalPerimeter());
    }
    @Override
    public String getArea() {
        return String.format("the perimeter of this rectangle is: %s",ovalArea());
    }

}
