package ge.sangu.paata;

/**
 * Created by 201 on 10/27/2016.
 */
public class ColorRectangle extends Rectangle {

    public ColorRectangle(int color) {
        this.color = color;
    }

    public ColorRectangle() {

    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    private int color;
}
