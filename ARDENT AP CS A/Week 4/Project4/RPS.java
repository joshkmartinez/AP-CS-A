import java.util.Scanner;

public class RPS {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int gamesWon = 0;
        int compGamesWon =0;
        int gamesPlayed = 0;
        System.out.println("How many games of RPS would you like to play?");
        int gamesToPlay = input.nextInt();
        while (gamesPlayed < gamesToPlay){        
            int com = (int)(Math.random() * 3);

            System.out.println("Paper (0), Rock (1), or scissors (2)?");
            int hum = input.nextInt();
            gamesPlayed++;
            if (com==(hum))  
                System.out.println("It's a TIE!");

            else if (hum == 0)
            {
                if (com == 1){
                    System.out.println ("You chose paper, computer chose rock YOU WIN!");
                    gamesWon++;}
                else if (com == 2){
                    System.out.println ("You chose paper, Computer chose scissors YOU LOSE!");
                    compGamesWon++;}
            }

            else if (hum == 1)
            {
                if (com == 2){
                    System.out.println ("You chose Rock, computer chose scissors YOU WIN!");
                    gamesWon++;}
                else if (com == 0){
                    System.out.println ("You chose Rock, Computer chose paper YOU LOSE!");
                    compGamesWon++;}
            }

            else if (hum == 2)
            {
                if (com == 0){
                    System.out.println ("You chose Scissors, computer chose paper YOU WIN!");
                    gamesWon++;}
                else if (com == 1){
                    System.out.println ("You chose Scissors, Computer chose rock YOU LOSE!");
                    compGamesWon++;}
            }

        }   
        
        if (gamesWon > compGamesWon){
           System.out.println("YOU WON:   You won " + gamesWon + " out of " + gamesToPlay);
        }else if (compGamesWon > gamesWon){
           System.out.println("YOU LOST:   You won " + gamesWon + " out of " + gamesToPlay);
        }else {
        System.out.println("IT WAS A TIE:   You won " + gamesWon + " out of " + gamesToPlay + " games");
        }
    }
}