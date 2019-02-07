
import java.util.ArrayList;
public class Hand {
    public int total = 0;
    public ArrayList<Card> Hand = new ArrayList<Card>();
    public boolean isBust = false;
    public Hand(Card c1, Card c2)
    {
        Hand.add(c1);
        Hand.add(c2);
        total = c1.getValue() + c1.getValue();
    }
    
    public void hit(Card c){
        Hand.add(c);
        this.total+=c.getValue();
        if (this.total>21){
            this.isBust=true;
        }
    }
    
    public int getTotal(){
        int v = this.total;
        //compute player score: if has ace and over 21, make *one* ace worth 1
        //change isBust
        while(v>21){
            for (Card c: Hand){
                    if(c.getValue()==11){
                        c.changeValue(1);
                        break;
                    }
            }
        }
        v=0;
        for (Card c: Hand)
        {
            v+=c.getValue();
        }
        if (v>21){
            this.isBust=true;
        }
        this.total = v;
        return v;
    }
    
    public boolean isBust()
    {
        int i =0;
        for (Card c: Hand)
        {
            i+=c.getValue();
        }
        this.total=i;
        return isBust;
    }
    
    public String toString(){
        String a = "";
        for (Card c : Hand)
        {
            a+=c+"\n";
        }
        return a;
    }
}