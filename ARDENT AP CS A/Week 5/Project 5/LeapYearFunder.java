import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
//import java.util.ArrayList;
public class LeapYearFinder {
    //method that converts farenheight to celcius 
    public static boolean leapYear(int year) {
        boolean isIt = false;
        if (year % 400 == 0 ){isIt = true;}
        else if (year % 100 ==0){isIt = false;}
        else if (year % 4 ==0){isIt = true;}
        return isIt;
    }
    public static void main(String[] args) {
       leapYear(2021);
    }
}