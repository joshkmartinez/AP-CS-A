public class Bike implements Cost{
    public double marketValue(){
        return 100;
    }
    public String toString(){
        return "Bike - S" + marketValue();
    }
}