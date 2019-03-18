import java.util.ArrayList;
import java.util.Random;

public class Population
{
    // variables
    private double baseVulnerability = 0.5;
    private ArrayList<Person> data;
    private Random gen;
    
    // constructor
    public Population( int numPeople )
    {
        data = new ArrayList<Person>();
        gen = new Random();
        
        for( int i = 0; i < numPeople; i++ )
        {
            double vulnerability = gen.nextDouble();
            Person temp = new Person( vulnerability );
            data.add( temp );
        }
    }
    
    // number of people in the population
    public int popSize()
    {
        return data.size();
    }
    
    /**
     * infection() - this method traverses the entire array and exposes 
     * each person to the disease. Change their infection state based on
     * their susceptibility.
     */
    public void infection()
    {   
        for( int i = 0; i < data.size(); i++ )
        {
            Person tempPerson = data.get( i );
            
            if( tempPerson.getVulnerability() > baseVulnerability )
            {
                tempPerson.setInfected( true );
                data.set( i, tempPerson );
            }
        }
    }
     
    /**
     * checkInfected() - traverse the array and calculate the percentage
     * of the population that has contracted the disease.
     */
    public double checkInfected()
    {
        int infectedCount = 0;
        
        for( Person p : data )
        {
            if( p.infected() )
            {
                infectedCount++;
            }
        }
        
        return (double) infectedCount / data.size();
    }
    
    /**
     * timeIteration() - this method simulates the passage of a single time
     * cycle in the world, and causes people who have the disease to potentially
     * infect the people they are next to.
     * 
     * There are many ways to implement this...for our experiment, let's say that
     * people who are next to one infected person have a 50% chance of being infected,
     * and people who are next to TWO infected persons have a 99% chance of being infected.
     */
    
    public void timeIteration()
    {
         ArrayList<Person> newData = data;
        
        // take care of just the first person
        Person firstPerson = data.get( 0 );
        Person secondPerson = data.get( 1 );
        
        if( secondPerson.infected() )
        {
            double chance = gen.nextDouble();
            if( chance < 0.5 )
            {
                newData.get( 1 ).setInfected( true );
            }
        }
        
        // now process everyone else except the last person
        for( int i = 1; i < data.size() - 1; i++ )
        {
            Person prev = data.get( i - 1 );
            Person curr = data.get( i );
            Person next = data.get( i + 1 );
            
            // if both prev and next are infected, then curr is infected
            if( prev.infected() && next.infected() )
            {
                double chance = gen.nextDouble();
                if( chance < 0.99 )
                {
                    newData.get( i ).setInfected( true );
                    newData.set( i, curr );
                }
            }
            else if( prev.infected() || next.infected() )
            {
                double chance = gen.nextDouble();
                if( chance < 0.5 )
                {
                    newData.get( i ).setInfected( true );
                    newData.set( i, curr );
                }
            }
        }
        
        // process the last person
        Person last = data.get( data.size() - 1 );
        Person prev = data.get( data.size() - 2 );
        
        if( prev.infected() )
        {
            double chance = gen.nextDouble();
            if( chance < 0.5 )
            {
                newData.get( newData.size()-1 ).setInfected( true );
                newData.set( data.size() - 1, data.get(data.size()-1) );
            }
        }
        data=newData;
    }
}
    