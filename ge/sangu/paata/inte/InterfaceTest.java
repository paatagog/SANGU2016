package ge.sangu.paata.inte;

/**
 * Created by 201 on 11/1/2016.
 */
public class InterfaceTest {
    public static void main(String[] args) {
        GameEngine ge = new GameEngine();
        Triangle triangle = new Triangle();
        Rectangle rectangle = new Rectangle();
        ge.init(triangle, rectangle);
    }
}
