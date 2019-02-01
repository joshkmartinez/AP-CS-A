import java.util.Scanner;
import java.math.BigInteger;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many terms of the Fubonacci Sequence would you like?");
        int test = scan.nextInt();
        BigInteger n = new BigInteger(Integer.toString(test));
        BigInteger f = new BigInteger("0");
        BigInteger s = new BigInteger("1");
        BigInteger adder = new BigInteger("1");
        for (BigInteger i = new BigInteger( "0"); i.compareTo(n)==-1; i.add(adder))
        {
            System.out.print(f + " ");
            BigInteger t = f.add(s);
            f = s;
            s = t;
        }
        System.out.println("\nDONE.");
    }
}/**
 * An example of a method - replace this comment with your own
 *
 * @param  y  a sample parameter for a method
 * @return    the sum of x and y
 */
public int sampleMethod(int y)
{
// put your code here
return y;
}

