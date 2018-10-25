/*
 * Lesson 22 Coding Activity 1
 * Write the code to take a String and print it with one letter per line.

  Sample run:

  Enter a string:
  bought
  b
  o
  u
  g
  h
  t
  
*/ 

import java.util.Scanner;
import java.lang.Math; 

class Lesson_22_Activity_One {
    public static void main(String[] args)
     {
       Scanner scan = new Scanner (System.in);
       
      int x = 0;
      int a = 0;
      System.out.println("Enter a string:");
      String word = scan.nextLine();
      int num = word.length();
      //System.out.println(num);
      while (x<num)
      {char letter = word.charAt(a);
      System.out.println(letter);
        a ++;
        x++;
        
      }

}
}