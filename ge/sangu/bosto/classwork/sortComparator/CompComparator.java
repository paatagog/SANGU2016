package ge.sangu.bosto.classwork.sortComparator;

import java.util.Comparator;

/**
 * Created by 201 on 11/3/2016.
 * შედარება ხდება ტიპის, ზომისა და სახელის მიხედვით.
 * პირველ რიგში მოდის სამგზავრო ხომალდები, შემდეგ სატვირთოები და ბოლოს სამხედროები.
 */
public class CompComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Computer s1 = (Computer)o1;
        Computer s2 = (Computer)o2;
        if (s1.getProcessorType() != s2.getProcessorType()) {
            return s1.getProcessorType().ordinal() - s2.getProcessorType().ordinal();
        }
        if (s1.getCompNumber() != s2.getCompNumber()) {
            return (int) (s1.getCompNumber() - s2.getCompNumber());
        }
        return s1.getOperatingSystem().compareTo(s2.getOperatingSystem());

    }
}
