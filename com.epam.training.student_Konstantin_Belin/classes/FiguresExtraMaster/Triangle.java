package classes.FiguresExtraMaster;

class Triangle extends Figure {
    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        if (a == null || b == null || c == null)
            throw new IllegalArgumentException("Arguments can't be null");
        if ((a.getX() == b.getX() && a.getX() == c.getX() && b.getX() == c.getX() ) || ((a.getY() == b.getY() && a.getY() == c.getY() && b.getY() == c.getY())))
            throw new IllegalArgumentException("The points must differ");
        if (((a.getX()-c.getX()) / (b.getX()-c.getX()))==((a.getY()-c.getY()) / (b.getY()-c.getY())))
            throw new IllegalArgumentException("The points must differ");

        this.a = a;
        this.b = b;
        this.c = c;

        if (this.area() < 1E-6){
            throw new RuntimeException();
        }
    }


    public double area() {
        double area = (a.getX() * (b.getY() - c.getY()) +
                b.getX() * (c.getY() - a.getY()) + c.getX() * (a.getY() - b.getY())) / 2.0;
        return Math.abs(area);
    }

    @Override
    public Point centroid() {
        double xc= ((a.getX()+b.getX()+c.getX())/3);
        double yc= ((a.getY()+b.getY()+c.getY())/3);
        return new Point(xc, yc);
    }

    @Override
    public boolean isTheSame(Figure figure) {
        return (a.getX() == b.getX() && a.getX() == c.getX() && b.getX() == c.getX()) ||
                ((a.getY() == b.getY() && a.getY() == c.getY() && b.getY() == c.getY()));
    }

}