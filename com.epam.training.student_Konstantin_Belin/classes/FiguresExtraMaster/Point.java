package classes.FiguresExtraMaster;

class Point {
    private double x;
    private double y;

    public Point(final double x, final double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    public boolean same (Point a) {
        double errorDelta = 0.00005;
        boolean sameX = Math.abs(a.getX() - getX()) < errorDelta;
        boolean sameY = Math.abs(a.getY() - getY()) < errorDelta;
        return sameX && sameY;
    }

}
