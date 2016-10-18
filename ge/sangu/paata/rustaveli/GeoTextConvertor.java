package ge.sangu.paata.rustaveli;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

/**
 * Created by 201 on 10/18/2016.
 */
public class GeoTextConvertor {
    public static List<String> eng = new ArrayList<String>(Arrays.asList("a", "b", "g", "d", "e", "v", "z", "T", "i", "k", "l", "m", "n", "o", "p", "J", "r", "s", "t", "u", "f", "q", "R", "y", "S", "C", "c", "Z", "w", "W", "x", "j", "h"));
    public static List<String> utf = new ArrayList<String>(Arrays.asList("ა", "ბ", "გ", "დ", "ე", "ვ", "ზ", "თ", "ი", "კ", "ლ", "მ", "ნ", "ო", "პ", "ჟ", "რ", "ს", "ტ", "უ", "ფ", "ქ", "ღ", "ყ", "შ", "ჩ", "ც", "ძ", "წ", "ჭ", "ხ", "ჯ", "ჰ"));

    public static String engToUtf(String text) {
        if (text == null) {
            return null;
        }

        for (int i = 0; i < eng.size(); i++) {
            text = text.replaceAll(eng.get(i), utf.get(i));
        }

        return text;
    }

    public static String utfToEng(String text) {
        if (text == null) {
            return null;
        }

        for (int i = 0; i < eng.size(); i++) {
            text = text.replaceAll(utf.get(i), eng.get(i));
        }

        return text;
    }

    public static void main(String[] args) {
        System.out.println(utf);
    }

}
