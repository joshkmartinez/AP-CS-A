import java.util.Scanner;
public class Blackjack{
    public static void main(){
        Scanner scan = new Scanner(System.in);
        
        String[] ranks = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        String[] suits = {"Clubs","Diamonds","Hearts","Spades"};
        int[] values = {2,3,4,5,6,7,8,9,10,10,10,10,11};
        Deck d = new Deck(ranks, suits, values);
        //shuffle cards
        d.swapShuffle();
        d.fishShuffle();
        
        //remove cards from deck, deal to player hand and computer hand
        Hand playerHand = new Hand(d.deal(),d.deal());
        Hand compHand = new Hand(d.deal(),d.deal());
        
        //tell user what cards they have
        System.out.println("Welcome to the game of Blackjack");
        System.out.println("You have been dealt the following cards:");
        System.out.println(playerHand);
        
        //comp hand
        //System.out.println("comp hand\n"+compHand);
        
        //do while !stand
        boolean stand = false;
        boolean cStand = false;
        while(!stand){
            if(playerHand.isBust())
            {
                System.out.println("Sorry. You have bust.");
                stand=true;
            } else if(playerHand.getTotal()==21)
            {
                System.out.println("You have gotten a Blackjack!");
                stand=true;
            } else {
                //ask player to hit or stand
                System.out.println("Would you like to HIT(H) or STAND(S)?");
                char in=scan.next().charAt(0);
                if(in=='s' || in =='S'){
                    stand=true;
                } else
                {
                    playerHand.hit(d.deal());
                }
                
            }
            System.out.println("This is your hand:\n"+playerHand);
            //repeat until stand or until bust
        }
        
        //computers turn to hit/stand
        
        while(!cStand){
            if(compHand.isBust())
            {
                System.out.println("The computer has bust!");
                cStand=true;
            } else if(compHand.getTotal()==21)
            {
                System.out.println("The computer has gotten Blackjack!");
                cStand=true;
            } else {
                if(compHand.getTotal()<16)
                {
                    System.out.println("The computer will hit.");
                    compHand.hit(d.deal());
                } else 
                {
                    cStand=true;
                }
            }
            //repeat until stand or until bust
        }
        System.out.println("The computer has finished its turn.");
        System.out.println("The computer has the following cards:\n"+compHand);
        //determine winner by score or if bust
        if (playerHand.isBust()&&compHand.isBust())
        {
            System.out.println("Both you can the computer have bust. It is a tie!");
        }
        else if(playerHand.isBust())
        {
            System.out.println("Sorry, your hand bust. You lose.");
        } else if(compHand.isBust())
        {
            System.out.println("The computer has bust! You win!");
        }else if(playerHand.getTotal()==21&&compHand.getTotal()==21) {
            System.out.println("Both the you and the computer got a blackjack! It is a tie!");
        }
        else if (playerHand.getTotal()==compHand.getTotal()){
            System.out.println("It is a tie!");
        }
        else
        {
            if(playerHand.getTotal()>compHand.getTotal())
            {
                System.out.println("You win!");
            } else
            {
                System.out.println("You lose.");
            }
            
        }
        System.out.println("Your hand had a score of: "+playerHand.getTotal());
        System.out.println("The computers hand had a score of: "+compHand.getTotal());
    }
}