import java.util.Scanner;
public class perfectSquares
{
    public static void print(String s)
    {
        System.out.println(s);
    }
    
    public static boolean isPerfectSquare(int num)
    {
        int newInt = (int)Math.pow((int)Math.sqrt(num), 2);
        if (newInt == num) {
         return true;
        } else { return false; }
    }
    
    public static boolean morePerfectSquaresThanNot(int[] array)
    {
        int ps = 0;
        int nn = 0;
        //boolean ans = false;
        for (int i =0; i <= array.length; i++)
        {
            if (isPerfectSquare(array[i]) == true){
                ps++;
            } else { nn++;
                
            }
        }
        if (ps > nn)
            {
             return true;
            }
            else
            {
             return false; //even if they are equal
            }
    }
    
    public static void main (String[] args)
    {
        int[] intArray = new int[]{1,2,3,4,5,6,7,8,9,10};
        
        System.out.println(morePerfectSquaresThanNot(intArray));
    }
}
