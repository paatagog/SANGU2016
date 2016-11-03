package ge.sangu.paata.sort;

/**
 * Created by 201 on 11/3/2016.
 */
public class Ship {
    private String name;
    private double length;
    private ShipType type;

    public Ship(String name, double length, ShipType type) {
        this.name = name;
        this.length = length;
        this.type = type;
    }

    public String toString() {
        return "(" + name + ", " + length + ", " + type + ")";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public ShipType getType() {
        return type;
    }

    public void setType(ShipType type) {
        this.type = type;
    }
}
