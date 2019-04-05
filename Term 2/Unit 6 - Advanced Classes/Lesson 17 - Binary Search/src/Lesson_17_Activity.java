public class Lesson_17_Activity {
    public static boolean isSorted(int[] a) {
        int p = a[0];
        for (int i = 1; i < a.length; i++) {
            if (p < a[i]) {
                p=a[i];
            } else {
                return false;
            }
        }
        return true;
    }

    public static int binarySearch(int[] a, int b) {
        int h = a[a.length-1];
        int l = a[0];
        int m = (int)(l+h)/2;
        while(a[m]!=b){
            if(b>m){
        h=m-1;
            } else{
                l=m+1;
            }
            if(h<l){
                return -1;
            }
            if(m==b){
                return m;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5, 6};
        System.out.println(isSorted(a));
        System.out.println(binarySearch(a,6));
    }
}
