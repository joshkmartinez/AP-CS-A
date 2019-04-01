public class PrizeCard {
  private int id;
  private String color;
  private int prizeAmount;
  
  public PrizeCard() {
    id = 0;
    color = "red";
    prizeAmount = 0;
  }
  
  public PrizeCard(int nID, String nColor, int nPrizeAmount) {
   id = nID;
   color = nColor;
   prizeAmount = nPrizeAmount;
  }
  
  public int getID() {
    return id;
  }

  public int getPrizeAmount() {
    return prizeAmount;
  }
  
  public String toString() {
    return "ID: " + id +
      ", Color: " + color +
      ", Prize Amount: $" + prizeAmount;      
  }
}