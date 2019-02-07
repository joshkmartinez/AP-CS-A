import java.util.Scanner;
public class DistanceConverter
{
    public static void main(String[] args)
{
        Scanner input = new Scanner (System.in);
        System.out.println("Please enter a distance in miles:   ");
        double miles =  input.nextDouble();
        Double km = miles * 1.609344;
        System.out.println(miles + " miles is kilometers:  "+km);
}
}