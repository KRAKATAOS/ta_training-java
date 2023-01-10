package classes.Figures;

public class Circle extends Figure {

    private final Point a;

    private final double radius;


    public Circle(Point a, double radius) {
        this.a = a;
        this.radius=radius;

    }


    @Override
    public double area() {
        return Math.PI * Math.pow(radius,2);
    }
    @Override
    public String pointsToString() {
        return "(" + a.getX() + "," + a.getY() + ")"  ;
    }

    public String toString() {
        return this.getClass().getSimpleName() + "[" + pointsToString() +  radius + "]";
    }
    @Override
    public Point leftmostPoint() {

        return new Point(a.getX() - radius, a.getY());
    }
}
