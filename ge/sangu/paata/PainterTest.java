package ge.sangu.paata;

import ge.sangu.kavtaradze.Tringle.Triangle;

/**
 * Created by 201 on 10/27/2016.
 */
public class PainterTest {
    public void paint(Shape shape) {
        shape.paint();
    }

    public static void main(String[] args) {
        PainterTest ps = new PainterTest();
        Rectangle r = new Rectangle();
        Triangle t = new Triangle();
        ps.paint(r);
        ps.paint(t);
        System.out.println(1);
    }
}
