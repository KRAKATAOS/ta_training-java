package classes.FiguresExtraMaster;

class Quadrilateral extends Figure {
    Point a, b, c, d;
    double length1, length2, length3, length4, length5;


    public Quadrilateral(Point a, Point b, Point c, Point d) {

        if (a == null || b == null || c == null || d == null){
            throw new IllegalArgumentException();
        }
        if ((a.getX() == b.getX() && a.getX() == d.getX() && c.getX() == b.getX() && c.getX() == d.getX()) || ((a.getY() == b.getY() && a.getY() == d.getY() && c.getY() == b.getY()&& c.getY() == d.getY())))
            throw new IllegalArgumentException("The points must differ");

        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;

        //Degenerative check
        if (this.area() < 1E-6){
            throw new IllegalArgumentException();
        }

        //Convex check
        Triangle q_1_tmp_check = new Triangle(a, b, c);
        Triangle q_2_tmp_check = new Triangle(a, c, d);
        Triangle q_3_tmp_check = new Triangle(a, b, d);
        Triangle q_4_tmp_check = new Triangle(b, d, c);
        if (    ( Math.abs(this.area() - q_1_tmp_check.area()) < 1E-6 ) ||
                ( Math.abs(this.area() - q_2_tmp_check.area()) < 1E-6 ) ||
                ( Math.abs(this.area() - q_3_tmp_check.area()) < 1E-6 ) ||
                ( Math.abs(this.area() - q_4_tmp_check.area()) < 1E-6 ) ){
            throw new IllegalArgumentException();
        }

        //Order check
        double A;
        double B = -1;
        double C;
        // a - b order check
        if ( !(Math.abs(a.getX() - b.getX()) < 1E-6) ){
            A = (a.getY() - b.getY() ) / ( a.getX() - b.getX() );
            C = a.getY() - A * a.getX();
            if ((A * c.getX() + B * c.getY() + C) * (A * d.getX() + B * d.getY() + C) < 0 ){
                throw new IllegalArgumentException();
            }
        }
        // d - a order check
        if ( !(Math.abs(a.getX() - d.getX()) < 1E-6) ){
            A = (a.getY() - d.getY() ) / ( a.getX() - d.getX() );
            C = a.getY() - A * a.getX();
            if ((A * b.getX() + B * b.getY() + C) * (A * c.getX() + B * c.getY() + C) < 0 ){
                throw new IllegalArgumentException();
            }
        }
        // b - c order check
        if ( !(Math.abs(b.getX() - c.getX()) < 1E-6) ){
            A = (b.getY() - c.getY() ) / ( b.getX() - c.getX() );
            C = b.getY() - A * b.getX();
            if ((A * a.getX() + B * a.getY() + C) * (A * d.getX() + B * d.getY() + C) < 0 ){
                throw new IllegalArgumentException();
            }
        }
        // c - d order check
        if ( !(Math.abs(c.getX() - d.getX()) < 1E-6) ){
            A = (c.getY() - d.getY() ) / ( c.getX() - d.getX() );
            C = c.getY() - A * c.getX();
            if ((A * a.getX() + B * a.getY() + C) * (A * b.getX() + B * b.getY() + C) < 0 ){
                throw new IllegalArgumentException();
            }
        }
    }



    public double area() {

        Triangle q_1_tmp = new Triangle(a, b, c);
        Triangle q_2_tmp = new Triangle(a, c, d);
        Triangle q_3_tmp = new Triangle(a, b, d);
        Triangle q_4_tmp = new Triangle(b, d, c);
        return ( q_1_tmp.area() + q_2_tmp.area() + q_3_tmp.area() + q_4_tmp.area() ) / 2;

    }

    @Override
    public Point centroid() {
        double C;
        double B = -1;
        double A;
        double center_x;
        double center_y;
        Triangle one;
        Triangle two;
        Point mid_one;
        Point mid_two;
        if ( !(Math.abs(a.getX() - b.getX()) < 1E-6) ){
            A = (a.getY() - b.getY() ) / ( a.getX() - b.getX() );
            C = a.getY() - A * a.getX();
            if ((A * c.getX() + B * c.getY() + C) * (A * d.getX() + B * d.getY() + C) < 0 ){
                one = new Triangle(a, b, c);
                two = new Triangle(a, b, d);
                mid_one = one.centroid();
                mid_two = two.centroid();


                center_x = ( ( mid_one.getX() * one.area() ) + ( mid_two.getX() * two.area() )) / this.area();
                center_y = ( ( mid_one.getY() * one.area() ) + ( mid_two.getY() * two.area() )) / this.area();
                return (new Point(center_x, center_y));
            }
        }

        if ( !(Math.abs(a.getX() - c.getX()) < 1E-6) ) {
            A = (a.getY() - c.getY() ) / ( a.getX() - c.getX() );
            C = a.getY() - A * a.getX();
            if ((A * b.getX() + B * b.getY() + C) * (A * d.getX() + B * d.getY() + C) < 0 ){
                one = new Triangle(a, c, b);
                two = new Triangle(a, c, d);
                mid_one = one.centroid();
                mid_two = two.centroid();


                center_x = ( ( mid_one.getX() * one.area() ) + ( mid_two.getX() * two.area() )) / this.area();
                center_y = ( ( mid_one.getY() * one.area() ) + ( mid_two.getY() * two.area() )) / this.area();
                return (new Point(center_x, center_y));
            }
        }

        if ( !(Math.abs(a.getX() - d.getX()) < 1E-6) ){
            A = (a.getY() - d.getY() ) / ( a.getX() - d.getX() );
            C = a.getY() - A * a.getX();
            if ((A * b.getX() + B * b.getY() + C) * (A * c.getX() + B * c.getY() + C) < 0 ){
                one = new Triangle(a, d, c);
                two = new Triangle(a, d, b);
                mid_one = one.centroid();
                mid_two = two.centroid();


                center_x = ( ( mid_one.getX() * one.area() ) + ( mid_two.getX() * two.area() )) / this.area();
                center_y = ( ( mid_one.getY() * one.area() ) + ( mid_two.getY() * two.area() )) / this.area();
                return (new Point(center_x, center_y));
            }
        }

        if ( !(Math.abs(b.getX() - c.getX()) < 1E-6) ){
            A = (b.getY() - c.getY() ) / ( b.getX() - c.getX() );
            C = b.getY() - A * b.getX();
            if ((A * a.getX() + B * a.getY() + C) * (A * d.getX() + B * d.getY() + C) < 0 ){
                one = new Triangle(b, c, a);
                two = new Triangle(b, c, d);
                mid_one = one.centroid();
                mid_two = two.centroid();


                center_x = ( ( mid_one.getX() * one.area() ) + ( mid_two.getX() * two.area() )) / this.area();
                center_y = ( ( mid_one.getY() * one.area() ) + ( mid_two.getY() * two.area() )) / this.area();
                return (new Point(center_x, center_y));
            }
        }

        if ( !(Math.abs(b.getX() - d.getX()) < 1E-6) ){
            A = (b.getY() - d.getY() ) / ( b.getX() - d.getX() );
            C = b.getY() - A * b.getX();
            if ((A * a.getX() + B * a.getY() + C) * (A * c.getX() + B * c.getY() + C) < 0 ){
                one = new Triangle(b, d, a);
                two = new Triangle(b, d, c);
                mid_one = one.centroid();
                mid_two = two.centroid();


                center_x = ( ( mid_one.getX() * one.area() ) + ( mid_two.getX() * two.area() )) / this.area();
                center_y = ( ( mid_one.getY() * one.area() ) + ( mid_two.getY() * two.area() )) / this.area();
                return (new Point(center_x, center_y));
            }
        }

        A = (c.getY() - d.getY() ) / ( c.getX() - d.getX() );
        C = c.getY() - A * c.getX();
        one = new Triangle(c, d, a);
        two = new Triangle(c, d, b);
        mid_one = one.centroid();
        mid_two = two.centroid();


        center_x = ( ( mid_one.getX() * one.area() ) + ( mid_two.getX() * two.area() )) / this.area();
        center_y = ( ( mid_one.getY() * one.area() ) + ( mid_two.getY() * two.area() )) / this.area();
        return (new Point(center_x, center_y));

    }
    public boolean pointsAreTheSame (Point a, Point b) {
        double errorDelta = 0.00005;
        boolean sameX = Math.abs(a.getX() - b.getX()) < errorDelta;
        boolean sameY = Math.abs(a.getY() - b.getY()) < errorDelta;
        return sameX && sameY;
    }

    @Override
    public boolean isTheSame(Figure figure) {

        if(figure instanceof Quadrilateral){
            double errorDelta = 0.00005;



            Point A = ((Quadrilateral) figure).a;
            Point B = ((Quadrilateral) figure).b;
            Point C = ((Quadrilateral) figure).c;
            Point D = ((Quadrilateral) figure).d;

            if (a.same(A) && b.same(B) && c.same(C) && d.same(D)) return true;
            if (a.same(A) && b.same(B) && c.same(D) && d.same(C)) return true;
            if (a.same(A) && b.same(C) && c.same(B) && d.same(D)) return true;
            if (a.same(A) && b.same(C) && c.same(D) && d.same(B)) return true;
            if (a.same(A) && b.same(D) && c.same(B) && d.same(C)) return true;
            if (a.same(A) && b.same(D) && c.same(C) && d.same(B)) return true;

            if (a.same(B) && b.same(A) && c.same(C) && d.same(D)) return true;
            if (a.same(B) && b.same(A) && c.same(D) && d.same(C)) return true;
            if (a.same(B) && b.same(C) && c.same(A) && d.same(D)) return true;
            if (a.same(B) && b.same(C) && c.same(D) && d.same(A)) return true;
            if (a.same(B) && b.same(D) && c.same(A) && d.same(C)) return true;
            if (a.same(B) && b.same(D) && c.same(C) && d.same(A)) return true;

            if (a.same(C) && b.same(B) && c.same(D) && d.same(A)) return true;
            if (a.same(C) && b.same(B) && c.same(A) && d.same(D)) return true;
            if (a.same(C) && b.same(A) && c.same(B) && d.same(D)) return true;
            if (a.same(C) && b.same(A) && c.same(D) && d.same(B)) return true;
            if (a.same(C) && b.same(D) && c.same(A) && d.same(B)) return true;
            if (a.same(C) && b.same(D) && c.same(B) && d.same(A)) return true;

            if (a.same(D) && b.same(B) && c.same(C) && d.same(A)) return true;
            if (a.same(D) && b.same(B) && c.same(A) && d.same(C)) return true;
            if (a.same(D) && b.same(A) && c.same(C) && d.same(B)) return true;
            if (a.same(D) && b.same(A) && c.same(B) && d.same(C)) return true;
            if (a.same(D) && b.same(C) && c.same(A) && d.same(B)) return true;
            if (a.same(D) && b.same(C) && c.same(B) && d.same(A)) return true;

            return false;

        }

        return false;
    }
}
