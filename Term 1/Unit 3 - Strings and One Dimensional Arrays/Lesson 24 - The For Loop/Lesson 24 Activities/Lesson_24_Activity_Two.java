/*
 * Lesson 24 Coding Activity 2
 * Use a for loop to print the even numbers between 1 and 50. 
 * Print each number on a new line.
 */ 

import java.util.Scanner;
import java.lang.Math; 

class Lesson_24_Activity_Two {
    public static void main(String[] args)
     {
         for (int i = 0; i<=50; i++)
         {
             if (i%2==0)
             {
                 System.out.println(i);
             }
         }
}
}