import java.util.Random;

public class Population
{
    // variables
    public static final double INFECTION_MULTIPLIER = 0.12375;
    private Person[][] data;
    private double infectionLimit;
    private Random gen;
    
    // constructor
    public Population( int worldSizeX, int worldSizeY, double infectionLimit )
    {
        this.infectionLimit = infectionLimit;
        gen = new Random();
        
        // instantiates the world
        data = new Person[ worldSizeX ][ worldSizeY ];
        
        // populate
        for( int i = 0; i < data.length; i++ )
        {
            for( int j = 0; j < data[0].length; j++ )
            {
                double immunity = gen.nextDouble();
                Person temp = new Person( immunity );
                data[ i ][ j ] = temp;
            }
        }
    }
    
    // methods
    
    // population size
    public int popSize()
    {
        return data.length * data[0].length;
    }
    
    // printWorld() - for world Sizes 10x10 or less for testing purposes
    public void printWorld()
    {
        // data representation when printing
        // 1's are infected, 0's are not
        
        if( data.length <= 10 && data[0].length <= 10 )
        {
            for( int i = 0; i < data.length; i++ )
            {
                for( int j = 0; j < data[0].length; j++ )
                {
                    if( data[ i ][ j ].infected() )
                    {
                        System.out.print( "1 " );
                    }
                    else
                    {
                        System.out.print( "0 " );
                    }
                }
                System.out.println();
            }
        }
        else
        {
            System.out.println( "ERROR: World exceeds display limits." );
        }
    }
    
    // infection()
    public void infection()
    {
        for( int i = 0; i < data.length; i++ )
        {
            for( int j = 0; j < data[0].length; j++ )
            {
                if( data[ i ][ j ].getImmunity() < infectionLimit )
                {
                    data[ i ][ j ].setInfected( true );
                }
            }
        }
    }
    
    // checkInfected()
    public double checkInfected()
    {
        int infectedCount = 0;
        
        for( int i = 0; i < data.length; i++ )
        {
            for( int j = 0; j < data[0].length; j++ )
            {
                if( data[ i ][ j ].infected() )
                {
                    infectedCount++;
                }
            }
        }
        
        return (double) infectedCount / popSize();
    }
    
    // timeIteration()
    // we will apply Procedural Abstraction to this method
    public void timeIteration()
    {
        // create a temp array
        Person[][] temp = new Person[ data.length ][ data[0].length ];
        for( int i = 0; i < data.length; i++ )
        {
            for( int j = 0; j < data[0].length; j++ )
            {
                temp[ i ][ j ] = data[ i ][ j ];
            }
        }
        
        // process the four people at the corners first, exposure limit 3
        processCorners( temp );
        
        // process the people at the top row except the corners
        processTopRow( temp );
        
        // process the people at the bottom row except the corners
        processBottomRow( temp );
        
        // process the people on the left column except the corners
        processLeftColumn( temp );
        
        // process the people on the right column except the corners
        processRightColumn( temp );
        
        // process everyone else in the middle
        processMiddle( temp );
    }
    
    // helper methods for timeInteration - set to private access level!
    private void processCorners( Person[][] temp )
    {
        // top left corner
        
        int iCount = 0;
        
        // (0, 1), (1, 0), (1, 1)
        if( temp[ 0 ][ 1 ].infected() )
            iCount++;
        if( temp[ 1 ][ 0 ].infected() )
            iCount++;
        if( temp[ 1 ][ 1 ].infected() )
            iCount++;
        
        // see if corner person is infected
        double infectMe = gen.nextDouble();
        double infectionChance = (double) iCount * INFECTION_MULTIPLIER;
        
        if( infectMe < infectionChance )
            data[ 0 ][ 0 ].setInfected( true );
        
        // top right corner
        
        iCount = 0;
        
        // (data.length-2, 0), (data.length-2, 1 ), (data.length-1, 1)
        if( temp[ temp.length - 2 ][ 0 ].infected() )
            iCount++;
        if( temp[ temp.length - 2 ][ 1 ].infected() )
            iCount++;
        if( temp[ temp.length - 1 ][ 1 ].infected() )
            iCount++;
        
        // see if corner person is infected
        infectMe = gen.nextDouble();
        infectionChance = (double) iCount * INFECTION_MULTIPLIER;
        
        if( infectMe < infectionChance )
            data[ data.length - 1 ][ 0 ].setInfected( true );
        
        // bottom left corner
        iCount = 0;
        
        // (0, data[0].length-2), ( 1, data[0].length-2 ), (1, data[0].length-1 )
        if( temp[ 0 ][ temp[0].length - 2 ].infected() )
            iCount++;
        if( temp[ 1 ][ temp[0].length - 2 ].infected() )
            iCount++;
        if( temp[ 1 ][ temp.length - 1 ].infected() )
            iCount++;
        
        // see if corner person is infected
        infectMe = gen.nextDouble();
        infectionChance = (double) iCount * INFECTION_MULTIPLIER;
        
        if( infectMe < infectionChance )
            data[ 0 ][ data.length - 1 ].setInfected( true );
        
        
        // bottom right corner
        iCount = 0;
        
        // (data.length-1, data.length[0].length-2), ( data.length-2, data[0].length-2 ), (data.length-2, data[0].length-1 )
        if( temp[ temp.length - 1 ][ temp[0].length - 2 ].infected() )
            iCount++;
        if( temp[ temp.length - 2 ][ temp[0].length - 2 ].infected() )
            iCount++;
        if( temp[ temp.length - 2 ][ temp[0].length - 1 ].infected() )
            iCount++;
        
        // see if corner person is infected
        infectMe = gen.nextDouble();
        infectionChance = (double) iCount * INFECTION_MULTIPLIER;
        
        if( infectMe < infectionChance )
            data[ data.length - 1 ][ data[0].length - 1 ].setInfected( true );
    }
    
    private void processTopRow( Person[][] temp )
    {

        
        for( int i = 1; i < data.length - 1; i++ )
        {
            int iCount = 0;
            
            if( temp[ i - 1 ][ 0 ].infected() )
                iCount++;
            if( temp[ i - 1 ][ 1 ].infected() )
                iCount++;
            if( temp[ i ][ 1 ].infected() )
                iCount++;
            if( temp[ i + 1 ][ 1 ].infected() )
                iCount++;
            if( temp[ i + 1 ][ 0 ].infected() )
                iCount++;
            
            // see if this person is infected
            double infectMe = gen.nextDouble();
            double infectionChance = (double) iCount * INFECTION_MULTIPLIER;
        
            if( infectMe < infectionChance )
                data[ i ][ 0 ].setInfected( true );
        }
    }
    
    private void processBottomRow( Person[][] temp )
    {
        for( int i = 1; i < data.length - 1; i++ )
        {
            int iCount = 0;
            
            if( temp[ i - 1 ][ temp[0].length - 1 ].infected() )
                iCount++;
            if( temp[ i - 1 ][ temp[0].length - 2 ].infected() )
                iCount++;
            if( temp[ i ][ temp[0].length - 2 ].infected() )
                iCount++;
            if( temp[ i + 1 ][ temp[0].length - 2 ].infected() )
                iCount++;
            if( temp[ i + 1 ][ temp[0].length - 1 ].infected() )
                iCount++;
            
            // see if this person is infected
            double infectMe = gen.nextDouble();
            double infectionChance = (double) iCount * INFECTION_MULTIPLIER;
        
            if( infectMe < infectionChance )
                data[ i ][ data[0].length - 1 ].setInfected( true );
        }
    }
    
    private void processLeftColumn( Person[][] temp )
    {
        for( int j = 1; j < data[0].length - 1; j++ )
        {
            int iCount = 0;
            
            if( temp[ 0 ][ j - 1 ].infected() )
                iCount++;
            if( temp[ 1 ][ j - 1 ].infected() )
                iCount++;
            if( temp[ 1 ][ j ].infected() )
                iCount++;
            if( temp[ 0 ][ j + 1 ].infected() )
                iCount++;
            if( temp[ 1 ][ j + 1 ].infected() )
                iCount++;
            
            // see if this person is infected
            double infectMe = gen.nextDouble();
            double infectionChance = (double) iCount * INFECTION_MULTIPLIER;
        
            if( infectMe < infectionChance )
                data[ 0 ][ j ].setInfected( true );
        }
    }
    
    private void processRightColumn( Person[][] temp )
    {   
        for( int j = 1; j < data[0].length - 1; j++ )
        {
            int iCount = 0;
            
            if( temp[ temp.length - 1 ][ j - 1 ].infected() )
                iCount++;
            if( temp[ temp.length - 2 ][ j - 1 ].infected() )
                iCount++;
            if( temp[ temp.length - 2 ][ j ].infected() )
                iCount++;
            if( temp[ temp.length - 2 ][ j + 1 ].infected() )
                iCount++;
            if( temp[ temp.length - 1 ][ j + 1 ].infected() )
                iCount++;
            
            // see if this person is infected
            double infectMe = gen.nextDouble();
            double infectionChance = (double) iCount * INFECTION_MULTIPLIER;
        
            if( infectMe < infectionChance )
                data[ data.length - 1 ][ j ].setInfected( true );
        }
    }
    
    private void processMiddle( Person[][] temp )
    {
        for( int i = 1; i < temp.length - 1; i++ )
        {
            for( int j = 1; j < temp[0].length - 1; j++ )
            {
                int iCount = 0;
                
                // up and left
                if( temp[ i - 1 ][ j - 1 ].infected() )
                    iCount++;
                // above
                if( temp[ i ][ j - 1 ].infected() )
                    iCount++;
                // up and right
                if( temp[ i + 1 ][ j - 1 ].infected() )
                    iCount++;
                // left
                if( temp[ i - 1 ][ j ].infected() )
                    iCount++;
                // right
                if( temp[ i + 1 ][ j ].infected() )
                    iCount++;
                // down and left
                if( temp[ i - 1 ][ j + 1 ].infected() )
                    iCount++;
                // below
                if( temp[ i ][ j + 1 ].infected() )
                    iCount++;
                // down and right
                if( temp[ i + 1 ][ j + 1 ].infected() )
                    iCount++;
                       
                // see if this person is infected
                double infectMe = gen.nextDouble();
                double infectionChance = (double) iCount * INFECTION_MULTIPLIER;
        
                if( infectMe < infectionChance )
                    data[ i ][ j ].setInfected( true );
            }
        }
    }
}