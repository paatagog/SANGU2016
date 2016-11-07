package ge.sangu.kavtaradze.sort;

import java.util.Comparator;

/**
 * Created by Guga on 11/7/2016.
 */
public class StudentComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Student s1 = (Student) o1;
        Student s2 = (Student) o2;
        if (s1.getName().length() != s2.getName().length()) {
            return s2.getName().length() - s1.getName().length();
        }
        if (s1.getSurname().length() != s2.getSurname().length()) {
            return s2.getSurname().length() - s1.getSurname().length();
        }
        return s2.getPoint() - s1.getPoint();

    }
}
