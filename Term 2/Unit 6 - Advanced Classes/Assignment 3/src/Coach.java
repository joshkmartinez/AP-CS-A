public class Coach extends Person {
    String r;
   public Coach(String a, String b, String r){
        super(a,b);
        this.r=r;
    }
    public String toString()
    {
        return super.toString() + "\n   Role: " + r;
    }
}
