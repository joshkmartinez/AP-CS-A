import java.util.ArrayList;
import java.util.Random;

public class Population
{
    public static double baseInfectionChance = 0.5;
    private ArrayList<Person> p;
    
    public Population(int n){
         p = new ArrayList<Person>();
         int i = 0;
         while(i<n){
             Random rand = new Random();
             double r = rand.nextDouble();
             p.add(new Person(r));
             i++;
         }
    }
    
    public void infection(){
        for (Person i : p){
            if(i.getInfected()  )
            if(i.getChance() > baseInfectionChance){
                System.out.println("ch");
                i.changeInfected(true);
            }
        }
    }
    
    public int size(){
        return p.size();
    }
    
    public String toString(){
        String a ="";
        for(Person i :p){
            a+=i;
        }
        return a;
    }
}