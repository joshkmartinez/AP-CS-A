import java.util.Scanner;

public class PopTest
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner( System.in );
        
        System.out.print( "Enter a world X integer dimension > 2: " );
        int x = input.nextInt();
        
        System.out.print( "Enter a world Y integer dimension > 2: " );
        int y = input.nextInt();
        
        System.out.print( "Enter a base infection limit from 0.0 to 1.0: " );
        double il = input.nextDouble();
        
        Population world = new Population( x, y, il );
        
        // print the world, pre-infection
        System.out.println( "Pre-infection world state:" );
        world.printWorld();
        
        // infect the world
        System.out.println( "Infecting the world..." );
        world.infection();
        
        // print the world, post-infection
        System.out.println( "Post-infection world state:" );
        world.printWorld();
        
        // display infection percentage
        System.out.println( "Percentage of population infected: " + world.checkInfected() );
        
        // run a single time iteration
        System.out.println( "Running single time iteration" );
        world.timeIteration();
        
        // print the world, after single time iteration
        System.out.println( "Single iteration world state:" );
        world.printWorld();
        
        // display infection percentage
        System.out.println( "Percentage of population infected: " + world.checkInfected() );
        
        // prompt for more time iterations
        System.out.print( "How many more time iterations do you wish to run? " );
        int num = input.nextInt();
        
        System.out.println( "Running " + num + " time iterations." );
        for( int i = 0; i < num; i++ )
        {
            world.timeIteration();
            System.out.println( "World state at iteration " + i + ":" );
            world.printWorld();
        }
        
        // print the world, after all time iterations
        System.out.println( "Final world state after time iterations:" );
        world.printWorld();
        
        // display infection percentage
        System.out.println( "Final percentage of population infected: " + world.checkInfected() );
    }
}