import java.util.*;

public class Main {
    public static void main(String[] args) {
        //40
        //overcomplacated/ wrong/infite loop
        ArrayList<PrizeCard> p = new ArrayList<PrizeCard>();
        ArrayList<PrizeCard> p2 = new ArrayList<PrizeCard>();
        int i = 0;
        int t1 = 0;
        int t2 = 0;
        GameWheel g = new GameWheel(); // ONLY ONE GAME
        PrizeCard pi1 = new PrizeCard();
        PrizeCard pi2 = new PrizeCard();//che

        //p1 for t1 5
        while(i < 5) {
            pi1 = g.spinWheel();
            while (p.contains(pi1)){
                pi1 = g.spinWheel(); 
                //r
            }
            p.add(pi1);
            t1 += pi1.getPrizeAmount();
            i++;
        }
        i=0;
        
        //p2 for t2 5
        while(i < 5) {
            pi2= g.spinWheel();
            while (p2.contains(pi2)){
                pi2 = g.spinWheel();
            }
            p2.add(pi2);
            t2 += pi2.getPrizeAmount();
            i++;
        }

        System.out.println("Player 1 Total: $" + t1);
        for (PrizeCard ii: p) { 
            System.out.println(ii);
        }
        System.out.println();
        System.out.println("Player 2 Total: $" + t2);
        for (PrizeCard ii: p2) {
            System.out.println(ii);
        }

        System.out.println();
        if(t1 > t2){
            System.out.println("Player 1 won by $" + (t1 - t2) +"!");
        }
        else if(t1 < t2){
            System.out.println("Player 2 won by $" + (t2 - t1) + "!");
        }
        else {
            System.out.println("It’s a tie!");
        }

    }
}