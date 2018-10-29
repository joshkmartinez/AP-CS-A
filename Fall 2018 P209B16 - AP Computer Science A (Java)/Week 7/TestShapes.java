import java.util.Scanner;

public class TestShapes
{
    public static void main( String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        Circle c1 = new Circle (6.28);
        Rectangle r1 = new Rectangle (2, 4);
        Ngon n1 = new Ngon( 4, 1);
        
        System.out.println("The circle has a radius of: " + c1.getRadius());
        System.out.println("The reactnagle has an area of: " + r1.area());
        
        System.out.println("How many sides should the n-gon have?");
        int sides = scan.nextInt();
        n1.setSides(sides);
        System.out.println("The n-gon has " + n1.getSides() + " sides");
    }
}