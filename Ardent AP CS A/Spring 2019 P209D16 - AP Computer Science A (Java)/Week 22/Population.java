import java.util.ArrayList;
import java.util.Random;

public class Population
{
    // variables
    private double baseVulnerability = 0.3;
    //about this amount of people will not contract the disease, upon the creation of the population
    private Person[][] data;
    private Random gen = new Random();
    double c = 0.99/8; //base chance of infection
    // constructor
    public Population( int numPeople )
    {
        data = new Person[numPeople][numPeople];
        for( int i = 0; i < numPeople; i++ )
        {
            for( int j = 0; j < numPeople; j++ )
            {   
                double vulnerability = gen.nextDouble();
                Person temp = new Person( vulnerability );
                data[i][j]=temp; 
            }
        }
    }

    // number of people in the population
    public int size()
    {
        return data.length*data.length;
    }

    public String toString(){
        String a = "";
        for( int x = 0; x < data.length; x++ )
        {
            for( int y = 0;y < data[0].length; y++ )
            {
                a+= data[x][y] + " ";
            }   
            a+="\n";
        }
        return a;
    }

    /**
     * infection() - this method traverses the entire array and exposes 
     * each person to the disease. Change their infection state based on
     * their susceptibility.
     */
    public void infection()
    {   
        for( int x = 0; x < data.length; x++ )
        {
            for( int y = 0;y < data[0].length; y++ )
            {
                Person tempPerson = data[x][y];
                if( tempPerson.getVulnerability() > baseVulnerability )
                {
                    tempPerson.setInfected( true );
                    data[x][y] = tempPerson;
                }
            }   
        }
    }

    /**
     * checkInfected() = traverse the array and calculate the percentage
     * of the population that has the disease.
     */
    public double checkInfected()
    {
        int i = 0;
        for( int x = 0; x < data.length; x++ )
        {
            for( int y = 0;y < data[0].length; y++ )
            {
                if(data[x][y].infected()){
                    i++;
                }
            }   
        }

        return ((double) i / (double)(data.length*data[0].length))*100.0;
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
        handleCorners();
        handleEdges();
        handleInnards();
    }

    private void handleCorners(){
        Person[][] copy = data;
        int a = 0; //number of people around 
        double v = gen.nextDouble();
        //handle corners
        //top corner
        if(!copy[0][0].infected()){
            if(copy[1][0].infected()){
                a++;
            }
            if(copy[1][1].infected()){
                a++;
            }
            if(copy[0][1].infected()){
                a++;
            }
            if(v>(a*c)){
                copy[0][0].setInfected(true);
            }
        }
        a=0;
        v = gen.nextDouble();
        //top right corner
        if(!copy[copy.length-1][0].infected()){
            if(copy[copy.length-2][0].infected()){
                a++;
            }
            if(copy[copy.length-2][1].infected()){
                a++;
            }
            if(copy[copy.length-1][1].infected()){
                a++;
            }
            if(v>(a*c)){
                copy[copy.length-1][0].setInfected(true);
            }
        }
        a=0;
        v = gen.nextDouble();
        //bottom right corner
        if(!copy[copy.length-1][copy.length-1].infected()){
            if(copy[copy.length-2][copy.length-1].infected()){
                a++;
            }
            if(copy[copy.length-2][copy.length-2].infected()){
                a++;
            }
            if(copy[copy.length-1][copy.length-2].infected()){
                a++;
            }
            if(v>(a*c)){
                copy[copy.length-1][copy.length-1].setInfected(true);
            }
        }
        a=0;
        v = gen.nextDouble();
        //bottom left corner
        if(!copy[0][copy.length-1].infected()){
            if(copy[0][copy.length-2].infected()){
                a++;
            }
            if(copy[1][copy.length-2].infected()){
                a++;
            }
            if(copy[1][copy.length-1].infected()){
                a++;
            }
            if(v>(a*c)){
                copy[0][copy.length-1].setInfected(true);
            }
        }
        //corners done
        data=copy;
    }

    private void handleEdges(){
        //handle edges
        //left edge
        Person[][] copy = data;
        double a=0;
        double v = gen.nextDouble();
        for (int i = 1; i < copy[0].length-1; i++){
            if(!copy[0][i].infected()){
                if(copy[0][i-1].infected()){
                    a++;
                }
                if(copy[1][i-1].infected()){
                    a++;
                }
                if(copy[1][i].infected()){
                    a++;
                }
                if(copy[1][i+1].infected()){
                    a++;
                }
                if(copy[0][i].infected()){
                    a++;
                }
                if(v>(a*c)){
                    copy[0][copy.length-1].setInfected(true);
                }
            }
        }
        //top edge
        a=0;
        v = gen.nextDouble();
        for (int i = 1; i < copy.length-1; i++){
            if(!copy[i][0].infected()){
                if(copy[i-1][0].infected()){
                    a++;
                }
                if(copy[i-1][0].infected()){
                    a++;
                }
                if(copy[i][1].infected()){
                    a++;
                }
                if(copy[i+1][1].infected()){
                    a++;
                }
                if(copy[i+1][0].infected()){
                    a++;
                }
                if(v>(a*c)){
                    copy[i][0].setInfected(true);
                }
            }
        }
        //bottom edge
        a=0;
        v = gen.nextDouble();
        for (int i = 1; i < copy.length-1; i++){
            if(!copy[i][copy.length-1].infected()){
                if(copy[i-1][copy.length-1].infected()){
                    a++;
                }
                if(copy[i-1][copy.length-2].infected()){
                    a++;
                }
                if(copy[i][copy.length-2].infected()){
                    a++;
                }
                if(copy[i+1][copy.length-2].infected()){
                    a++;
                }
                if(copy[i+1][copy.length-1].infected()){
                    a++;
                }
                if(v>(a*c)){
                    copy[i][copy.length-1].setInfected(true);
                }
            }
        }
        //right edge
        a=0;
        v = gen.nextDouble();
        for (int i = 1; i < copy[0].length-1; i++){
            if(!copy[copy.length-1][i].infected()){
                if(copy[copy.length-1][i-1].infected()){
                    a++;
                }
                if(copy[copy.length-2][i-1].infected()){
                    a++;
                }
                if(copy[copy.length-2][i].infected()){
                    a++;
                }
                if(copy[copy.length-2][i+1].infected()){
                    a++;
                }
                if(copy[copy.length-1][i+1].infected()){
                    a++;
                }
                if(v>(a*c)){
                    copy[copy.length-1][i].setInfected(true);
                }
            }
        }
        data=copy;
    }   

    private void handleInnards(){
        //handle innerds
        Person[][] copy = data;
        double a=0;
        double v = gen.nextDouble();
        for( int x = 2; x < copy.length-2; x++ )
        {
            a=0;
            v = gen.nextDouble();
            for( int y = 2;y < copy[0].length-2; y++ )
            {
                a=0;
                v = gen.nextDouble();
                if(!data[x][y].infected()){
                    if(copy[x-1][y-1].infected()){
                        a++;
                    }
                    if(copy[x][y-1].infected()){
                        a++;
                    }
                    if(copy[x+1][y-1].infected()){
                        a++;
                    }
                    if(copy[x+1][y].infected()){
                        a++;
                    }
                    if(copy[x+1][y+1].infected()){
                        a++;
                    }
                    if(copy[x+1][y+1].infected()){
                        a++;
                    }
                    if(copy[x+1][y-1].infected()){
                        a++;
                    }
                    if(copy[x-1][y].infected()){
                        a++;
                    }
                    if(v>(a*c)){
                        copy[x][y].setInfected(true);
                    }
                }
            }   
        }
        data=copy;
    }
}
 