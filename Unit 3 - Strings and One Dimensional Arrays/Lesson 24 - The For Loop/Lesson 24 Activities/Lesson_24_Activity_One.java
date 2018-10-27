/*
 * Lesson 24 Coding Activity 1
 * Use a for loop to print all of the numbers from 23 to 89, with 10 numbers on each line. 
 * Print one space between each number.
 */ 

import java.util.Scanner;
import java.lang.Math; 

class Lesson_24_Activity_One {
    public static void main(String[] args)
     {
         int numIndex = 0;
         for (int i = 23; i<=89; i++)
         {
             System.out.print(i + " ");
             numIndex++;
             if (numIndex % 10 == 0)
             {
                System.out.println("");
             }
         }
}
}