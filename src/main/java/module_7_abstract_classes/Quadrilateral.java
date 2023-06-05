package module_7_abstract_classes;

public class Quadrilateral extends Figure {

    private Point apex1, apex2, apex3, apex4;

    public Quadrilateral(Point apex1, Point apex2, Point apex3, Point apex4){
        this.apex1 = apex1;
        this.apex2 = apex2;
        this.apex3 = apex3;
        this.apex4 = apex4;
    }

    @Override
    public double area(){
       Triangle tr1 = new Triangle(apex1,apex2,apex3);
       Triangle tr2 = new Triangle(apex1,apex3,apex4);
       return tr1.area() + tr2.area();
    }

    @Override
    public String pointsToString(){
        return apex1.toString() + apex2.toString() + apex3.toString() + apex4.toString();
    }
}
