public class RoyalFlushCounter{
    public static void main(String[] args){
        String[] ranks = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        String[] suits = {"Clubs","Diamonds","Hearts","Spades"};
        int[] values = {2,3,4,5,6,7,8,9,10,11,12,13,14};
        Deck d = new Deck(ranks, suits, values);
        //shuffle cards
        d.swapShuffle();
        d.fishShuffle();
        
        Hand h = new Hand(d.deal(),d.deal());
        h.hit(d.deal());
        h.hit(d.deal());
        h.hit(d.deal());
        System.out.println(h.isSameSuit());
        
       
        //tell user what cards they have
    }
}