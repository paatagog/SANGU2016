package ge.sangu.paata.inte;

/**
 * Created by 201 on 11/1/2016.
 */
public class GameEngine {

    public void init(Shape shape1, Shape shape2) {
        shape1.paint();
        shape2.paint();
    }

    public void move(Shape shape, double x, double y) {
        shape.move(x, y);
    }

    public void rotate(Shape shape, double alpha) {
        shape.rotate(alpha);
    }

    public boolean intersects(Shape shape) {
        return shape.intersects();
    }

}
