public class Excalibur extends Sword{
    public static final String Name = "Excalibur";
    public Excalibur(int l, int vv){
        level=l;
        vendorValue=vv;
    }
    public String toString(){
        return "Swoard - " + Name + ": level " + level;
    }
}