package ge.sangu.nikoloz.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by Nikoloz on 11/7/2016.
 */
public class Davaleba6_SortStudents {

    public static  void main(String[] args) {

        ArrayList<Davaleba6_Student> students = new ArrayList<Davaleba6_Student>();
        ArrayList<Davaleba6_Student> sortedStudents = new ArrayList<Davaleba6_Student>();

        Davaleba6_Student student1 = new Davaleba6_Student();
        Davaleba6_Student student2 = new Davaleba6_Student();
        Davaleba6_Student student3 = new Davaleba6_Student();
        Davaleba6_Student student4 = new Davaleba6_Student();

        student1.setName("Levan"); //5
        student1.setSurName("Abzianidze"); //10
        student1.setScore(85);

        student2.setName("Mancho"); //6
        student2.setSurName("Revazishvili"); //12
        student2.setScore(67);

        student3.setName("Lela"); //4
        student3.setSurName("Gogradze"); //8
        student3.setScore(82);

        student4.setName("Zura"); //4
        student4.setSurName("Gorgadze");//8
        student4.setScore(98);


        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        System.out.println("---Before Sort---");

        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).getName());
        }

        Collections.sort(students, new Comparator<Davaleba6_Student>() {
            @Override
            public int compare(Davaleba6_Student o1, Davaleba6_Student o2) {
                if (o1.countName()>o2.countName()) {
                    return -1;
                }
                if (o1.countName()==o2.countName())
                    if (o1.countSurname()>o2.countSurname()){
                        return -1;

                    }
                    else if (o1.countSurname()==o2.countSurname())
                    {
                        if (o1.getScore()>o2.getScore())
                            return -1;
                    }

                return 0;
            }
        });

        System.out.println("---After Sort---");

        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).getName());
        }

}
}