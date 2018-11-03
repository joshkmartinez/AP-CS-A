import java.util.Scanner;

public class testRobot
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your robots name?");
        String name = scan.nextLine();
        
        System.out.println("What is your robots age?");
        int age = scan.nextInt();
        
        System.out.println("What is your robots favorite color?");
        String favcolor = scan.nextLine(); // <- its this line
        
        robot roboto = new robot(name,age,favcolor);
        
        System.out.println(roboto.getName() + " says " + roboto.getGreeting());
    }
}