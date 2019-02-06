
import java.io.*;
import static java.lang.System.*;

import java.util.Scanner;

class Lesson_11_Activity_Four{


     public static void main (String str[]) throws IOException {
System.out.println("Enter a Number:");
       Scanner scan = new Scanner (System.in);
       int num = scan.nextInt();
       
       if ((num % 2 )== 0){
       System.out.println("Even");
       }else{System.out.println("Odd");
       }

     }

}


