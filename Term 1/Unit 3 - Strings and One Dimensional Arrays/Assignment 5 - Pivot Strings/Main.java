import java.util.Scanner;

class Main
{
    private static void print(String s)
    {
        System.out.println(s);
    }
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        print("Enter the first String:");
        String input = scan.nextLine();
        
        print("Enter the pivot String:");
        String pivot = scan.nextLine();
       
        int where;
        String first;
        String second;
        
        if (input.contains(pivot))
        {
            where = input.indexOf(pivot);
            print(Integer.toString(where));
            first = input.substring(0, where);
            second = input.substring(where+pivot.length(), input.length());
            System.out.println(second+pivot+first);
        } else
        {
            System.out.println("Error: Pivot String not found.");
        }
        
        
    }
}