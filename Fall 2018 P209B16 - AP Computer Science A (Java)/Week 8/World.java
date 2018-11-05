import java.util.Random;

public class World
{
    // variables
    private Cell[][] world;
    private int worldSize;
    private Random gen;
    
    // constructor
    public World( int size )
    {
        worldSize = size;
        gen = new Random();
        
        // instantiate the new world at the given size
        world = new Cell[ worldSize ][ worldSize ];
        
        // prepopulate the world randomly
        for( int row = 0; row < world.length; row++ )
        {
            for( int col = 0; col < world[ 0 ].length; col++ )
            {
                // determine if the new cell will be alive or dead
                int randomNum = gen.nextInt( 2 );
                
                // create the new cell
                if( randomNum == 0 )
                {
                    world[ row ][ col ] = new Cell( false );
                }
                else
                {
                    world[ row ][ col ] = new Cell( true );
                }
            }
        }
    }
    
    // display world
    public void displayWorld()
    {
        System.out.println( "Current world state:" );
        
        for( int row = 0; row < world.length; row++ )
        {
            for( int col = 0; col < world[ 0 ].length; col++ )
            {
                if( world[ row ][ col ].alive() )
                {
                    System.out.print( "O" );
                }
                else
                {
                    System.out.print( "." );
                }
            }
            System.out.println();
        }
    }
    
    // generation function - one iteration
    public void generation()
    {
        // this is the temporary world that will hold the newly generated state
        Cell[][] tempWorld = new Cell[ worldSize ][ worldSize ];
        
        // YOUR CODE GOES HERE
        
        // do edge and corner cells
        tempWorld = handleCornerCells(tempWorld);
        tempWorld = handleEdges(tempWorld);
        
        //do all inner cells
        tempWorld = handleInnards(tempWorld);
        
        // wcopy tempWorld over the old world
        world = tempWorld;
    }
    
    private Cell[][] handleCornerCells(Cell[][] world)
    {
        //handle for corners
        Cell[][] tempWorld = new Cell[ worldSize ][ worldSize ];
        
        return tempWorld;
    }
    
    private Cell[][] handleEdges(Cell[][] world)
    {
        //handle edges *not corners*
        Cell[][] tempWorld = new Cell[ worldSize ][ worldSize ];
        
        return tempWorld;
    }
    
    private Cell[][] handleInnards(Cell[][] world)
    {
        //handle all cells that are not edges nor corners
        Cell[][] tempWorld = new Cell[ worldSize ][ worldSize ];
        
        return tempWorld;
    }
    
    
    private boolean handleCell(Cell[][] world, int row, int col)
    {
        //handle all cells that are not edges nor corners
        Cell[][] tempWorld = new Cell[ worldSize ][ worldSize ];
        boolean alive = false;
        //if fewer than 2 or more than3 neighbors - die
        //loop aruond all 9 cells, cound number dead and alive
        //no, do manual calc for corner and edge
        //for (int num = 0; int >
        if( tempWorld[row-1][col-1].alive() )
        {
            alive = true;
        }
        //if 2 or 3 neighbors - live
        
        //if dead cell has 3 neighbors then alive
        
        return alive;
    }
}
        