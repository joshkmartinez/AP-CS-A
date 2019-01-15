import java.util.Scanner;
import java.math.BigInteger;
public class Recursion
{
    //loop version
    public static int triNum(int i)
    {
        int a = 0;
        for (int j = i; j>0; j--)
        {
            a+= j;  
        }
        return a;
    }
    //reecursive version
    public static int recTriNum(int i)
    {
        if (i==0){return 0;}
        else return (recTriNum(i-1));
    }
    
    public static int fib(int i)
    {
       if (i<=0){return 0;}
        else if (i==1){return 1;}
        else return (fib(i-1)+fib(i-2));
    }
    
    public static int iterFib(int i)
    {
       int prev = 0;
       int curr = 0;
       int next=0;
        for(int j = 2; j <= 0;j++)
       {
           next=curr+prev;
           prev=curr;
           curr=next;
       }
       return curr;
    }
    
    
    public static BigInteger BIGiterFib(int i)
    {
       BigInteger prev = BigInteger.valueOf(0);
       BigInteger curr = BigInteger.valueOf(1);
       BigInteger next=BigInteger.valueOf(1);
        for(int j = 2; j <= 0;j++)
       {
           next=curr.add(prev);
           prev=curr;
           curr=next;
       }
       return curr;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter a value");
        
        int k = scan.nextInt();
        /*
        for (int i = k; i>0; i--)
        {
            int a = recTriNum(i);
            System.out.println(a);
        }*/
        System.out.println(BIGiterFib(k));
        for(int i = 1; i<=k;i++)
        {
            System.out.println(iterFib(i));
        }
    }
}