import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
//import java.util.ArrayList;
public class Methodology {
    //method that converts farenheight to celcius 
    public static double FtoC(double fTemp) {
        double cTemp = (fTemp-32)*(5.0/9.0);
        return cTemp;
    }
    //method that converts celcius to kelvin
    public static double CtoK(double cTemp) {
        double kTemp = cTemp + 273.15;
        return kTemp;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a value to convert from farenheight to celcius: ");
        double input1 = scan.nextDouble();
        System.out.println(FtoC(input1));
        
        System.out.println("Enter a value to convert from celcius to kelvin: ");
        double input2 = scan.nextDouble();
        System.out.println(CtoK(input2));
    }
    }