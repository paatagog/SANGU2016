package ge.sangu.kavtaradze;

import ge.sangu.paata.rustaveli.StatisticTest;

import java.net.URI;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by guga on 25.10.2016.
 */
public class statistic {
    public static void main(String[] args) {
        try {

            URI uri = StatisticTest.class.getResource("./data/vefxistkaosani.txt").toURI();
            List<String> striqonebi = Files.readAllLines(Paths.get(uri), Charset.defaultCharset());

            System.out.println(striqonebi.size());


        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
