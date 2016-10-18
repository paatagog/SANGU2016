package ge.sangu.paata.rustaveli;

import java.io.IOException;
import java.net.URI;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 201 on 10/18/2016.
 */
public class StatisticTest {
    public static void main(String[] args) {
        try {

            URI uri = StatisticTest.class.getResource("./data/data.txt").toURI();
            List<String> striqonebi = Files.readAllLines(Paths.get(uri), Charset.defaultCharset());
            List<String> striqonebiUtf = new ArrayList<String>();

            for (String item : striqonebi) {
                striqonebiUtf.add(GeoTextConvertor.engToUtf(item));
            }


            TextProcessing tp = new TextProcessing();

            for (String item : tp.removeGarbage(striqonebiUtf)) {
                System.out.println(item);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
