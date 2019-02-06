
/*
 * Lesson 30 1/2 Coding Activity 
 * 
 * For this program you will input an int to represent the octal number 
 * and translate to the base ten number. The octal number must be 8 digits or less.
 * 
 * Your program should also check that all the digits are 0 - 7, then translate the 
 * number to base ten. 
 * 
 * Sample Run 1: 
 * Enter a number in base 8: 
 * 1287 
 * ERROR: Incorrect Octal Format 
 * 
 * Sample Run 2: 
 * Enter a number in base 8: 
 * 123 
 * 83 
 * 
 * Sample Run 3: 
 * Enter a number in base 8: 
 * 1111111111 
 * ERROR: Incorrect Octal Format
 *   
 */

import java.util.Scanner;
import java.lang.Math;

public class Lesson_1011_Activity {
    public static void main(String[] args) {
        int num = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number in base 8:");
        num = scan.nextInt();
        boolean isok = true;
        int mem=0;
        int i = 0;
        int n = num;
        while (n > 0) {
            mem = n % 10;
            if (mem > 7) {
                isok = false;
            }
            n = n / 10;
            i++;
            if (i > 8) {
                isok = false;
            }
        }
        if (isok) {
            int decimal = 0;
            int esab = 1;
            while (num > 0) {
                int last_digit = num % 10;
                num = num / 10;
                decimal += last_digit * esab;
                esab = esab * 8;
            }
            System.out.println(decimal);
        } else {
            System.out.println("ERROR: Incorrect Octal Format");
        }
    }
}