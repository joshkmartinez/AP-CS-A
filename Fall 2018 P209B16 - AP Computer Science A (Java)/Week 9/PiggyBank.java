import java.util.ArrayList;

public class PiggyBank
{
    private ArrayList<Coin> bank;
    
    public PiggyBank()
    {
        bank = new ArrayList<Coin>();
    }
    
    public void addCoin( Coin c)
    {
        bank.add(c);
    }
    
    public int numCoins()
    {
        return bank.size();
    }
    
    public double totalValue()
    {
        double value = 0;
        for (Coin c: bank)
        {
            value += c.getFaceValue();
        }
        
        return value;
    }
    
    public String toString()
    {
        String bankString = "";
        for (Coin c : bank)
        {
            bankString += c + "\n";
        }
        return bankString;
    }
}