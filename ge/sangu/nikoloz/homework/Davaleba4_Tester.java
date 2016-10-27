package ge.sangu.nikoloz.homework;

/**
 * Created by Nikoloz on 10/25/2016.
 */
public class Davaleba4_Tester {
    public static void main(String[] args) {
        Davaleba4_Tringle tringle = new Davaleba4_Tringle();
        tringle.setAx(1);
        tringle.setAy(1);
        tringle.setBx(4);
        tringle.setBy(3);
        tringle.setCx(2);
        tringle.setCy(7);

        System.out.println("Triangle Perimeter: " + tringle.GetPerimeter());
        System.out.println("Triangle Area: " + tringle.GetArea());

    }
}
