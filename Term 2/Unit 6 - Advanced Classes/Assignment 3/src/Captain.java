public class Captain extends UltimatePlayer {
    boolean t;

    public Captain(String a, String b, String p, boolean t) {
        super(a, b, p);
        this.t = t;
    }

    public String toString() {
        if (t) {
            return super.toString() + "\n   Captain: offense";
        }
        return super.toString() + "\n   Captain: defense";
    }
}
