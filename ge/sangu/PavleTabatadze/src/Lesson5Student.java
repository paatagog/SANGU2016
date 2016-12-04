import java.util.Date;

/**
 * Created by pavle on 12/5/2016.
 */
public class Lesson5Student implements Lesson5Adamiani {
    private String saxeli;
    private String gvari;
    private int asaki;

    public int getAsaki() {
        return asaki;
    }

    public void setAsaki(int asaki) {
        this.asaki = asaki;
    }


    public String getSaxeli() {
        return saxeli;
    }

    public void setSaxeli(String saxeli) {
        this.saxeli = saxeli;
    }

    public String getGvari() {
        return gvari;
    }

    public void setGvari(String gvari) {
        this.gvari = gvari;
    }

    @Override
    public void datovaQveyana() {
    System.out.println("moqalaqe : " + this.saxeli + " " +this.gvari + " " +this.asaki +" - wlis"+ " gavida qveynidan");
    }

    @Override
    public void shemovidaQveyanashi() {
    System.out.println("moqalaqe : " + this.saxeli + " " +this.gvari + " "+this.asaki + " - wlis"+ " shemovida qveyanashi");
    }
}
