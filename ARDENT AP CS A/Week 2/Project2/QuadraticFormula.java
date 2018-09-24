import java.util.Scanner;
public class QuadraticFormula
{
    public static void main(String[] args)
{
        Scanner input = new Scanner (System.in);
        System.out.println("Enter a:   ");
        double a =  input.nextDouble();
        System.out.println("Enter b:   ");
        double b =  input.nextDouble();
        System.out.println("Enter c:   ");
        double c =  input.nextDouble();
        
        
        
        double x1 = (-b + Math.sqrt((b*b) -(4*a*c)))/(2*a);
        double x2 = (-b - Math.sqrt((b*b) -(4*a*c)))/(2*a);
                
        System.out.println("Answer is: " + x1 +" and/or " +x2);
        //NaN = not a number
}
}