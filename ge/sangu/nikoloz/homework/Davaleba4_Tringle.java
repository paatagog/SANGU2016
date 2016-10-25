package ge.sangu.nikoloz.homework;

/**
 * Created by Nikoloz on 10/25/2016.
 */
public class Davaleba4_Tringle {

    private double ax;
    private double ay;
    private double bx;
    private double by;
    private double cx;
    private double cy;

    private double a;
    private double b;
    private double c;



    private double distance(double ax, double ay, double bx, double by)
    {
        return Math.sqrt(Math.pow(ax-bx, 2) + Math.pow(ay-by,2));
    }

    private void CalculateSides()
    {
        a=distance(ax,ay,bx,by);
        b=distance(bx,by,cx,cy);
        c=distance(cx,cy,ax,ay);
    }

    public double GetPerimeter()
    {
        CalculateSides();
        return a + b + c;
    }

    public double GetArea()
    {
        double perimeter = GetPerimeter();
        return Math.sqrt(perimeter*(perimeter-a)*(perimeter-b)*(perimeter-c));
    }

    public double getAx() {
        return ax;
    }

    public void setAx(double ax) {
        this.ax = ax;
    }

    public double getAy() {
        return ay;
    }

    public void setAy(double ay) {
        this.ay = ay;
    }

    public double getBx() {
        return bx;
    }

    public void setBx(double bx) {
        this.bx = bx;
    }

    public double getBy() {
        return by;
    }

    public void setBy(double by) {
        this.by = by;
    }

    public double getCx() {
        return cx;
    }

    public void setCx(double cx) {
        this.cx = cx;
    }

    public double getCy() {
        return cy;
    }

    public void setCy(double cy) {
        this.cy = cy;
    }
}
