public class Khakis extends Pants{
    public static final String Name = "Khakis";
    public Khakis(int l, int vv){
        level = l;
        vendorValue=vv;
    }
    public String toString(){
        return "Pants - " + Name + ": level " + level;
    }
}