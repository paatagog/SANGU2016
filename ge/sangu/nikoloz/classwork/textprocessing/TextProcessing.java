package ge.sangu.nikoloz.classwork;

import java.net.URI;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nikoloz on 10/13/2016.
 */
public class TextProcessing {
    public static void main(String[] args) {

        String fileName = "./1.txt";
        List<String> parsedText = new ArrayList<>();
        try {
            URI uri = TextProcessing.class.getResource(fileName).toURI();
            List<String> striqonebi = Files.readAllLines(Paths.get(uri),
                    Charset.defaultCharset());

//            for (String line : striqonebi) {
//                System.out.println(line);
//            }

            int strofi=1;
            for (int i = 0; i < striqonebi.size(); i++) {

                if (striqonebi.get(i).contains(Integer.toString(strofi)))
                {
                    strofi++;
                    parsedText.add(striqonebi.get(i+1));
                    parsedText.add(striqonebi.get(i+2));
                    parsedText.add(striqonebi.get(i+3));
                    parsedText.add(striqonebi.get(i+4));
                    i+=4;
                }

            }

            for (String line : parsedText) {
                System.out.println(line);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
