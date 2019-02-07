import java.util.Scanner;

public class TestRobot
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your robots name?");
        String name = scan.nextLine();
        
        System.out.println("What is your robots age?");
        int age = scan.nextInt();
        
        String nothing = scan.nextLine(); // see stackoverflow.com/questions/13102045/scanner-is-skipping-nextline-after-using-next-or-nextfoo
        System.out.println("What is your robots favorite color?");
        String favcolor = scan.nextLine();
        
        robot roboto = new robot(name, age, favcolor);
        
        System.out.println(roboto.getName() + " the robot says " + roboto.getGreeting() + " and feels " +roboto.getMood());
        
        roboto.rayGun();
    }
}