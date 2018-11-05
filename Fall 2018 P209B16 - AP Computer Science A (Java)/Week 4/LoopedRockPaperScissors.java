import java.util.Scanner;
import java.util.Random;
public class LoopedRockPaperScissors
{
    public static void main(String[] args)
{
        int max = 3;
        int min = 1;
        Scanner scan = new Scanner(System.in);
        Random gen = new Random();
        System.out.println("Enter Rock (1) Paper (2) or Scissors (3)");
        
        int ans = gen.nextInt((max-min) + 1) +min;
       
        //generate computer 
        //take input
        //announce player thow and comp throw
        //compare
        //delcare winner
        
        
        int play = scan.nextInt();
       boolean win = false; // true if player wins
       boolean tie = false;
        if (ans == play){
            tie=true;
        } else if (play==1 && ans==2){
            System.out.println("You played rock");
            System.out.println("The computer plays paper");
            win=false;
        }else if (play==2 && ans==3){
             System.out.println("You played paper");
             System.out.println("The computer plays scissors");
            win=false;
        }else if (play==3 && ans==1){
            System.out.println("You played scissors");
            System.out.println("The computer plays rock");
            win=false;
        }else if (play==1 && ans==3){
            System.out.println("You played rock");
            System.out.println("The computer plays scissors");
            win=true;
        }else if (play==2 && ans==1){
            System.out.println("You played paper");
            System.out.println("The computer plays rock");
            win=true;
        }else if (play==3 && ans==2){
            System.out.println("You played rock");
            System.out.println("The computer plays paper");
            win=true;
        }
        
        
        //System.out.println("The computer played:  " + ans);
        
        if (tie==true){
            System.out.println("It is a tie!");
        }else if (win==true){
            System.out.println("You won!");
        }else if (win==false){
            System.out.println("You lost...");
        }
        
}
}
