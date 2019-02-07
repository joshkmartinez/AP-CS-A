import java.util.Scanner;
public class NumberPlaces
{
    public static void main(String[] args)
{
        Scanner input = new Scanner (System.in);
        System.out.println("Enter a two digit number:   ");
        int numb =  input.nextInt();
        int tens = numb/10;
        int ones = numb%10;
        System.out.println("tens place: "+tens +"\nones place: "+ ones);
}
}