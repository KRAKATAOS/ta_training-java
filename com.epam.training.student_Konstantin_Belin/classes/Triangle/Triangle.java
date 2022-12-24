package com.epam.training.student_Konstantin_Belin.classes.Triangle;

class Triangle {

    Point a, b, c;
    double length1, length2, length3;

    public Triangle(Point a, Point b, Point c) {
        if (a == null || b == null || c == null)
            throw new IllegalArgumentException("Arguments can't be null");
        if (((length1+length2) < length3) || ((length1+length3) < length2) || ((length2+length3) <  length1))
            throw new IllegalArgumentException("Triangle is degenerative");
        if ((a.getX() == b.getX() && a.getX() == c.getX() && b.getX() == c.getX() ) || ((a.getY() == b.getY() && a.getY() == c.getY() && b.getY() == c.getY())))
            throw new IllegalArgumentException("The points must differ");
        if (((a.getX()-c.getX()) / (b.getX()-c.getX()))==((a.getY()-c.getY()) / (b.getY()-c.getY())))
            throw new IllegalArgumentException("The points must differ");


        this.a = a;
        this.b = b;
        this.c = c;
    }

    private double length3() {
        double xDistanceSquare = Math.pow(c.getX() - b.getX(), 2.0);
        double yDistanceSquare = Math.pow(c.getY() - b.getY(), 2.0);
        return Math.sqrt(xDistanceSquare + yDistanceSquare);
    }

    private double length2() {
        double xDistanceSquare = Math.pow(a.getX() - c.getX(), 2.0);
        double yDistanceSquare = Math.pow(a.getY() - c.getY(), 2.0);
        return Math.sqrt(xDistanceSquare + yDistanceSquare);
    }

    private double length1() {
        double xDistanceSquare = Math.pow(a.getX() - b.getX(), 2.0);
        double yDistanceSquare = Math.pow(a.getY() - b.getY(), 2.0);
        return Math.sqrt(xDistanceSquare + yDistanceSquare);
    }

    public double area() {

        length1 = length1();
        length2 = length2();
        length3 = length3();
        double s = (length1 + length2 + length3) / 2;
        return Math.sqrt(s * (s - length1) * (s - length2) * (s - length3));
    }
    public Point centroid(){
        double xc= (((a.getX()+b.getX()+c.getX())/3));
        double yc= (((a.getY()+b.getY()+c.getY())/3));
        return new Point(xc, yc);
    }

}
