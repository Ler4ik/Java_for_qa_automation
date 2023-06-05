package module_7_abstract_classes;

public class Circle {

    Point center;
    long radius;

    public Circle(Point center, long radius){
        this.center = center;
        this.radius = radius;
    }

    public double area(){
        return 2 * Math.PI * this.radius;
    }

    public String pointsToString(){
        return center.toString();
    }
}
