public class Lesson_34_Activity_Six {

  public static boolean allPositive(int[] n) {

    for (int i = 0; i < n.length; i++) {
      if (n[i] < 0) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    int[] a = { 1, 2, 3, 1 };
    System.out.println(allPositive(a));
  }
}