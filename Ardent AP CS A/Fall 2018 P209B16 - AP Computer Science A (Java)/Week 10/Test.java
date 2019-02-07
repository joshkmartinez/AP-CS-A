public class Test
{
    public static void main (String[] args)
    {
        Shape[] Data = new Shape[5];
        
        Circle c = new Circle ( 3 );
        Disc d = new Disc (3, 9);
        Rectangle r =  new Rectangle ( 3, 6);
        Box b = new Box (1,2,3);
        
        Data[0]=c;
        Data[1]=d;
        Data[2]=r;
        Data[3]=b;
        
        for (Shape s : Data)
        {
            System.out.println(s);
        }
    }
}