import java.util.Scanner;
public class Greeting
{
    public static void main(String[] args)
{
        Scanner input = new Scanner (System.in);
        System.out.println("Please enter your name:   ");
        String name =  input.nextLine();
        //String name =  input.next(); <-- This only takes the first word of the string
        System.out.println("Hello, " + name);
}
}