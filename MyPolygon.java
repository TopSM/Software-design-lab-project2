package project.pkg2;
import javafx.scene.canvas.GraphicsContext;

public class MyPolygon extends MyShape{
    
   private final double myLength;
   private final double numSides; 
   private final double[] xPoints;     
   private final double[] yPoints;
   private double angle;
   private double perimeter;
   private double area;
   
    /*
     * @param xP
     * @param yP
     * @param myLength
     * @param numSides
     *
*/
    //MODIFYING MEMBER METHODS
    public MyPolygon(double xP, double yP, double numSides,double myLength){       
       super(xP,yP);
       this.yPoints = new double[10];
       this.xPoints = new double[10];
       this.myLength=myLength;
       this.numSides= numSides;
   }
    public double getAreaNum(){
       area =1.72046677*Math.pow(myLength,2);
       return area;
    }
    public double getPerimeterNum(){
       perimeter =  myLength*numSides;
       return perimeter;
    }
    public double getAngle(){
       angle= (numSides-2)*180 / numSides;
       return angle;
    }
    public double getSide(){
        return myLength;
    }
    public double[] arrayX(double xCenter){

       double radAngle;
       xPoints[0]=xCenter+myLength;
       radAngle=((2*Math.PI/5));

       for(int i = 1; i<numSides;i++){
            xPoints[i]= xCenter+(myLength*Math.cos(radAngle*i));
       }
       return xPoints;
    }
    public double[] arrayY (double yCenter){
       
       double radAngle;
       yPoints[0]=yCenter;
       radAngle=(2*Math.PI/5);
       
       for(int i = 1; i<numSides;i++){
            yPoints[i]= yCenter+(myLength*Math.sin(radAngle*i));
       }
       return yPoints;
    }   
    
    //OVERRIDDEN METHODS
    @Override
    public String toString(){
       return String.format("Polygon Length: %s \n Sides: %s Area: %s\nAngle %s\n",getSide(), numSides,getArea(),getAngle()); 
    }
    @Override
    public void draw(GraphicsContext gc)
    {/*
        arrayX(x);
        arrayY(y);
        System.out.printf("%s\n", this);
        gc.fillPolygon(xPoints, yPoints, 5);*/ 
    }
    @Override
    public String getPerimeter() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public String getArea() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

