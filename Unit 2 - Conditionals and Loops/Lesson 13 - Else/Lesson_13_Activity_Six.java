import java.util.Scanner;

class Lesson_13_Activity_Six {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    double temp = scan.nextDouble();
    
    if (temp < 99 || temp > 102) {
      System.out.println("WARNING"); 
    } else {
      System.out.println("Temperature is OK"); 
    }
    
  }
}