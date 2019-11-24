package project.pkg2;
import javafx.scene.canvas.GraphicsContext;
public class MyRectangle extends MyShape{
    
    private final double width;
    private final double height;

    //MODIFYING MEMBER METHODS
    public MyRectangle(double xp, double yp, double w, double h){
        super(xp,yp);
        width = w;
        height= h;
    }
    //RETURN METHODS
    public double getWidth(){ return width; }
    public double getHeight(){ return height; }    
    //OVERRIDEN METHODS
    @Override
    public String toString() {
      return String.format("Rectangle\nWidth: %s\nHeight:  %s", getWidth(),getHeight());
    }
    @Override
    public void draw(GraphicsContext gc) {
        System.out.printf("%s\n",this);
        gc.fillRect(getX(),getY(),getWidth(), getHeight());
    }
    @Override
    public String getPerimeter() {
        double plength=getHeight();
        double pwidth=getWidth();
        double perimeter_rect;
        perimeter_rect= plength*2+pwidth*2;
        return String.format("the perimeter of this rectangle is: %s",perimeter_rect);
    }
    @Override
    public String getArea() {
        double plength=getHeight();
        double pwidth=getWidth();
        double area_rect;
        area_rect= plength*pwidth;
        return String.format("the perimeter of this rectangle is: %s",area_rect);
    }

    
}
