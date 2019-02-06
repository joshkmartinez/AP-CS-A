import java.util.Scanner;
import java.lang.Math;

class Lesson_10_Activity {
    public static void main(String[] args) {
      
      Scanner scan = new Scanner(System.in);
      System.out.println("Please enter two decimal values");
      double x = scan.nextDouble();
      double y = scan.nextDouble();
      
       int temp1 = (int)Math.round(1000 * x);
       int temp2 = (int)Math.round(1000 * y); 
       
       System.out.println("The difference is: " + (double)(temp1-temp2)/1000); // and here

    }
} 