package ge.sangu.paata.rustaveli;

import java.net.URI;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 201 on 10/13/2016.
 */
public class TextProcessing {

    public static void main(String[] args) {
        try {
            URI uri = TextProcessing.class.getResource("./data/data.txt").toURI();
            List<String> striqonebi = Files.readAllLines(Paths.get(uri), Charset.defaultCharset());

//            for (String item: striqonebi) {
//                System.out.println(item);
//            }

            List<String> strofebi = new ArrayList<String>();

            int strofi = 1;
            for (int i = 0; i < striqonebi.size(); i++) {
                if (striqonebi.get(i).trim().equals(String.valueOf(strofi))) {
                    System.out.println(1);
                    if (i + 4 < striqonebi.size() && striqonebi.get(i+1).length() > 30
                            && striqonebi.get(i + 2).length() > 30
                            && striqonebi.get(i + 3).length() > 30
                            && striqonebi.get(i + 4).length() > 30) {
                        i += 4;
                        strofi ++;
                        strofebi.add(String.valueOf(strofi));
                        strofebi.add(striqonebi.get(i + 1));
                        strofebi.add(striqonebi.get(i + 2));
                        strofebi.add(striqonebi.get(i + 3));
                        strofebi.add(striqonebi.get(i + 4));
                    }
                }
            }

            for (String item : strofebi) {
                System.out.println(item);
            }


        } catch (Exception ex) {
            System.out.println("Error occured");
        }
    }
}
