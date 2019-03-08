public class UltimatePlayer extends Person {
    private static int n=0;
    //why doesnt this work
    private int realn;
    private String p;

    public UltimatePlayer(String a, String b, String p) {
        super(a, b);
        this.p = "handler";
        if (p == "cutter") {
            this.p = "cutter";
        }
        n++;
        realn=n;
        System.out.println("NEW "+n);
    }

    public String getPosition() {
        return p;
    }

    public String toString() {
        return super.toString() + "\n   Jersey #: " + this.realn + "\n   Position: " + p;
    }

}
