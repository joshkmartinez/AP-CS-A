
public class Lesson_35_Activity {
  public static int randomize(int max, int min)
  {

      return (int)(Math.random() * ((max - min) + 1)) + min;

  }
  public static int randomize(int max)
  {

      return (int)(Math.random()*(max));

  }
  public static double randomize(double max, double min)
  {

      return Math.random()*(max-min)+min;

  }
  public static double randomize(double max)
  {

      return Math.random()*(max);

  }

  public static void main (String[] args)
  {
      double i =9.36;
      double n = 21.9;
      double ans = (double) randomize(i,n);
      System.out.println(ans);
  }
}
