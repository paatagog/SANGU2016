package ge.sangu.bosto.homework;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by natia on 11/1/2016.
 */

public class Davaleba5 {

    public static List<Integer> fileToList(String file){

        BufferedReader br = null;
        String currentLine;
        int temp = 0;
        List<Integer> ids = new ArrayList<Integer>();

        try {

            br = new BufferedReader(new FileReader(file));
            String tempStr = "";
            while ((currentLine = br.readLine()) != null) {
                for (int i = 0; i < currentLine.length(); i++) {
                    if(currentLine.charAt(i)>='0' &&  currentLine.charAt(i)<= '9'){
                        tempStr+=currentLine.charAt(i);
                    }
                }
                temp = Integer.parseInt(tempStr);
                ids.add(temp);
                tempStr="";
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)br.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return ids;
    }


    public static void main(String[] args) {
        List<Integer> li = fileToList("C:\\Java\\Java\\src\\ge\\sangu\\bosto\\homework\\textFile1");
        li.addAll(fileToList("C:\\Java\\Java\\src\\ge\\sangu\\bosto\\homework\\textFile2"));
        System.out.println(li);
    }
}
