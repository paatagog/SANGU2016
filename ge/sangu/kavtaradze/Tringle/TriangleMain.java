package ge.sangu.kavtaradze.Tringle;

/**
 * Created by guga on 26.10.2016.
 */
public class TriangleMain {
    public static void main(String[] args) {
        Triangle t = new Triangle();

        t.setAx(0);
        t.setAy(0);
        t.setBx(0);
        t.setBy(3);
        t.setCx(4);
        t.setCy(0);

        System.out.println("Area of tringle:  " + t.getAreaOfTringle());
    }
}
