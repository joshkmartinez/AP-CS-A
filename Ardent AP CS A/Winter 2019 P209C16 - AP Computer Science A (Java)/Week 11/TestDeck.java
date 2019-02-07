public class TestDeck
{
    public static void main (String[] args)
    {
        String[] ranks = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        String[] suits = {"Clubs","Diamonds","Hearts","Spades"};
        int[] values = {2,3,4,5,6,7,8,9,10,10,10,10,11};
        Deck d = new Deck(ranks, suits, values);
        System.out.println(d);
        System.out.println("NEW:");
        //System.out.println(d);
        d.randomShuffle();
        
        System.out.println(d);
    }
}