import java.util.Scanner;
public class TempConverter
{
    public static void main(String[] args)
{
        Scanner input = new Scanner (System.in);
        System.out.println("Please enter a temprature in fahrenheit:   ");
        double far =  input.nextDouble();
        double cel = (far - 32) * 5/9;
        System.out.println(far + "F is"+cel+"C");
}
}