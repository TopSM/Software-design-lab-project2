package project.pkg2;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.*;
import javafx.scene.paint.Color;
import java.util.Scanner;
import javafx.geometry.BoundingBox;

public class Project2 extends Application {
    @Override
    public void start(Stage primaryStage) {
        System.out.println("enter x-axis for canvas");
        Scanner input = new Scanner(System.in);
        double convert = input.nextInt();
        double xcanvas = convert;
        while (true){
            System.out.println("enter y-axis for canvas");
            input = new Scanner(System.in);            
            convert= input.nextInt();
            if(convert<xcanvas) break;
            else{ System.out.println("choose a bigger y-axis than the x-axis");}
        }
        double ycanvas =convert;
        Group root = new Group();
        Scene s = new Scene(root, xcanvas, ycanvas,Color.WHITE);
        Canvas canvas = new Canvas(xcanvas,ycanvas);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        
        root.getChildren().add(canvas);
        
        Build newb = new Build();
        double xcenter =xcanvas/2;
        double ycenter = ycanvas/2;

        double xlength = xcanvas*1.2;
        double ylength =ycanvas*1.2;
        int i=0;
        System.out.println("how many ovals do you want?");
        input = new Scanner(System.in);
        convert = input.nextInt();
        System.out.println();
        
        BoundingBox bb1;
        BoundingBox bb2;
        MyShape msr= new MyRectangle(0,0,0,0);
        while(i<=convert){            
            xlength = xlength/Math.sqrt(2);
            ylength =ylength/Math.sqrt(2);
            newb.buildRectangle(gc, xcenter-xlength/2, ycenter-ylength/2,xlength, ylength);
            newb.buildOval(gc, xcenter-xlength/2, ycenter-ylength/2,xlength, ylength);
            bb1 = new BoundingBox(xcenter-xlength/2, ycenter-ylength/2,xlength, ylength);
            bb2 = new BoundingBox(xcenter-xlength/2, ycenter-ylength/2,xlength, ylength);
            msr.doOverlap(bb1, bb2);
            i++;
        }        
        newb.buildLine(gc,1,1,xcanvas,ycanvas);
        
        primaryStage.setTitle("Ostavo Palacios Project  #2");
        primaryStage.setScene(s);
        primaryStage.show();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
} 
