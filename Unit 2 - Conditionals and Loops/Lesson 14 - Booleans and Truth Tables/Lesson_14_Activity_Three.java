import java.util.Scanner;

class Lesson_14_Activity_Three {
public static void main(String[] args)
{

Scanner scan = new Scanner(System.in);
System.out.println("Please enter the first octet:");
int x = scan.nextInt();
System.out.println("Please enter the second octet:");
int y = scan.nextInt();
System.out.println("Please enter the third octet:");
int z = scan.nextInt();
System.out.println("Please enter the fourth octet:");
int v = scan.nextInt();

if (x>254 || x<0)
System.out.println("Octet 1 is incorrect");
if (y>254 || y<0)
System.out.println("Octet 2 is incorrect");
if (z>254 || z<0)
System.out.println("Octet 3 is incorrect");
if (v>254 || v<0)
System.out.println("Octet 4 is incorrect");
if (!(x>254 || x<0 && y>254 || y<0 && z>254 || z<0 && v>254 || v<0))
System.out.println("IP Address: "+ x +"."+ y +"."+ z +"."+ v);



}
}