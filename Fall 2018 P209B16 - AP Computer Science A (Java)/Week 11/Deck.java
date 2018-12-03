import java.util.ArrayList;
import java.util.Random;
public class Deck{
    //variables  array of cards 52
    private ArrayList<Card> cards;
    //constructor ( rank[], suit[], value[]  ) - makes 52 cards in a deck makes cards based on those values
    public Deck(String[] rank, String[] suit, int[] value)
    {
        cards = new ArrayList<Card>();
        for ( int i = 0; i<suit.length; i++)
        {
            for (int n = 0; n<rank.length; n++)
            {
                Card newC = new Card(suit[i],rank[n],value[n]);
                cards.add(newC);
            }
        }
    }
    
    //methods, shuffle, deal, toString
    public void shuffle()
    {
        // make 3 lists: half 1, half 2, combined
        //get first card of half1 and half2
        //insert 2 cards to combined list
        //repeat for the rest of the cards in the half
        
        ArrayList<Card> h1 = new ArrayList<Card>((int)(cards.size()/2));
        ArrayList<Card> h2 = new ArrayList<Card>((int)(cards.size()/2));
        ArrayList<Card> combined = new ArrayList<Card>();
        
        //make half 1
        for (int i = 0; i < h1.size(); i++)
        {
            h1.add(cards.get(i));
        }
        
        //make half 2
        for (int i = h1.size(); i < cards.size(); i++)
        {
            h2.add(cards.get(i));
        }
        
        //combine halfs
        for ( int i = 0; i < h1.size(); i++ )
        {
            combined.add(h1.get(i));
            combined.add(h2.get(i));
        }
    }
    
    public Card deal()
    {
        if (cards.size()>0)
        {
            Random rand = new Random();
            Card randomC = cards.get(cards.size()-1);
            cards.remove(cards.size()-1);
            return randomC;
        } else
        {
            return null;
        }
    }
    
    public String toString()
    {
        String deckString = "";
        for (Card c : cards)
        {
            deckString += ("\n" + c);
        }
        return deckString;
    }
    
}