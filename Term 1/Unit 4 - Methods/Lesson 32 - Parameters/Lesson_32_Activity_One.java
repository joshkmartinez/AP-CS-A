/*
* Lesson 32 Coding Activity 1
* 
* For the Lesson 32 activities, you will be asked to write one or more methods.
* Use the template to write a main method that tests each of your methods, 
* then paste everything into the code runner box. Your submission should 
* begin with the first import statement and end with the final }.
* 
* Write a method that takes a parameter for the number of a month 
* and prints the month's name. 
* 
* This method must be called monthName() and it must have an integer parameter. 
* 
* Calling monthName(8) should print August to the screen.
*/


import java.util.Scanner;

class Lesson_32_Activity_One {
      
         public static void monthName(int i)
         {
           
          String[] months = {"January","Febuary","March","April","May","June","July", "August", "September","October","November","December"};
          System.out.println(months[i-1]);
         }
        
        public static void main(String[] args)
         {
         monthName(8);
         }
}
