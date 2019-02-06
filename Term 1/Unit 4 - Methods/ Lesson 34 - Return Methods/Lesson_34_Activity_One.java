public class Lesson_34_Activity_One {

  public static int sum(int[] n) {
    int sum = 0;
    for (int i = 0; i < n.length; i++) {
      sum += n[i];
    }
    return sum;
  }

  public static void main(String[] args) {
    int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    System.out.println(sum(a));
  }
}