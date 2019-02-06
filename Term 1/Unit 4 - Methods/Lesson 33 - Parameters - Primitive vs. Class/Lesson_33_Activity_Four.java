public class Lesson_33_Activity_Four {

    public static void reverse(int[] n) {
        int l = 0;
        int r = n.length - 1;
        while (l < r) {
            int temp = n[l];
            n[l] = n[r];
            n[r] = temp;
            l++;
            r--;
        }
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        reverse(nums);
    }
}