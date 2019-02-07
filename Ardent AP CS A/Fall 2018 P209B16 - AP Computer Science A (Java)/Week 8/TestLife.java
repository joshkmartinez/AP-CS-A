import java.util.Scanner;

public class TestLife
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner( System.in );
        World w = new World( 20 );
        w.displayWorld();
        
        // prompt the user for the number of generations to run
        System.out.println( "How many generations should we run? " );
        int numIterations = input.nextInt();
        
        for( int i = 0; i < numIterations; i++ )
        {
            w.generation();
            w.displayWorld();
        }
        
        System.out.println( +numIterations + "generations ran." );
    }
}