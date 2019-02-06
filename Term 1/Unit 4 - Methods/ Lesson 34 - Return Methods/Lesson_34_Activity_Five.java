public class Lesson_34_Activity_Five {

  public static int sumEven(int[] n) {
    int s = 0;
    for (int i = 0; i < n.length; i++) {
      if (n[i] % 2 == 0) {
        s += n[i];
      }
    }
    return s;
  }

  public static void main(String[] args) {
    int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    System.out.println(sumEven(a));
  }
}