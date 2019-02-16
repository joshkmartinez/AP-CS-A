public class Student {
    private static int id = 0;
    private String fn;
    private String ln;
    private int gl;
    private double gpa;

    public Student() {

        this("None", "None", 0, 0.0);
    }

    Student(String firstName, String lastName, int gradeLevel, double gpaa) {
        fn = firstName;
        ln = lastName;
        gl=0;
        if(gradeLevel>=0&&gradeLevel<=12)
        {gl = gradeLevel;}
        this.gpa=0;
        if(gpaa>=0&&gpaa<=4.5)
        {
        this.gpa = gpaa;}
        id++;
    }

    public String toString() {
        String a = "";
        a += ln + ", " + fn + "\n";
        a += "GPA: " + gpa + "\n";
        a += "Grade Level: " + gl + " id # " + id;
        return a;
    }
}
