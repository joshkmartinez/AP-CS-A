import java.util.ArrayList;
public class Chest{
    private ArrayList<Item> chest;
    private int size;
    
    public Chest(){
        chest = new ArrayList<Item>();
        size=0;
    }
    public void add(Item i){
        chest.add(i);
        size++;
    }
    public String toString(){
        String s = "";
        for (Item i : chest){
            s+=i+("\n");
        }
        return s;
    }
}