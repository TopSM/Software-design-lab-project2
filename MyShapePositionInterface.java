package project.pkg2;
import javafx.geometry.BoundingBox;

public interface MyShapePositionInterface extends MyPositionInterface,MyShapeInterface {
    public abstract void getBoundingbox(BoundingBox mr);
    public abstract boolean doOverlap(BoundingBox mr,BoundingBox mo);
}
