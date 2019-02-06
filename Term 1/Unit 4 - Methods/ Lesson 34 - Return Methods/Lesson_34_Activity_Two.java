public class Lesson_34_Activity_Two {

    public static double average(int[] n) {
        double count = 0;
        for (int i = 0; i < n.length; i++) {
            count += n[i];
        }
        //System.out.println("conut"+count);
        //System.out.println("length"+n.length);
        double avg = count / n.length;
        return avg;
    }

    public static void main(String[] args) {
        int[] nums = { 1,2,3,4,5,6,7,8,9,10 };
        System.out.println(average(nums));
    }
}