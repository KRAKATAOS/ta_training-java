package classes.Figures;

class Triangle extends Figure {
    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        double area = (a.getX() * (b.getY() - c.getY()) +
                b.getX() * (c.getY() - a.getY()) + c.getX() * (a.getY() - b.getY())) / 2.0;
        return Math.abs(area);
    }

    @Override
    public String pointsToString() {
        return "(" + a.getX() + "," + a.getY() + ")" + "(" + b.getX() + "," + b.getY() + ")" + "(" + c.getX() + "," + c.getY() + ")";
    }

    public String toString() {
        return this.getClass().getSimpleName() + "[" + pointsToString() + "]";
    }

    @Override
    public Point leftmostPoint() {

        if (a.getX()  <= b.getX() && a.getX() <= c.getX())
            return a;
        if (b.getX()  <= a.getX() && b.getX() <= c.getX())
            return b;
        if (c.getX()  <= b.getX() && c.getX() <= a.getX())
            return c;
        return null;
    }
}