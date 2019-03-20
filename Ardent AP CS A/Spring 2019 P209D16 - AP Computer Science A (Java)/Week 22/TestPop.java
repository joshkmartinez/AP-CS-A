import java.lang.Math;
public class TestPop
{
    public static void main( String[] args )
    {
        int worldPop = 10;
        Population world = new Population( worldPop );
        System.out.println( "Number of people in the world: " + world.size() );
        
        System.out.println( "Exposing population with disease..." );
        world.infection();
        System.out.println(world);
        System.out.println( world.checkInfected() + "% of people infected.");
        
        System.out.println( "Running a single time cycle..." );
        world.timeIteration();
        System.out.println(world);
        System.out.println( world.checkInfected() + "% of people infected.");
        
        for (int i = 0; i < 1000000; i++){
            world.timeIteration();
        }
        System.out.println( world.checkInfected() + "% of people infected.");
    }
}