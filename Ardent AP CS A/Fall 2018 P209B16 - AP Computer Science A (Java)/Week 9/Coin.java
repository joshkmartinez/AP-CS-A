public class Coin {
    // variables - state
    private double faceValue;
    private String name;
    private int year;

    public Coin(String n, int y, double fv) {
        name = n;
        year = y;
        faceValue = fv;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public double getFaceValue() {
        return faceValue;
    }

    public String toString() {
        return name + ", " + faceValue + ", " + year + ".";
    }

}