import java.util.Scanner;

class Lesson_12_Activity_Two {
  public static void main(String[] args) {
    System.out.println("Please enter two numbers:");
    Scanner scan = new Scanner(System.in);
    double uno = scan.nextDouble();
    double dos = scan.nextDouble();

    double largest = 0;

    if (uno >= dos) {
      largest = uno;
    } else if (dos >= uno) {
      largest = dos;
    }
    System.out.println("Largest is: " + largest);
  }
}