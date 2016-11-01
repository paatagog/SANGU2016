package ge.sangu.paata.inte;

public interface Shape {
	void paint();
	boolean intersects();
	void rotate(double alpha);
	void move(double x, double y);
}