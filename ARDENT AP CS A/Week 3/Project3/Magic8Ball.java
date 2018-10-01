import java.util.Scanner;
import java.util.Random;
public class Magic8Ball
{
    public static void main(String[] args)
{
        int max = 6;
        int min = 1;
        Scanner scan = new Scanner(System.in);
        Random gen = new Random();
        System.out.println("Enter a yes or no question.");
        
        int roll = gen.nextInt((max-min) + 1) +min;
        String ans = "";
        if (roll == 1){
            ans = "Definitely not";
        } else if (roll == 2){
            ans = "Unclear at this time";
        }else if (roll == 3){
            ans = "Ask again another time";
        }else if (roll == 5){
            ans = "Definitely yes";
        }else if (roll == 4){
            ans = "Maybe";
        }else if (roll == 6){
            ans = "No";
        }
        
        
        String noOneCares = scan.nextLine();
        
        System.out.println(ans);
        
        
        //System.out.println("The total of the two di is: " + (d1 + d2));
}}
