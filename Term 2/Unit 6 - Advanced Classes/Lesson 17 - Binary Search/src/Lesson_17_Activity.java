public class Lesson_17_Activity {
    public static boolean isSorted(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static int binarySearch(int[] a, int b) {
        int h = a.length - 1;
        int l = 0;
        while (!(h < l)) {
            int m = (h + l) / 2;
            if (a[m] > b) {
                h = m - 1;
            } else if (a[m] < b) {
                l = m + 1;
            } else if (b == a[m]) {
                return m;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5, 6, 7};
        System.out.println(isSorted(a));
        System.out.println(binarySearch(a, 9));
    }
}
