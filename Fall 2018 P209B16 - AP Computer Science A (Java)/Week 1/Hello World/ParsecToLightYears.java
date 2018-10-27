import java.util.Scanner;
public class ParsecToLightYears
{
    public static void main(String[] args)
{
        Scanner input = new Scanner (System.in);
        System.out.println("Enter a distance in parsecs:   ");
        double par =  input.nextDouble();
        double light = par * 3.26156;
        System.out.println(par + " parsecs is equivalent to "+light+" light years");
}
}