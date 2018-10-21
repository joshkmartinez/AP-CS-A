/*
 * Lesson 17 Coding Activity 1
 * Write a program that will input a list of test scores in from the keyboard. 
 * When the user enters -1, print the average.
 * 
 * What do you need to be careful about when using -1 to stop a loop?
 * 
 *     Sample Run:
 *         Enter the Scores:
 *         45
 *         100
 *         -1
 *
 *         The average is: 72.5
 * 
 * 
 */ 

import java.util.Scanner;
import java.lang.Math; 

class Lesson_17_Activity_One {
    public static void main(String[] args)
     {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter the Scores:");
      double x = 0;
      int y = -1;
      double z = 0;
      while(x != -1){
        x = scan.nextDouble();
        y++;
        z += x;
        System.out.println(x);
    } x++;
    System.out.println(" ");
    double w = (double)(z+1)/y;
    System.out.println("The average is: " + w);
}
}