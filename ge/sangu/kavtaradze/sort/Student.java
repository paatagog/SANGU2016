package ge.sangu.kavtaradze.sort;

/**
 * Created by Guga on 11/7/2016.
 */
public class Student {
    private String name;
    private String surname;
    private int point;

    public String toString() {
        return "(" + name + ", " + surname + ", " + point + ")";
    }

    public Student(String name, String surname, int point) {
        this.name = name;
        this.surname = surname;
        this.point = point;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getPoint() {
        return point;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPoint(int point) {
        this.point = point;
    }
}
