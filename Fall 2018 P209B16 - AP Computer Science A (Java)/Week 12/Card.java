public class Card{
    private int value; //value of the rank
    private String rank;
    private String suit;
    public Card(String suit, String rank, int value){
        this.suit = suit;
        this.rank = rank;
        this.value = value;
    }
    
    public String toString(){
        return rank + " of " + suit + " (value = " + value +")";
    }
}