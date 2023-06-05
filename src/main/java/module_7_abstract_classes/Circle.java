package module_7_abstract_classes;

public class Circle extends Figure {

    Point center;
    long radius;

    public Circle(Point center, long radius){
        this.center = center;
        this.radius = radius;
    }

    @Override
    public double area(){
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public String pointsToString(){
        return center.toString();
    }
}
