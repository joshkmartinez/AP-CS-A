public abstract class Item{
    int level;
    int vendorValue;
    //abstract methods
    
    public int getLevel(){
        return level;
    }
    
    public void setLevel(int l)
    {
        level = l;
    }
    public int getVendorValue(){
        return vendorValue;
    }
    public void setVendorValue(int v){
        vendorValue=v;
    }
}