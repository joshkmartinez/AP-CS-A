import java.util.Arrays;
public class Lesson_33_Activity_One
{
    public static void upper(String[] s)
    {
        for (int i = 0; i < s.length; i++ )
        {
            s[i]=s[i].toUpperCase();
        }
    }
    public static void main (String[] args)
    {
        String[] p = {"Hi","Test","123","FIVe"};
        upper(p);
        System.out.println(Arrays.toString(p));
    }
}