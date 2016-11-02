package ge.sangu.kavtaradze;

import java.net.URI;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Guga on 11/2/2016.
 */
public class StudentsId {
    public static List<String> processingList(List<String> list){
        List<String> idList = new ArrayList<>();

        for (String line : list) {
            String id = line.replaceAll("[^0-9]+", " ");
            idList.add(Arrays.asList(id.trim().split(" ")).get(0));
        }
        return idList;
    }
    public static void main(String[] args) {
        try {
            URI uri1 = StudentsId.class.getResource("./studentsData/data1.txt").toURI();
            URI uri2 = StudentsId.class.getResource("./studentsData/data2.txt").toURI();

            List<String> file1 = Files.readAllLines(Paths.get(uri1), Charset.defaultCharset());
            List<String> file2 = Files.readAllLines(Paths.get(uri2), Charset.defaultCharset());
            List<String> idNumbers = new ArrayList<>();

            idNumbers.addAll(processingList(file1));
            idNumbers.addAll(processingList(file2));
            System.out.println(idNumbers);

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
