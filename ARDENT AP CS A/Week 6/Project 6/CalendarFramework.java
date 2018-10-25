/**
 * Calendar Project
 * 
 */

import java.util.Scanner;

public class CalendarFramework
{
    /**
     * Print Function - print with no newline
     */
    public static void print( String s )
    {
        System.out.print( s );
    }
    
    /**
     * Print Function - print with newline
     */
    public static void println( String s )
    {
        System.out.println( s );
    }
    
    /**
     * Top Level Stub
     */
    private static void printMonth( int year, int month )
    {
        printMonthTitle( year, month );
        printMonthBody( year, month );
    }
    
    /**
     * Second Level Stub - printMonthTitle
     * (includes dummy values)
     */
    public static void printMonthTitle( int year, int month )
    {
        // this is a dummy value for testing purposes only
        println( month + " " + year); //month number to month name
    }
    
    /**
     * Second Level Stub - printMonthBody
     * (includes dummy values)
     */
    private static void printMonthBody( int year, int month )
    {
        // hint: this is where you call the methods that you write
        println( "the numbers go here" );
    }
    
    /**
     * Base Level Methods
     * All the methods we described go here--all currently have dummy values you must replace!
     */
    
    private static void printDay( int day )
    {
        print( "   " );
    }
    
    private static int getStartDay( int year, int month )
    {
        //of the month
        return 1;
    }
    
    private static int getTotalNumberOfDays( int year, int month )
    {
        //since epoch
        int daysSince = 0; //January 1st 2000 is a Saturday
        int yearOn = 0;
        int monthOn = 0;
        for (int i = 0; i <= year-2000; i++) //nned to acconut for negative years
        {
            daysSince =+ 365;
        }
        for (int m = 0; m <= month; m++)
        {
                
        }
        return daysSince;
    }
    
    private static int getDaysInMonth( int year, int month )
    {
        if (isLeapYear(year)&& month == 2)
        {
            return 29;
        }
        else if (month > 7 && month % 2 == 0)
        {
            return 31;
        }
        else if (month <= 7 && month % 2 == 1)
        {
            return 31;
        } else
        {
            return 30;
        }
    }
    
    private static boolean isLeapYear( int year )
    {
        if (year % 4 != 0 && year % 100 == 0 && year % 400 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    

    /**
     * CLIENT CODE
     */
    public static void main( String[] args )
    {
        Scanner input = new Scanner( System.in );
        
        print( "Enter a complete year: " );
        int year = input.nextInt();
        
        print( "Enter a month: " );
        int month = input.nextInt();
        
        // print out the calendar
        printMonth( year, month );

    }
}