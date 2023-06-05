package module_7_abstract_classes;

import static java.lang.Math.abs;

public class Triangle extends Figure{

    private Point apex1, apex2, apex3;

    public Triangle(Point apex1, Point apex2, Point apex3){
        this.apex1 = apex1;
        this.apex2 = apex2;
        this.apex3 = apex3;
    }

    @Override
    public double area(){
       return 0.5 * abs((apex2.getX() - apex1.getX()) * (apex3.getY() - apex1.getY())
               - (apex3.getX() - apex1.getX()) * (apex2.getY() - apex1.getY()));
    }

    @Override
    public String pointsToString(){
        return apex1.toString() + apex2.toString() + apex3.toString();
    }

}
