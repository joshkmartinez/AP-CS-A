import java.util.Collections;
import java.util.ArrayList;
public class RoyalFlushCounter{
    private static boolean at(boolean[] array)
    {
        for(boolean b : array) if(!b) return false;
        return true;
    }
    public static void main(String[] args){
        String[] ranks = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        String[] suits = {"Clubs","Diamonds","Hearts","Spades"};
        int[] values = {2,3,4,5,6,7,8,9,10,11,12,13,14};
        int times = 0;
        for(int i = 0; i<1000000;i++)
        {
            Deck d = new Deck(ranks, suits, values);
            //shuffle cards
            d.fishShuffle();
            d.swapShuffle();
            d.perfectShuffle();
            Hand h = new Hand(d.deal(),d.deal());
            h.hit(d.deal());
            h.hit(d.deal());
            h.hit(d.deal());
            //System.out.println("Same Suit?  " + h.isSameSuit());
            ArrayList<Card> hand = new ArrayList<Card>();
            ArrayList<Card> hh = h.getHand();
            for(Card c : hh){
                hand.add(c);
            }
            
            boolean[] r = new boolean[5];
            for(Card c : hand){
                if (c.getRank().equals("A")){
                    r[0]=true;
                }
                if (c.getRank().equals("K")){
                    r[1]=true;
                }
                if (c.getRank().equals("Q")){
                    r[2]=true;
                }
                if (c.getRank().equals("J")){
                    r[3]=true;
                }
                if (c.getRank().equals("10")){
                    r[4]=true;
                }
            }
            boolean allReqsMet = at(r);
            
            if(allReqsMet && h.isSameSuit()){
                System.out.println("ROYAL FLUSH");
                System.out.println(hand);
                times++;
            }
            
        }
        //average of 3
        System.out.println(times);
    }
}