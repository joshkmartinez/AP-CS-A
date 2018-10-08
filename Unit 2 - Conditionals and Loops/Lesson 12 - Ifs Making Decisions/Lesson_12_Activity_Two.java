/*
 * Lesson 12 Coding Activity 1 
 * Write a program to input three integers. 
 * Test if the average is greater than or equal to 89.5. 
 * If so, print out the phrase "ABOVE AVERAGE" (without the quotes).
 */

import java.util.Scanner;

class Lesson_12_Activity_Two {
  public static void main(String[] args) {
    System.out.println("Please enter two numbers:");
    Scanner scan = new Scanner(System.in);
    double uno = scan.nextDouble();
    double dos = scan.nextDouble();

    double largest = 0;

    if (uno >= dos) {
      largest = uno;
    } else if (dos >= uno) {
      largest = dos;
    }
    System.out.println("Largest is: " + largest);
  }
}