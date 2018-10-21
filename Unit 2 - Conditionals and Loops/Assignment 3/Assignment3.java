import java.util.Scanner;
import java.lang.Math;

class Main {
  public static void main(String[] args) {
    // Setup the scanner
    Scanner scan = new Scanner(System.in);

    System.out.println("Hello, what is your name?");

    String name = scan.nextLine();

    System.out.println("Hello " + name + ". Try your best to crack the code!");

    System.out.println("\nPHASE 1");

    System.out.println("Enter a number");

    int first = scan.nextInt();

    if (first == 3) {
      System.out.println("Correct!");

      System.out.println("\nPHASE 2\nEnter a number");

      int second = scan.nextInt();
      if (second == 1 || (second >= 33 && second <= 100)) {
        System.out.println("Correct!");
        System.out.println("\nPHASE 3\nEnter a number");
        int third = scan.nextInt();

        if (third > 0 && (third % 3 == 0 || third % 7 == 0))
        {
          System.out.println("Correct!\nYou have cracked the code!");
        }
        else {
          youLost();
        }
      }
      else {
        youLost();
      }
    }
    else {
      youLost();
    }
  }

  public static void youLost () {
    System.out.println("Sorry, that was incorrect!\nBetter luck next time!");
  }
}