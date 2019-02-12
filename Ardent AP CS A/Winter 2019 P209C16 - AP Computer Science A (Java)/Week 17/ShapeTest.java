import java.util.ArrayList;
public class ShapeTest{
    public static void main(String[] args){
        ArrayList<Shape> shapes = new ArrayList<Shape>();
        shapes.add(new Circle());
        shapes.add(new Circle(3));
        shapes.add(new Rectangle(3,9));
        for (Shape s: shapes){
            System.out.println(s);
        }
    }
}