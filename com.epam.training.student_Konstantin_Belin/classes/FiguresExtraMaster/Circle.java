package classes.FiguresExtraMaster;

class Circle extends Figure{
    private final Point a;

    private final double radius;


    public Circle(Point a, double radius) {
        this.a = a;
        this.radius=radius;
        if ( radius <= 0 ) {
            throw new IllegalArgumentException();
        }
        if (a == null) {
            throw new IllegalArgumentException();
        }

        if (this.area() < 1E-6){
            throw new IllegalArgumentException();
        }


    }



    public double area() {
        return Math.PI * Math.pow(radius,2);
    }
    @Override
    public Point centroid() {
        return new Point(a.getX(), a.getY());
    }

    @Override
    public boolean isTheSame(Figure figure) {


        if(figure instanceof Circle){
            double errorDelta = 0.00005;

            Circle circle = (Circle)figure;

            boolean sameRadius = Math.abs(radius - circle.radius) < errorDelta;
            boolean sameXCenter = Math.abs(a.getX()-circle.a.getX()) < errorDelta;
            boolean sameYCenter = Math.abs(a.getY()-circle.a.getY()) < errorDelta;

            if(sameRadius && sameXCenter && sameYCenter){
                return true;
            }
        }
        return false;



    }

}