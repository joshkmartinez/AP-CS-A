
public class TestPiggyBank
{
    public static void main(String[] args)
    {
        PiggyBank myMoney = new PiggyBank();
        
        Coin d = new Coin ("dime", 2018, 0.1);
        Coin n = new Coin ("nickel", 2018, 0.05);
        Coin q = new Coin ("qaurter", 2018, 0.25);
        Coin p = new Coin ("penny", 2018, 0.01);
        
        myMoney.addCoin(d);
        myMoney.addCoin(n);
        myMoney.addCoin(q);
        myMoney.addCoin(q);
        myMoney.addCoin(p);
        
        System.out.println("There is $" + myMoney.totalValue() + " in the piggy bank");
        System.out.println("There are " + myMoney.numCoins() + " coins in the piggy bank");
        System.out.println("The coins in the bank are: " + myMoney);
    }
}
