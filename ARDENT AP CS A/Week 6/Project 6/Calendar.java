
import java.util.Scanner;
public class Calendar
{
    public static void print(String s)
    {
        System.out.println(s);
    }
    
    public static String month(int month)
    {
        String[] months = new String[]{"January","Febuary","March","April","May","June","July","August","September","October","November","December"};
        return months[month-1];
        
    }
    
    public static String printDays(int month)
    {
        String[] days = new String[]{"Sun","Mon","Tues","Wed","Thu","Fri","Sat"};
        return months[month-1];
        
    }
    
    public static void printCalendar(int monthNum, int year)
    {
        print(month(monthNum) + " " + year);
        print("------------");
        print("Sun Mon Tue Wed Thu Fri Sat");
        
    }
    
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the current month numer? (ex. august = 8)"); 
        int month = scan.nextInt();
        
        System.out.println("What is the current year?"); 
        int year = scan.nextInt();
        
        print(month(8));
        
    }
}
