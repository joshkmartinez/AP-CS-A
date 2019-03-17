public class Student_Runner_Dashboard {

    public static void main(String[] args) {
        Dashboard a = new Dashboard(1250, 50);
        Dashboard b = new Dashboard(1250, 60);
        Dashboard c = new Dashboard(99999, 75);
        Dashboard d = new Dashboard(99999, 75);
        Dashboard e = new Dashboard(0, 75);

        System.out.println("Printing Dashboard:\n" + a + "\n");

        System.out.println("Comparing two dashboards:");
        System.out.println("" + b.compareTo(c)); //b is less than c
        System.out.println("" + b.compareTo(a)); //b is greater than a
        System.out.println("" + c.compareTo(d)); //c and d are equal
        c.drive(60); //c stalls because total milage is over 100,000; odometer set to 0, checkEngine set to true
        System.out.println("" + e.compareTo(c)); //e is less than c because c's checkEngine is on

        System.out.println("\nTesting race:");
        System.out.println("\nRace 1: Car 1 stalls");
        Dashboard racer1 = new Dashboard(1250, 50);
        Dashboard racer2 = new Dashboard(1250, 50);
        System.out.println(racer1.race(racer2, 55, 30));

        System.out.println("\nRace 2: Both cars stall");
        Dashboard racer3 = new Dashboard(1250, 50);
        Dashboard racer4 = new Dashboard(1250, 50);
        System.out.println(racer3.race(racer4, 55, 60));

        System.out.println("\nRace 3: Neither car stalls");
        Dashboard racer5 = new Dashboard(1250, 50);
        Dashboard racer6 = new Dashboard(1250, 50);
        System.out.println(racer5.race(racer6, 30, 20));

        System.out.println("\nRace 4: Neither car stalls, both have same speed");
        Dashboard racer7 = new Dashboard(1250, 50);
        Dashboard racer8 = new Dashboard(1250, 50);
        System.out.println(racer7.race(racer8, 20, 20));

        System.out.println("\nTesting difference:");
        Dashboard car1 = new Dashboard(1500, 50);
        Dashboard car2 = new Dashboard(1250, 50);
        Dashboard car3 = new Dashboard(1190, 60);

        System.out.println(car1.difference(car2));
        System.out.println(car3.difference(car2));

    }
}
