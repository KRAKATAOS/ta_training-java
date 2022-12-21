package com.epam.training.student_Konstantin_Belin.classes.Intersection;

public class Line {
    int k;
    int b;

    Line(int k, int b) {
        this.k = k;
        this.b = b;
    }

    Point intersection(Line line) {
        if (this.k == line.k) {
            return null;
        }
        int x = (line.b - this.b) / (this.k - line.k);
        int y = this.k * x + this.b;

        return new Point(x,y);
    }

}
