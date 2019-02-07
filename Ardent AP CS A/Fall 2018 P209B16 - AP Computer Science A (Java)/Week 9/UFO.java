import java.util.ArrayList;

public class UFO
{
    private int capacity = 9; //can hold 9 humans
    ArrayList<Human> pods = new ArrayList<Human>(capacity);
    private String name;
    private String captain;
    
    public UFO (String n, String c)
    {
        name = n;
        captain = c;
    }
    
    public void addHuman (Human h)
    {
        pods.add(h);
    }
    
    public void purgeAll ()
    {
        pods.clear();
    }
    
    public void purgeHuman (int i)
    {
        pods.remove(i);
    }
    
    public String toString()
    {
        String humans = "";
        for (Human h : pods)
        {
            humans += h;
        }
        return ("I am Captain " + captain + " of the Spaceship " + name + ". \nI have brought the following earthlings for our interplanetary zoo! (translated into English from qsdfwndhofehk).\n" + humans);
    }
}