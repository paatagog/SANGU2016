package ge.sangu.kavtaradze.sort;

import ge.sangu.paata.sort.Ship;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Guga on 11/7/2016.
 */
public class SortTest {
    public static void main(String[] args) {
        List<Student > students = new ArrayList<Student>(Arrays.asList(
                new Student("guga", "astamidzeee", 93),
                new Student("natia", "bostoghanashvili", 100),
                new Student("nika", "astamidzeee", 89),
                new Student("madona", "beshkenadze", 81),
                new Student("ani", "chikhladze", 100),
                new Student("tamazi", "beshkenadze", 70)));

        StudentComparator studentComparator = new StudentComparator();
        Collections.sort(students, studentComparator);

        System.out.println(students);
    }
}
