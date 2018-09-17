/*
 * Lesson 3 Coding Activity Question 2
 * 
 * Write a program that asks the user for three names, then prints the names in reverse order.
 * 
 * Sample Run:

Please enter three names:
Zoey 
Zeb 
Zena 

Zena Zeb Zoey

*/

import java.util.Scanner;
import java.lang.Math;

class Lesson_3_Activity_Two {
    public static void main(String[] args) {
      
        /* Write your code here 
         * Copy and paste your entire code to Code Runner to complete the activity, 
         * from the first import statement to the last bracket. 
        */
Scanner scan = new Scanner (System.in);
 
          String one;
          String two;
          String three;
 
          System.out.println("Please enter three names");
          one = scan.nextLine();
          two = scan.nextLine();
          three = scan.nextLine();
          System.out.println(three +" " + two+" " + one);
      

    }
}