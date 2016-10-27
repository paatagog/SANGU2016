package ge.sangu.paata;

/**
 * Created by 201 on 10/25/2016.
 */
public class ClassTest {
    public static void main(String[] args) {
        Rectangle r =  new Rectangle();
        r.setAx(4.5);
        r.setAy(4.5);
        r.setBx(4.5);
        r.setBy(4.5);
        r.setCx(4.5);
        r.setCy(4.5);
        r.setDx(4.5);
        r.setDy(7.5);
        System.out.println(r.perimeter());
    }
}
