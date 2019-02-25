public class Pixel{
    private byte R;
    private byte B;
    private byte G;
    private byte T;
    public Pixel(){
        this((byte)0,(byte)0,(byte)0,(byte)0);
    }
    public Pixel(byte r, byte b, byte g, byte t){
        this.R=r;
        this.B=b;
        this.G=g;
        this.T=t;
    }
    public byte getRed(){
        return R;
    }
    public byte getBlue(){
        return B;
    }
    public byte getGreen(){
        return G;
    }
    public byte getAlpha(){
        return T;
    }
    
    public void setGreen(byte g){
        G=g;
    }
    public void setBlue(byte b){
        B=b;
    }
    public void setRed(byte r){
        R=r;
    }
    public void setAlpha(byte a){
        T=a;
    }
}