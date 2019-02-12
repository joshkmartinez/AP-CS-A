public class Ruby extends Gem{
    public static final String Name ="Ruby";
    public Ruby(int l, int vv, int q){
        level = l;
        vendorValue=vv;
        quality=q;
        
    }
    public String toString(){
        return "Gem - " + Name + ": level " + level;
    }
}