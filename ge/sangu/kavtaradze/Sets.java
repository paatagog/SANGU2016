package ge.sangu.kavtaradze;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Guga on 10/17/2016.
 */
public class Sets {
    public static void main(String[] args) {
        List<String> firstList = new ArrayList<String>(Arrays.asList("guga", "natia", "temuri", "nika", "giorgi"));
        List<String> secondList = new ArrayList<String>(Arrays.asList("guga", "natia", "nino", "paata", "vaja", "sopi"));
        Set<String> set = new HashSet<String>();

        set.addAll(firstList);
        set.addAll(secondList);


        System.out.println(set);

    }
}
