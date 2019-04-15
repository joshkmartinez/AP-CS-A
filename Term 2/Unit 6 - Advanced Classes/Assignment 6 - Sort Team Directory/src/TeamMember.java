public class TeamMember {
    private String fullName;
    private String idString;

    public TeamMember(String name, String id) {
        name = name.toLowerCase();
        //+""string
        fullName = (name.charAt(0) + "").toUpperCase();
        for (int i = 1; i < name.length(); i++) {
            String s = name.charAt(i) + "";
            String s2 = Character.toString(name.charAt(i));
            if (s.equals(" ") || s.equals("	")) //tab
            {
                fullName += s;
                i++;
                fullName += Character.toString(name.charAt(i)).toUpperCase();
            } else {
                fullName += s2.toLowerCase();
            }
        }
        idString = id;
    }

    public String toString() {
        return fullName;
    }

    public int compareTo(TeamMember other) {
        int i = idString.compareTo(other.idString);
        if (i > 0) {
            return 1;
        }
        if (i < 0) {
            return -1;
        }
        return 0;
    }
}