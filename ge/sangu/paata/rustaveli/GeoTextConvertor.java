package ge.sangu.paata.rustaveli;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

/**
 * Created by 201 on 10/18/2016.
 */
public class GeoTextConvertor {

    public static final int GEO_UNICODE_BEGIN = 0x10D0;
    public static final int GEO_UNICODE_MTAVRULI_BEGIN = 0x10A0;

    public static List<String> eng = new ArrayList<String>(Arrays.asList("a", "b", "g", "d", "e", "v", "z", "T", "i", "k", "l", "m", "n", "o", "p", "J", "r", "s", "t", "u", "f", "q", "R", "y", "S", "C", "c", "Z", "w", "W", "x", "j", "h"));

    public static String getGeoUnicodeChar(int i) {
        return String.valueOf((char) (GEO_UNICODE_BEGIN + i));
    }

    public static String getGeoUnicodeCharMtavruli(int i) {
        return String.valueOf((char) (GEO_UNICODE_MTAVRULI_BEGIN + i));
    }

    public static String engToUtf(String text) {
        if (text == null) {
            return null;
        }

        for (int i = 0; i < eng.size(); i++) {
            text = text.replaceAll(eng.get(i), getGeoUnicodeChar(i));
        }

        return text;
    }

    public static String utfToEng(String text) {
        if (text == null) {
            return null;
        }

        for (int i = 0; i < eng.size(); i++) {
            text = text.replaceAll(String.valueOf((char) (0x10D0 + i)), eng.get(i));
        }

        return text;
    }

    public static void main(String[] args) {
    }

}
