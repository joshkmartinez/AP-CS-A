import java.util.ArrayList;

class UltimateTeam {
    private ArrayList<UltimatePlayer> p;
    private ArrayList<Coach> c;

    public UltimateTeam(ArrayList<UltimatePlayer> p, ArrayList<Coach> c) {
        this.p = p;
        this.c = c;
    }

    public String getCutters() {

        String a = "";
        for (UltimatePlayer i : p) {
            if (i.toString().indexOf("cutter") != -1) {
                a += i + "\n";
            }
        }
        return a;
    }

    public String getHandlers() {
        String a = "";
        for (UltimatePlayer i : p) {
            if (i.toString().indexOf("handler") != -1) {
                a += i + "\n";
            }
        }
        return a;

    }

    public String toString() {
        String a = "COACHES\n";
        for (Coach i : c) {
            a += i + "\n";
        }
        a += "\nPLAYERS\n";
        for (UltimatePlayer i : p) {
            a += i + "\n";
        }
        return a;
    }

}