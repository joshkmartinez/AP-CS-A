
import java.util.Scanner;

class Lesson_12_Activity_Three {
    public static void main(String[] args)
     {
      Scanner scan = new Scanner (System.in);
     System.out.println("Enter a test score:");
     double a = scan.nextDouble();
     if (a <= 100){
     System.out.println ("Valid");
     if (a >= 0)
     System.out.println("Valid");
     }

     if ( a > 100){
       System.out.println ("Not Valid");}
     if ( a < 0){
     System.out.println("Not Valid");
     }
    }
    }