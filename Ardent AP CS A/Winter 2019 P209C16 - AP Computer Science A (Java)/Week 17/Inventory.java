import java.util.ArrayList;
public class Inventory{
    public ArrayList<Cost> stuff;
    
    public Inventory(){
    stuff = new ArrayList<Cost>();
    }
    public void add(Cost i){
        stuff.add(i);
    }
    public String toString(){
        String s = "";
        for (Cost c : stuff){
            System.out.println(c);
        }
        return s;
    }
}