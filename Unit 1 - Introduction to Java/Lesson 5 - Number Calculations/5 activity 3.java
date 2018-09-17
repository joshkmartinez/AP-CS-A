import java.util.Scanner;
import java.lang.Math;
class Lesson_5_Activity_Four {
    public static void main(String[] args) {
      
        Scanner scan = new Scanner (System.in);
       System.out.println ("Enter a price:");
       double x = scan.nextDouble();
       double y = 20;
       System.out.println ("Change from $20: " + "$"+(y-x));
    };};