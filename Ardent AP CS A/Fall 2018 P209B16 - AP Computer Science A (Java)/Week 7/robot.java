import java.util.Random;

/*
 * Robot Class - November 2018
 */

public class robot
{
    private String name;
    private int age;
    private String favColor;
    String[] moods = {"happy","sad","mad","depressed","jublient","angry","apathetic"};
    String[] greetings = {"Beep Boop","REEEE","Hello World","Ooof"};
    
    Random rand = new Random();
    /*
     * Contructor
     */
    public robot(String newName, int newAge, String newFavColor)
    {
        name=newName;
        age=newAge;
        favColor=newFavColor;
    }
    /*
     * Get the robot's name
     */
    public String getName()
    {
        return name;
    }
    /*
     * Get the robot's age
     */
    public int getAge()
    {
        return age;
    }
    
    /*
     * Get the robot's favorite color
     */
    public String getFavColor()
    {
        return favColor;
    }
    /*
     * Get the robot's greeting
     */
    public String getGreeting()
    {
        return greetings[rand.nextInt(greetings.length)];
    }
    /*
     * Get the robot's mood
     */
    public String getMood()
    {
        return moods[rand.nextInt(moods.length)];
    }
    /*
     * Fire the robots ray gun if it is in the right mood
     */
    public void rayGun()
    {
        if ( getMood().equals("mad") ||  getMood().equals("sad") ||  getMood().equals("depressed"))
        {
            System.out.println("PEW POW ZAPP");
        } else
        {
            System.out.println("I dont feel like shooting hoo-mans now");
        }
    }
}