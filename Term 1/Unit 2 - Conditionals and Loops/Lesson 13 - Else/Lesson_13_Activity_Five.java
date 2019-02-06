/*
 * Lesson 13 Coding Activity 5 
 * Create a program to let the user practice their multiplication tables.
 * Print two random integers between 1 and 12 each on a new line. 
 * Then, ask the user to input the multiplication of the two numbers. 
 * If they enter the correct product print "Correct!" otherwise print "Wrong".
 */


import java.util.Scanner;
import java.util.Random;


class Lesson_13_Activity_Five {
    public static void main(String[] args)
     {
   
Scanner scan = new Scanner (System.in);
//Random rand = new Random();

int  y = (int)(Math.random() * 12) + 1;
int  x = (int)(Math.random() * 12) + 1;

int n = (x*y);

System.out.println(x + "*" + y);

System.out.println("Enter the answer:");
     int m = scan.nextInt();
     

if (m == n)
  System.out.println("Correct!");
else 
  System.out.println("Wrong");
  

      
    }
}