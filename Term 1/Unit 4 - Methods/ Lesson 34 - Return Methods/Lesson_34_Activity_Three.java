public class Lesson_34_Activity_Three
{

  public static int findMax(int[] n) {
    int m = 0;
    for (int i = 0; i < n.length; i++) {
      if (n[i] > m) {
        m = n[i];
      }
    }
    return m;
  }

  public static void main(String[] args) {
    int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    System.out.println(findMax(a));
  }
}