public class MerlinsWand extends Wand{
    public static final String Name = "Merlin's Wand";
    
    public MerlinsWand(int l, int vv){
        level=l;
        vendorValue=vv;
    }
    public String toString(){
        return "Wand - " + Name + ": level " + level;
    }
}