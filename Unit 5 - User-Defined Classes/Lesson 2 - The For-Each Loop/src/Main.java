import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter words, enter STOP to stop the loop.");
        ArrayList<String> l = new ArrayList<String>();
        String s = "";
        while (true) {
            s = scan.nextLine();
            if (s.equals("STOP")) {
                break;
            } else {
                l.add(s);
            }
        }

        for (String str : l) {

            if (str.contains("a")) {
                System.out.println(str);
            }
        }
    }
}
