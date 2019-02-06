/*
 * Lesson 19 - Unit 2 - More Loops
 */

import java.io.*;
import static java.lang.System.*;

import java.util.Scanner;
import java.lang.Math;

class t1_lesson19_template{


     public static void main (String str[]) throws IOException {

          int a = 45;
          int b = 30;
          
          while ( b !=0 )
          {
               int r = a % b;
               a = b;
               b = r;
              
          }

          System.out.println(a);
                
            
     }

}


