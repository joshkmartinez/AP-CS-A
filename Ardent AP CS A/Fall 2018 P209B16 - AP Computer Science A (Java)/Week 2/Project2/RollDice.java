
import java.util.Random;
public class RollDice
{
    public static void main(String[] args)
{
        int max = 6;
        int min = 1;
        
        Random gen = new Random();
        
        int d1 = gen.nextInt((max-min) + 1) +min;
        int d2 = gen.nextInt((max-min) + 1) +min;
        
        System.out.println("Dice roll one is: " + d1);
        System.out.println("Dice roll one is: " + d2);
        
        System.out.println("The total of the two di is: " + (d1 + d2));
}}
