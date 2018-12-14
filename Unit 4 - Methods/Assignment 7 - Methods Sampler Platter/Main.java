import java.lang.Math;
import java.util.Scanner;

public class Main {
  public static String duplicate(String s) {
    String ans = "";
    // odd
    if (s.length() % 2 != 0) {
      int l = s.length();
      for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        for (int j = 0; j < l; j++) {
          ans += c;
        }
      }
    } else
    // even
    {
      int l = s.length();
      for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        for (int j = 0; j < (l * 2); j++) {
          ans += c;
        }
      }

    }
    return ans;
  }

  public static boolean isEdhesivePalindrome(String s) {
    String l = s.toLowerCase();
    l = l.replace('4', 'a');
    l = l.replace('3', 'e');
    l = l.replace('0', 'o');
    l.toLowerCase();

    for (int i = 0; i < (int) (l.length() / 2); i++) {
      if (l.charAt(i) == l.charAt(l.length() - 1 - i)) {
      } else {
        return false;
      }
    }

    if (!(s.length() > 3 && s.length() < 15)) {
      return false;
    }
    return true;
  }

  public static double numberScramble(double n) {
    if (n < 0) {
      return 0;
    } else {
      return Math.sqrt((n + 5) / 2);
    }
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Welcome to the Methods Sampler Platter. Please enter a String to duplicate.");
    String in = scan.nextLine();
    System.out.println(in);
    System.out.println("The duplicated String is: " + duplicate(in));
    System.out.println("Next, please enter a String to check for Edhesive Palindromes.");
    in = scan.nextLine();
    System.out.println(in);
    if (isEdhesivePalindrome(in) == true) {
      System.out.println("Nice, you found an Edhesive Palindrome!");
    } else {
      System.out.println("Too bad, that isn’t an Edhesive Palindrome.");
    }
    System.out.println("Almost done! Please enter a number to scramble.");
    double in2 = scan.nextDouble();
    System.out.println("The scrambled number is: " + numberScramble(in2));
  }

}
