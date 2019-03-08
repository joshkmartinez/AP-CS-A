public class Person {
    private String fn, ln;

    public Person(String a, String b) {
        fn = a;
        ln = b;
    }

    public String toString() {
        return ln + ", " + fn;
    }
}

