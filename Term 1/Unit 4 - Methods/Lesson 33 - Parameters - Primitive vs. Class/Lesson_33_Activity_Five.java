class Lesson_33_Activity_Five {

  public static void insertValue(int[] n, int v, int index) {
    for (int i = n.length - 1; i >= 0; i--) {
      if (i > index) {
        // move back one
        n[i] = n[i - 1];
      } else {
        n[index] = v;
      }
    }
  }

  public static void main(String[] args) {
    int[] nums = { 1, 2, 3, 4, 5 };
    insertValue(nums, 100, 2);
  }
}