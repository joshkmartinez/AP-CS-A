public class Shoe implements Cost{
    public double marketValue(){
        return 3;
    }
    public String toString(){
        return "Shoe - S" + marketValue();
    }
}