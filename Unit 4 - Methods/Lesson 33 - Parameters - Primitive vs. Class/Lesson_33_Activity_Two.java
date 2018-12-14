
public class Lesson_33_Activity_Two
{
    public static void randomize(int[] n)
    {
       for (int i=0; i < n.length; i++) {
        n[i] = (int)(Math.random()*90+10);
      }
    }
    public static void main (String[] args)
    {
       int[] nums = {1,2,3,4,5};
       randomize(nums);
    }
}