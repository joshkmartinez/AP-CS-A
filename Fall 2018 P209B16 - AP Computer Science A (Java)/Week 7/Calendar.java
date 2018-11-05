/**
 * Calendar Project
 * by: Joshua Martinez
 */

import java.util.Scanner;

public class Calendar
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
    private static void printMonthTitle( int year, int month )
    {
        String[] months = new String[]{"January","Febuary","March","April","May","June","July","August","September","October","November","December"};
        println( "         " + months[month-1] + " " + year); //month number to month name
    }
    
    /**
     * Second Level Stub - printMonthBody
     * (includes dummy values)
     */
    private static void printMonthBody( int year, int month )
    {
        
        println("---------------------------\nSun Mon Tue Wed Thu Fri Sat");
        int dayOn = 1;
        int startIndex = 0;
        //int startDate = getStartDay(year, month);
        for (int i = 0; i < getStartDay(year, month); i++)
        {
            print("    ");
            startIndex++;
        }
        
        while (dayOn <= getDaysInMonth(year, month))
        {
            
            if (startIndex % 7 == 0 && dayOn != 1)
            {
                println("");
            }
            printDay(dayOn);
            dayOn++;
            startIndex++;
        }
    }
    
    /**
     * Base Level Methods
     * All the methods we described go here--all currently have dummy values you must replace!
     */
    
    private static void printDay( int day )
    {
        double dayPlaceFinder = (double)day/10;
        if (Math.floor(dayPlaceFinder) == 0)
        {
            print( "  " + day + " " );
        } else
        {
            print( " " + day + " " );
        }
    }
    
    private static int getStartDay( int year, int month )
    {
        //of the month
        int day = ((getTotalNumberOfDays( year, month)+6)%7);
        //0 = sun
        //1 = mon
        day = ( day +7 )%7;
        return day; //return 1 - 7 for day of the week
    }
    
    private static int getTotalNumberOfDays( int year, int month )
    {
        //January 1st 2000 is a Saturday <- epoch date
        
        int days = 0;
        int currentMonth =1;
        int currentYear = 2000;
        
        if ( year >= 2000)
        {
            while (currentYear < year || currentMonth < month)
            {
                days += getDaysInMonth (currentYear, currentMonth);
                if(currentMonth<12)
                {
                    currentMonth++;
                } else
                {
                    currentYear++;
                    currentMonth=1;
                }
            }
        } else if(year < 2000)
        {
            while (currentYear > year || currentMonth > month)
            {
                days -= getDaysInMonth(currentYear, currentMonth);
                if(currentMonth>1)
                    {
                        currentMonth--;
                    } else
                    {
                        currentYear--;
                        currentMonth=12;
                    }
            }
        }
        return days;
}
    private static int getDaysInMonth( int year, int month )
    {
        if (isLeapYear(year) && month == 2)
        {
            return 29;
        }
        if (!isLeapYear(year) && month == 2)
        {
            return 28;
        }
        else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
        {
            return 31;
        } else
        {
            return 30;
        }
    }
    
    private static boolean isLeapYear( int year )
    {
        boolean isIt = false;
        if (year % 400 == 0 )
        {
            isIt = true;
        }
        else if (year % 100 == 0)
        {
            isIt = false;
        }
        else if (year % 4 == 0)
        {
            isIt = true;
        }
        return isIt;
    }
    

    /**
     * CLIENT CODE
     */
    public static void main( String[] args )
    {
        Scanner input = new Scanner( System.in );
        
        print( "\n\nEnter a complete year: " );
        int year = input.nextInt();
        
        print( "Enter a month: " );
        int month = input.nextInt();
        
        // print out the calendar
        printMonth( year, month );

    }
}