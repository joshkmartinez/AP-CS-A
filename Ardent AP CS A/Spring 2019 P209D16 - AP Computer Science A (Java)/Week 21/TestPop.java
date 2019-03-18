public class TestPop
{
    public static void main( String[] args )
    {
        int worldPop = 1000000;
        Population world = new Population( worldPop );
        System.out.println( "Number of people in the world: " + world.popSize() );
        
        System.out.println( "Infecting population with disease..." );
        world.infection();
        
        System.out.println( "Percentage of population infected: " + world.checkInfected() );
        
        System.out.println( "Running a single time cycle..." );
        world.timeIteration();
        
        System.out.println( "Percentage of population infected: " + world.checkInfected() );
    }
}