package ge.sangu.Nikoloz_Astamidze;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Nikoloz on 10/12/2016.
 */
public class Davaleba_2 {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        // List 1
        System.out.println("List 1:");
        for (int i = 0; i < Math.round(Math.random()*200); i++) {
            list1.add(i);
            System.out.println(i);
        }

        // List 2
        System.out.println("List 2:");
        for (int i = 0; i < Math.round(Math.random()*200); i++) {
            list2.add(i);
            System.out.println(i);
        }

        // Adding List 1 to List3
        list3.addAll(list1);
        
        //Checking List 3 VS List 2
        for (int i = 0; i < list2.size(); i++) {
            if (!list3.contains(list2.get(i)))
            {
                list3.add(list2.get(i));
                System.out.println("Added To List3: " + list2.get(i));
            }
        }
        // List 3
        System.out.println("List 3: ");
        for (int i = 0; i < list3.size(); i++) {
            System.out.println(list1.get(i));
        }









    }


}
