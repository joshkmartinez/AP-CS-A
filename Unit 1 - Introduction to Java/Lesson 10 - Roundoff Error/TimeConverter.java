import java.util.Scanner;
import java.lang.Math;

class Main {
    public static void main(String[] args) {
      
      Scanner scan = new Scanner(System.in);
        
      System.out.println("Seconds Since Unix Epoch:");
        
        int secsinput = scan.nextInt();
     // System.out.println(secsinput);
      
      int secsInMinute = 60;
      int secsInHour = secsInMinute * 60;
      
      int secsInDay = secsInHour*24;
      int secsInMonth = secsInDay* 30;
      int secsInYear = secsInMonth *12;
        
       
       
       int yearsSince = (int)Math.floor(secsinput/secsInYear);
       secsinput = secsinput - secsInYear*yearsSince;
       
       int monthsSince = (int)Math.floor(secsinput/secsInMonth);
       secsinput = secsinput - secsInMonth*monthsSince;
       
       int daysSince = (int)Math.floor(secsinput/secsInDay);
       secsinput = secsinput - secsInDay*daysSince;
       
       int hoursSince = (int)Math.floor(secsinput/secsInHour);
       secsinput = secsinput - secsInHour*hoursSince;
       
       int minutesSince = (int)Math.floor(secsinput/secsInMinute);
       secsinput = secsinput - secsInMinute*minutesSince;

       
       
       System.out.println("Year: " + (int)(yearsSince+1970));
       System.out.println("Month: " + (int)(monthsSince));
       System.out.println("Day: " + (int)(daysSince));    
       System.out.println("Hour: " + (int)(hoursSince));    
System.out.println("Min: " + (int)(minutesSince));    
System.out.println("Sec: " + (int)(secsinput));
    }
} 