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
        System.out.println(l.size());
        System.out.println(l);
        if (l.size() > 2) {
            l.remove(0);
            l.remove(l.size() - 1);
        }
        System.out.println(l);
    }
}
