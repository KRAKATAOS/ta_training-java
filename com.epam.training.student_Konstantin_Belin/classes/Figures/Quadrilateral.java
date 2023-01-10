package classes.Figures;

public class Quadrilateral extends Figure {
    Point a, b, c, d;
    double length1, length2, length3, length4, length5;

    public Quadrilateral(Point a, Point b, Point c, Point d) {

        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    private double length3() {
        double xDistanceSquare = Math.pow(c.getX() - d.getX(), 2.0);
        double yDistanceSquare = Math.pow(c.getY() - d.getY(), 2.0);
        return Math.sqrt(xDistanceSquare + yDistanceSquare);
    }

    private double length2() {
        double xDistanceSquare = Math.pow(b.getX() - c.getX(), 2.0);
        double yDistanceSquare = Math.pow(b.getY() - c.getY(), 2.0);
        return Math.sqrt(xDistanceSquare + yDistanceSquare);
    }

    private double length1() {
        double xDistanceSquare = Math.pow(a.getX() - b.getX(), 2.0);
        double yDistanceSquare = Math.pow(a.getY() - b.getY(), 2.0);
        return Math.sqrt(xDistanceSquare + yDistanceSquare);
    }
    private double length4() {
        double xDistanceSquare = Math.pow(a.getX() - d.getX(), 2.0);
        double yDistanceSquare = Math.pow(a.getY() - d.getY(), 2.0);
        return Math.sqrt(xDistanceSquare + yDistanceSquare);
    }
    private double length5() {
        double xDistanceSquare = Math.pow(b.getX() - d.getX(), 2.0);
        double yDistanceSquare = Math.pow(b.getY() - d.getY(), 2.0);
        return Math.sqrt(xDistanceSquare + yDistanceSquare);
    }

    @Override
    public double area() {

        length1 = length1();
        length2 = length2();
        length3 = length3();
        length4 = length4();
        length5 = length5();


        double s1 = (length1 + length4 + length5) / 2;
        double s2 = (length2 + length3 + length5) / 2;
        return  Math.sqrt(s1 * (s1 - length1) * (s1 - length4) * (s1 - length5)) + Math.sqrt(s2 * (s2 - length2) * (s2 - length3) * (s2 - length5));
    }
    @Override
    public String pointsToString() {
        return "(" + a.getX() + "," + a.getY() + ")" + "(" + b.getX() + "," + b.getY() + ")" + "(" + c.getX() + "," + c.getY() + ")"+ "(" + d.getX() + "," + d.getY() + ")";
    }

    public String toString() {
        return this.getClass().getSimpleName() + "[" + pointsToString() + "]";
    }

    @Override
    public Point leftmostPoint() {
        if (a.getX()  <= b.getX() && a.getX() <= c.getX() && a.getX() <= d.getX())
            return a;
        if (b.getX()  <= a.getX() && b.getX() <= c.getX() && b.getX() <= d.getX())
            return b;
        if (c.getX()  <= a.getX() && c.getX() <= b.getX() && c.getX() <= d.getX())
            return c;
        if (d.getX()  <= a.getX() && d.getX() <= b.getX() && d.getX() <= c.getX())
            return d;
        return null;
    }
}