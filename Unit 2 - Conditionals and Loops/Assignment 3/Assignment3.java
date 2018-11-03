import java.util.Scanner;

class Main
{
  public static void main(String[] args)
  {
    //I am confused, I am sure I didnt copy this but when I paste it into google a repl.it shows up. I think it is because we have the same println statements
    System.out.println("Hello, what is your name?");
    Scanner scan = new Scanner ( System.in );
    String username = scan.nextLine();
    System.out.println("Hello " + username + ". Try your best to crack the code!");
    //""
    System.out.println("PHASE 1");
    System.out.println("Enter a number");
    int input1 = scan.nextInt();
    if (input1 == 3) {
      System.out.println("Correct!");
      System.out.println("\nPHASE 2\nEnter a number");
      int input2 = scan.nextInt();
      if ((input2 >= 33 && input2 <= 100)||input2 == 1 ) {
        System.out.println("Correct!");
        System.out.println("\nPHASE 3\nEnter a number");
        int input3 = scan.nextInt();

        if ( (input3 % 3 == 0 || input3 % 7 == 0)&& input3 > 0)
        {
          System.out.println("Correct!\nYou have cracked the code!");
        }
        else {
          System.out.println("Sorry, that was incorrect!\nBetter luck next time!");
        }
      }
      else {
        System.out.println("Sorry, that was incorrect!\nBetter luck next time!");
      }
    }
    else {
     System.out.println("Sorry, that was incorrect!\nBetter luck next time!");
    }
  }
}