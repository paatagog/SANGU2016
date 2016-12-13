package ge.sangu.bosto.homework.davaleba7;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 201 on 11/29/2016.
 */
public class ExcelManager {

    public List<Student> getStudentsList(String filename){

        //TODO must be implemented
        List<Student> studentsList = new ArrayList<Student>();

        return studentsList;
    }

    public List<Faculty> getFacultyList(String filename) {

        //TODO must be implemented
        List<Faculty> facultyList = new ArrayList<Faculty>();

        return facultyList;
    }

    public List<String> writeToExcel(List<DisplayStudent> fList){

        try {
            FileInputStream fis = new FileInputStream("С:/users/201/Desktop/.xls");
            HSSFWorkbook wb = new HSSFWorkbook(fis);

            HSSFSheet sheet = wb.createSheet("Sheet1");


        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

}
