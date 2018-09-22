import java.util.Scanner;
import java.lang.Math;

class Lesson_7_Activity_One {
public static void main(String[] args) {

Scanner scan = new Scanner(System.in);

System.out.println("Please enter a three digit number:");
int x = scan.nextInt();
int tens = x%10;
int hun = (x/10)%10;
int thos = (x/100)%10;
System.out.println("Here are the digits:");
System.out.println(thos);
System.out.println(hun);
System.out.println(tens);

}
}