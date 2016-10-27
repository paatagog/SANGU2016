package ge.sangu.paata;

/**
 * Created by 201 on 10/25/2016.
 */
public class Rectangle {

    private double ax;
    private double ay;
    private double bx;
    private double by;
    private double cx;
    private double cy;
    private double dx;
    private double dy;

    private double d(double ax, double ay, double bx, double by) {
        return Math.sqrt(Math.pow(ax-bx, 2) + Math.pow(ay-by, 2));
    }

    public double perimeter() {
        return d(ax, ay, bx, by) + d(bx, by, cx, cy) + d(cx, cy, dx, dy) + d(dx, dy, ax, ay);
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

    public double getDx() {
        return dx;
    }

    public void setDx(double dx) {
        this.dx = dx;
    }

    public double getDy() {
        return dy;
    }

    public void setDy(double dy) {
        this.dy = dy;
    }

    public double getAx() {
        return ax;
    }

    public void setAx(double ax) {
        this.ax = ax;
    }

    public double getBy() {
        return by;
    }

    public void setBy(double by) {
        this.by = by;
    }

}
