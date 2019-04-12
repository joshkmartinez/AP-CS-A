import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<TeamMember> t = new ArrayList<TeamMember>();
        while (true) {
            System.out.println("Enter the next name:");
            String n = scan.nextLine();
            if (n.toLowerCase().equals("stop")) {
                break;
            }
            System.out.println("Enter the next ID:");
            String id = scan.nextLine();
            t.add(new TeamMember(n, id));
        }

        //sort
        int z = t.size();
        for (int i = 0; i < z; i++) {
            for (int j = 0; j < z - 1; j++) {
                if (t.get(i).compareTo(t.get(j)) == -1) {
                    TeamMember t1 = t.get(i);//s
                    TeamMember t2 = t.get(j);
                    t.remove(i);
                    t.add(i, t2);
                    t.remove(j);
                    t.add(j, t1);
                }
            }
        }

        System.out.print("[");
        for (int i = 0; i < t.size() - 1; i++) {
            System.out.print(t.get(i) + ", ");
        }
        System.out.print(t.get(t.size() - 1) + "]");
    }
}
