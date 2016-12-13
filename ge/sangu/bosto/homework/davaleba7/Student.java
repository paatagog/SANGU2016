package ge.sangu.bosto.homework.davaleba7;

import java.util.Date;

/**
 * Created by 201 on 11/29/2016.
 */
public class Student {
    private String saxeli, gvari;
    private Date birthDate;
    private long id, facultyId;

    public String getSaxeli() {
        return saxeli;
    }

    public String getGvari() {
        return gvari;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public long getFacultyId() {
        return facultyId;
    }

    public void setSaxeli(String saxeli) {
        this.saxeli = saxeli;
    }

    public void setGvari(String gvari) {
        this.gvari = gvari;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setFacultyId(int facultyId) {
        this.facultyId = facultyId;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
