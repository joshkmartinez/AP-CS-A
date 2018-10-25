import java.util.Scanner;
public class Methods
{
    public static void print(String s)
    {
        System.out.println(s);
    }
    
    public static double MilesToKm(double miles)
    {
        double km = miles * 1.6;
        return km;
    }
    
    public static double ParsecsToLightYears(double parsecs)
    {
        return parsecs * 3.26;
    }
    
    public static double salesTax(double cost, double taxPercent)
    {
        taxPercent = taxPercent/100.0;
        return cost + (cost * taxPercent);
    }
    
    public static int[] multArray(int[] array, int multVal)
    {
        int[] solution = new int[array.length];
        for (int i = 0; i <= array.length; i++)
        {
            solution[i] = array[i] * multVal;
        }
        return solution;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a distance in miles:");
        double miles = scan.nextDouble();
        System.out.println("That distance in km is:" + MilesToKm(miles));
        
        System.out.println("Enter a distance in parsecs");
        double parsecs = scan.nextDouble();
        double ly = ParsecsToLightYears(parsecs);
        print("That distance in light years is " + ly);
        
        System.out.println("Enter the total cost: ");
        double cost = scan.nextDouble();
        print("Enter the sales tax percentage (without % sign)");
        double tax = scan.nextDouble();
        double total = salesTax(cost, tax);
        print("The total cost with sales tax is " + total);
        
        System.out.println("Enter a integer multiplier value: ");
        int multVal = scan.nextInt();
        int[] values = new int[]{1,2,3,4,6,9};
        int[] newArray = multArray(values, multVal);
        for (int i = 0; i <= values.length; i++)
        { print(newArray[i] + " ");
        }
        
    }
}
