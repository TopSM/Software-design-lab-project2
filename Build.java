package project.pkg2;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import java.util.Random;
import javafx.geometry.BoundingBox;

public class Build {
    
   public Build(){}
   public void buildLine(GraphicsContext gc,double xp, double yp, double xEnd, double yEnd){
       getColor(gc);
       MyShape line = new MyLine(xp,yp,xEnd,yEnd);  
       line.draw(gc);  
       line.getPoint(200, 300);
       line.distanceTo(200,300);
       line.getPerimeter();
       line.getArea();  
       System.out.println();
   }
   public void buildOval(GraphicsContext gc,double xp, double yp, double R1,double R2){
       getColor(gc);
       MyShape oval = new MyOval(xp,yp,R1,R2);
       oval.draw(gc);
       oval.getPoint(500,1);
       oval.distanceTo(500, 1);
       oval.getArea();
       oval.getPerimeter();
       System.out.println();
   }
   public void buildRectangle(GraphicsContext gc,double xp, double yp, double w, double h) {
       getColor(gc);
       MyShape rect = new MyRectangle(xp,yp,w,h);
       BoundingBox bb= new BoundingBox(xp,yp,w,h);
       rect.draw(gc);
       rect.getPoint(30,40);
       rect.distanceTo(30, 40);
       rect.getArea();
       rect.getPerimeter();
       rect.getBoundingbox(bb);
       System.out.println();
   }
   public int randomGenerator(){
       Random rgn = new Random();
       return rgn.nextInt(256);
   }
   public Color getColor(GraphicsContext gc){
       Color c=Color.rgb(randomGenerator(),randomGenerator(),randomGenerator());
       gc.setFill(c);
       gc.setStroke(c);
       return c;
   }
   
}
