package ge.sangu.paata.sort;

import java.util.Comparator;

/**
 * Created by 201 on 11/3/2016.
 * შედარება ხდება ტიპის, ზომისა და სახელის მიხედვით.
 * პირველ რიგში მოდის სამგზავრო ხომალდები, შემდეგ სატვირთოები და ბოლოს სამხედროები.
 */
public class ShipComparator implements Comparator {
//    public int compare(Ship s1, Ship s2) {
//        return 0;
//    }

    @Override
    public int compare(Object o1, Object o2) {
        Ship s1 = (Ship)o1;
        Ship s2 = (Ship)o2;
        if (s1.getType() != s2.getType()) {
            return s1.getType().ordinal() - s2.getType().ordinal();
        }
        if (s1.getLength() != s2.getLength()) {
            return (int) (s1.getLength() - s2.getLength());
        }
        return s1.getName().compareTo(s2.getName());

    }
}
