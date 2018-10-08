/*
 * Lesson 12 Coding Activity 1 
 * Write a program to input three integers. 
 * Test if the average is greater than or equal to 89.5. 
 * If so, print out the phrase "ABOVE AVERAGE" (without the quotes).
 */


import java.util.Scanner;

class Lesson_12_Activity_One {
    public static void main(String[] args)
     {
    Scanner scan = new Scanner (System.in);
    int uno = scan.nextInt();
int dos = scan.nextInt();
int tres = scan.nextInt();
double average = (double)((uno + dos +tres));
average = average/3;
if (average >= 89.5){
  System.out.println("ABOVE AVERAGE");
}
    }
}