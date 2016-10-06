package ge.sangu.paata;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 201 on 10/6/2016.
 */
public class ListTest {

    public static void main(String[] args) {
        List<String> sia = new ArrayList<String>();
        sia.add("paata");
        sia.add("giorgi");
        sia.add("kukusha");
        sia.remove(1);
        for (int i = 0; i < sia.size(); i++) {
            System.out.println(sia.get(i));
        }
        for (String s: sia) {
            System.out.println(s);
        }

        // დავალება: ზემოთ მოყვანილი ორი ცუდი მეთოდის ნაცვლად გააკეთეთ ეკრანზე სიის ბეჭდვა
        // უფრო ელეგანტური მეთოდით. არ გამოიყენოთ System.out.println(sia); ბრძანება

    }

}
