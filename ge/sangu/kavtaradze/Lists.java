package ge.sangu.kavtaradze;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Guga on 10/17/2016.
 */
public class Lists {
    public static void main(String[] args) {
        List<String> firstList = new ArrayList<String>(Arrays.asList("guga", "natia", "temuri", "nika", "giorgi"));
        List<String> secondList = new ArrayList<String>(Arrays.asList("guga", "natia", "nino", "paata", "vaja", "sopi"));
        List<String> newList = new ArrayList<String>();
        List<String> answerList = new ArrayList<String>();

        newList.addAll(firstList);
        newList.addAll(secondList);

        for (String item : newList) {
            if (!answerList.contains(item))
                answerList.add(item);
        }

        System.out.println(answerList);

    }
}
