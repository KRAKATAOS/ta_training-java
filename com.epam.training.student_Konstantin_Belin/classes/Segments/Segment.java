package com.epam.training.student_Konstantin_Belin.classes.Segments;
import static java.lang.Math.abs;
import static java.lang.Math.sqrt;
import static java.lang.StrictMath.pow;

public class Segment {

    private final Point start;
    private final Point end;

    public Segment(Point start, Point end) {
        if (start == null || end == null)
            throw new IllegalArgumentException("Arguments can't be null");
        if (start.getX() == end.getX() && start.getY() == end.getY())
            throw new IllegalArgumentException("The points must differ");
        /*if (start == end)
            throw new IllegalArgumentException("cuchmeca");*/

        this.start = start;
        this.end = end;
    }

    double length() {
        double xDistanceSquare = Math.pow(start.getX() - end.getX(), 2);
        double yDistanceSquare = Math.pow(start.getY() - end.getY(), 2);
        return sqrt(xDistanceSquare + yDistanceSquare);
    }

    Point middle() {
        if (start == end){
            throw new IllegalArgumentException("cuchmeca");}
        else {
            return new Point( (start.getX() + end.getX()) / 2,
                    (start.getY() + end.getY()) / 2 );
        }
    }

    Point intersection(Segment another) {



        Point start2 = another.start;
        Point end2 = another.end;

        double t = ((((start.getX() - start2.getX()) * (start2.getY() - end2.getY()))
                - ((start.getY() - start2.getY()) * (start2.getX() - end2.getX())))
                / ((((start.getX() - end.getX()) * (start2.getY() - end2.getY()))
                - ((start.getY() - end.getY()) * (start2.getX() - end2.getX())))));

        double u = ((((start.getX() - start2.getX()) * (start.getY() - end.getY()))
                - ((start.getY() - start2.getY()) * (start.getX() - end.getX())))
                / ((((start.getX() - end.getX()) * (start2.getY() - end2.getY()))
                - ((start.getY() - end.getY()) * (start2.getX() - end2.getX())))));

        double x = (start.getX() + t * (end.getX() - start.getX()));
        double y = (start.getY() + t * (end.getY() - start.getY()));

        if (0.0 <= t && t <= 1.0 && 0.0 <= u && u <= 1.0) {
            return new Point(x, y);
        } else {
            return null;
        }


    }

}
