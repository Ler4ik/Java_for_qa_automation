package module_5_classes.triangle;

import java.util.Scanner;

import static java.lang.Math.abs;

public class Main {

    //Solution for exercise 5.10.2

    public static void main (String[] args){

        Scanner in = new Scanner(System.in);

        int x1 = in.nextInt();
        int y1 = in.nextInt();
        int x2 = in.nextInt();
        int y2 = in.nextInt();
        int x3 = in.nextInt();
        int y3 = in.nextInt();

        Triangle myTriangle = new Triangle(new Point(x1, y1), new Point(x2, y2),new Point(x3, y3));

        if(myTriangle.isCorrect()){
            System.out.println(myTriangle.area());
        } else {
            System.out.println("Треугольник не существует");
        }
    }
}

class Triangle {
    Point a, b, c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double area() {
        double s;
        s = 0.5 * abs((b.getX() - a.getX())*(c.getY() - a.getY()) - (c.getX() - a.getX())*(b.getY() - a.getY()));
        return s;
    }

    public boolean isCorrect(){

        double A = Math.sqrt((a.getX() - b.getX()) * (a.getX() - b.getX()) + (a.getY() - b.getY()) * (a.getY() - b.getY()));
        double B = Math.sqrt((b.getX() - c.getX()) * (b.getX() - c.getX()) + (b.getY() - c.getY()) * (b.getY() - c.getY()));
        double C = Math.sqrt((a.getX() - c.getX()) * (a.getX() - c.getX()) + (a.getY() - c.getY()) * (a.getY() - c.getY()));

        double s = 0.5 * abs((b.getX() - a.getX())*(c.getY() - a.getY()) - (c.getX() - a.getX())*(b.getY() - a.getY()));

        if((((A + B) < C) || ((A + C) < B) || ((B + C) < A)) || s == 0){
            return false;
        }
        return true;
    }
}

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
}
