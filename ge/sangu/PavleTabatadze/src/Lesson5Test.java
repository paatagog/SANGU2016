import java.util.Date;

/**
 * Created by pavle on 12/5/2016.
 */
public class Lesson5Test {
    private static Lesson5Student L5S= new Lesson5Student();
    public static void main(String[] args) {
        L5S.setSaxeli("Pavle");
        L5S.setGvari("Tabatadze");
        L5S.setAsaki(21);

        L5S.datovaQveyana();
        L5S.shemovidaQveyanashi();
    }
}
