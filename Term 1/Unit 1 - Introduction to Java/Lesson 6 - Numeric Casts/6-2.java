import java.util.Scanner;
import java.lang.Math;

class Lesson_6_Activity_Three {
public static void main(String[] args) {


      
     Scanner sc = new Scanner (System.in);
      
      System.out.println ("Please input a decimal number:");
      double numb1 = sc.nextDouble();
      double numb2 = (numb1 - (int)numb1)*100;
      System.out.println ("Answer: " + (int)numb2);


}
}