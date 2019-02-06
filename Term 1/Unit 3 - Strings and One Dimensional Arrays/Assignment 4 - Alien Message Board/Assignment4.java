import java.util.Scanner;

class Main
{
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int carratsss = 0;
        int qeyNumOfTimes = 0;
        int doubleDollarSignsTimes = 0;
        int firstSpaceIndex = 0;
        String caret = "^^";
        String qey = "qey";
        String cash = "$";
        System.out.println("Enter message board post:");
        String theMessage = scan.nextLine();
        for (int j = 0; j < theMessage.length(); j++) {
            int i = j + 1;
            if (theMessage.charAt(j) == ' ') {
                if (firstSpaceIndex == 0) {
                    firstSpaceIndex = j;
                } else {
                    if (theMessage.charAt(i) == caret.charAt(0) && theMessage.length() - i >= caret.length()) {
                        if (theMessage.substring(i, i + caret.length()).equals(caret)) {
                            if (theMessage.length() - i == caret.length() || theMessage.charAt(i + caret.length()) == ' ') {
                                carratsss++;
                            }
                        }
                    } else if (theMessage.charAt(i) == 'q' || theMessage.charAt(i) == 'Q') {
                        if (theMessage.substring(i, i + qey.length()).toLowerCase().equals(qey)) {
                            if (theMessage.length() - i == qey.length() || theMessage.charAt(i + qey.length()) == ' ') {
                                qeyNumOfTimes++;
                            }
                        }
                    } else if (theMessage.charAt(i) == cash.charAt(0)) {
                        if (theMessage.substring(i, i + cash.length()).equals(cash)) {
                            if (theMessage.length() - i == cash.length() || theMessage.charAt(i + cash.length()) == ' ') {
                                doubleDollarSignsTimes++;
                            }
                        }
                    }
                }
            }
        }



        String alienName = theMessage.substring(0, firstSpaceIndex);

        System.out.println("\nResults:\n");

        if ((carratsss > 0) || (qeyNumOfTimes > 0) || (doubleDollarSignsTimes > 0)) {
            System.out.println("BAD");
            System.out.println(alienName);
            System.out.println("^^: " + carratsss);
            System.out.println("qey: " + qeyNumOfTimes);
            System.out.println("$: " + doubleDollarSignsTimes);
        } else {
            System.out.println("CLEAN");
        }
    }
}