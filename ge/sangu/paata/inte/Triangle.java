package ge.sangu.paata.inte;

import ge.sangu.paata.*;

import java.util.Random;

/**
 * Created by 201 on 11/1/2016.
 */
public class Triangle implements Shape {

    public Triangle() {
        System.out.println("იქმნება სამკუთხედი");
    }

    public void paint() {
        System.out.println("იხატება სამკუთხედი");
    }

    public void move(double x, double y) {
        System.out.println("გადაადგილება: " + x + "; " + y);
    }

    public void rotate(double alpha) {
        System.out.println("შემოტრიალება: " + alpha);
    }

    public boolean intersects() {
        Random rand = new Random();
        int r = rand.nextInt(2);
        return r!=0;
    }
}
