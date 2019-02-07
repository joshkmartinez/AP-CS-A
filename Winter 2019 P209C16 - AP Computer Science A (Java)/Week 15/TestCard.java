public class TestCard
{
    public static void main(String[] args)
    {
        Card c1 = new Card("A", "Spades", 11);
        Card c2 = new Card("9", "Hearts", 9);
        Card c3 = new Card("2", "Clubs", 2);
        
        System.out.println(c1 +" "+ c2 + " "+ c3);
    }
}