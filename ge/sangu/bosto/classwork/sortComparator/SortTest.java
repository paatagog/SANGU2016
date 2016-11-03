package ge.sangu.bosto.classwork.sortComparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by 201 on 11/3/2016.
 */
public class SortTest {

    public static void main(String[] args) {
        List<Computer> comps = new ArrayList<Computer>(Arrays.asList(
                new Computer("Windows 10", 27,  CompType.DUAL_CORE),
                new Computer("Windows 7",  29,  CompType.INTEL_I5),
                new Computer("Windows 8",  40,  CompType.INTEL_I7),
                new Computer("Linux",      33,  CompType.INTEL_I7),
                new Computer("Ubuntu",     11,  CompType.INTEL_I5)));
        CompComparator compComparator = new CompComparator();
        Collections.sort(comps, compComparator);
        System.out.println(comps);
    }
}
