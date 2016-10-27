package ge.sangu.kavtaradze.Tringle;

/**
 * Created by guga on 26.10.2016.
 */
public class Triangle {

    private double ax, ay;
    private double bx, by;
    private double cx, cy;

    public double getAx() {
        return ax;
    }

    public double getAy() {
        return ay;
    }

    public double getBx() {
        return bx;
    }

    public double getBy() {
        return by;
    }

    public double getCx() {
        return cx;
    }

    public double getCy() {
        return cy;
    }
    public void setAx(double ax) {
        this.ax = ax;
    }

    public void setAy(double ay) {
        this.ay = ay;
    }

    public void setBx(double bx) {
        this.bx = bx;
    }

    public void setBy(double by) {
        this.by = by;
    }

    public void setCx(double cx) {
        this.cx = cx;
    }

    public void setCy(double cy) {
        this.cy = cy;
    }

    private double getDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt((x1 - x2)*(x1 - x2) + (y1 - y2)*(y1 - y2));
    }

    public double getAreaOfTringle() {
        double a = getDistance(ax, ay, bx, by);
        double b = getDistance(ax, ay, cx, cy);
        double c = getDistance(bx, by, cx, cy);
        double p = (a + b + c) / 2;


        return Math.sqrt( p*(p - a)*(p - b)*(p-c) );
    }
}
