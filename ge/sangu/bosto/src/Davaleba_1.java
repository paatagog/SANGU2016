import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by natia on 10/11/2016.
 */
public class Davaleba_1 {
    public static void main(String[] args) {

        List<String> list1 = new ArrayList<String>();
        List<String> list2 = new ArrayList<String>();
        List<String> list3 = new ArrayList<String>();
        Set<String> set = new HashSet<String>();

        list1.add("ani");
        list1.add("bani");
        list1.add("gani");
        list2.add("bani");
        list2.add("gani");
        list2.add("dani");

        //მესამე სიაში ჩაწერა პირველი ხერხით, გამოტანა ციკლით
        System.out.println("პირველი გზა: ");
        list3.addAll(list1);
        for (int i = 0; i < list2.size(); i++) {
            if(!list3.contains(list2.get(i))){
                list3.add(list2.get(i));
            }
        }

        for (int i = 0; i < list3.size(); i++) {
            System.out.println(list3.get(i));
        }

        //ჩაწერა სეტში, სიის ნაცვლად, გამოტანა პირდაპირ System.out.println(set);
        System.out.println("მეორე გზა: ");
        set.addAll(list1);
        for (String i : list2) set.add(i);

        System.out.println(set);

        System.out.println("გამოტანა მესამე გზით: ");

        //still trying to...

    }
}
