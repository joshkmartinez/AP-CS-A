import java.util.Scanner;
import java.lang.Math;

class Main {
    public static void main(String[] args) {
      
        System.out.println("Please enter ratings from the movie review website.");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();
        System.out.println("Please enter ratings from the focus group.");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        System.out.println("Please enter the average movie critic rating.");
        double c = scan.nextDouble();
        System.out.println("Average website rating: " + (double)(x + y + z)/3);
        System.out.println("Average focus group rating: " + (double)(a + b)/2);
        System.out.println("Average movie critic rating: " + c);
        System.out.println("Overall movie rating: " + ((((double)(x + y + z)/3)*.2) + (((double)(a + b)/2)*.3) + ((double)(c)*.5)));                     
    }
}