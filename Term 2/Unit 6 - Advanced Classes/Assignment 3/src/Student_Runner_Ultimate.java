import java.util.ArrayList;


public class Student_Runner_Ultimate {

    public static void main(String[] args) {
        Person person = new Person("John", "Doe");
        System.out.println("Printing person:\n" + person + "\n");

        UltimatePlayer player = new UltimatePlayer("Mary", "Smith", "cutter");
        System.out.println("Printing player:\n" + player + "\n");

        Captain captain = new Captain("Henry", "Tully", "handler", true);
        System.out.println("Printing captain:\n" + captain + "\n");

        Coach coach = new Coach("Sara", "Lee", "Head coach");
        System.out.println("Printing coach:\n" + coach + "\n");

        ArrayList<UltimatePlayer> players = new ArrayList<UltimatePlayer>();
        players.add(new UltimatePlayer("Sammy", "Trong", "handler"));
        players.add(new UltimatePlayer("Jayant", "Patel", "handler"));
        players.add(new UltimatePlayer("Myra", "Ozaeta", "cutter"));
        players.add(new UltimatePlayer("Lisa", "Holbrook", "cutter"));
        players.add(new UltimatePlayer("Lisbeth", "Kvale", "cutter"));
        players.add(new Captain("Malik", "Henry", "handler", true));
        players.add(new Captain("Joseph", "Pak", "cutter", false));

        ArrayList<Coach> coaches = new ArrayList<Coach>();
        coaches.add(new Coach("Maryam", "Mathour", "Head Coach"));
        coaches.add(new Coach("Soren", "Van Loben Sels", "Assistant Coach"));

        UltimateTeam team = new UltimateTeam(players, coaches);
        System.out.println("Printing team:\n" + team.toString() + "\n");
        System.out.println("Printing cutters:\n" + team.getCutters() + "\n");
        System.out.println("Printing handlers:\n" + team.getHandlers() + "\n");

    }
}



