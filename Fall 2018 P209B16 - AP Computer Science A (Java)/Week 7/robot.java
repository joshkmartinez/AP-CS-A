import java.util.Random;

public class robot
{
    private String name;
    private int age;
    private String favColor;
    String[] greetings = {"Beep Boop","REEEE","Hello World","Ooof"};
    
    Random rand = new Random();
    
    public robot(String newName, int newAge, String newFavColor)
    {
        name=newName;
        age=newAge;
        favColor=newFavColor;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getAge()
    {
        return age;
    }
    
    public String getFavColor()
    {
        return favColor;
    }
    
    public String getGreeting()
    {
        return greetings[rand.nextInt(greetings.length)+1];
    }
}