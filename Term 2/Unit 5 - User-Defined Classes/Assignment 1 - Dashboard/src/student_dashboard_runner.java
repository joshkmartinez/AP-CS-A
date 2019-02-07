import java.io.IOException;

public class student_dashboard_runner {

    public static void main(String str[]) throws IOException {
        Dashboard dashboard1 = new Dashboard();
        System.out.println("DASHBOARD 1 **************************");
        System.out.println(dashboard1 + "\n");
        
        Dashboard dashboard2 = new Dashboard(15000, 99);
        System.out.println("DASHBOARD 2 **************************");
        System.out.println(dashboard2 + "\n");
        dashboard2.accelerate();
        System.out.println(dashboard2 + "\n");
        dashboard2.accelerate();
        System.out.println(dashboard2 + "\n");
        

        Dashboard dashboard3 = new Dashboard(100000, 45);
        System.out.println("DASHBOARD 3 **************************");
        System.out.println(dashboard3 + "\n");
        
        Dashboard dashboard4 = new Dashboard(-1, 45);
        System.out.println("DASHBOARD 4 **************************");
        System.out.println(dashboard4 + "\n");
        
        Dashboard dashboard5 = new Dashboard(2500, 101);
        System.out.println("DASHBOARD 5 **************************");
        System.out.println(dashboard5 + "\n");
        
        Dashboard dashboard6 = new Dashboard(300, -10);
        System.out.println("DASHBOARD 6 **************************");
        System.out.println(dashboard6 + "\n");
        
        Dashboard dashboard7 = new Dashboard(0, 60);
        System.out.println("DASHBOARD 7 **************************");
        System.out.println(dashboard7 + "\n");
        dashboard7.drive(20);
        System.out.println(dashboard7 + "\n");
        
        Dashboard dashboard8 = new Dashboard(99999, 60);
        System.out.println("DASHBOARD 8 **************************");
        System.out.println(dashboard8 + "\n");
        dashboard8.drive(1);
        System.out.println(dashboard8 + "\n");
    }
}
