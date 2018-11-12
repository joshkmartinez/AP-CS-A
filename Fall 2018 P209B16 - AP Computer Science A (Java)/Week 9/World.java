import java.util.Scanner;
import java.util.Random;

public class World {
    // variables
    private Cell[][] world;
    private int worldSize;
    private Random gen;

    // constructor
    public World(int size) {
        worldSize = size;
        gen = new Random();

        // instantiate the new world at the given size
        world = new Cell[worldSize][worldSize];

        // prepopulate the world randomly
        for (int row = 0; row < world.length; row++) {
            for (int col = 0; col < world[0].length; col++) {
                // determine if the new cell will be alive or dead
                int randomNum = gen.nextInt(2);
                
                // create the new cell
                if (randomNum == 0) {
                    world[row][col] = new Cell(false);
                } else {
                    world[row][col] = new Cell(true);
                }
            }
        }
    }

    // display world
    public void displayWorld() {
        System.out.println("Current world state:");

        for (int row = 0; row < world.length; row++) {
            for (int col = 0; col < world[0].length; col++) {
                if (world[row][col].alive()) {
                    System.out.print("0");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // generation function - one iteration
    public void generation() {
        // this is the temporary world that will hold the newly generated state
        Cell[][] tempWorld = world;

        // YOUR CODE GOES HERE
        /*
         * // do corner cells tempWorld = handleCornerCells(tempWorld);
         * 
         * //do edge cells tempWorld = handleEdges(tempWorld);
         * 
         * //do all inner cells tempWorld = handleInnards(tempWorld);
         */

        // make tempWorld2 an array of ints
        int[][] tempWorld2 = new int[world.length][world[0].length];
        for (int row = 0; row < world.length; row++) {
            for (int col = 0; col < world[0].length; col++) {
                if (world[row][col].alive()) {
                    tempWorld2[row][col] = 1;
                } else {
                    tempWorld2[row][col] = 0;
                }

            }
            world = nextGeneration(tempWorld2, world.length, world[0].length);
        }
    }

    static Cell[][] nextGeneration(int grid[][], int M, int N) {
        int[][] future = new int[M][N];
        Cell[][] ans = new Cell[M][N];

        // Loop through every cell
        for (int l = 1; l < M - 1; l++) {
            for (int m = 1; m < N - 1; m++) {
                // finding no. of Neighbours that are alive
                int aliveNeighbours = 0;
                for (int i = -1; i <= 1; i++)
                    for (int j = -1; j <= 1; j++)
                        aliveNeighbours += grid[l + i][m + j];

                // The cell needs to be subtracted from
                // its neighbours as it was counted before
                aliveNeighbours -= grid[l][m];

                // Implementing the Rules of Life

                // Cell is lonely and dies
                if ((grid[l][m] == 1) && (aliveNeighbours < 2))
                    future[l][m] = 0;

                // Cell dies due to over population
                else if ((grid[l][m] == 1) && (aliveNeighbours > 3))
                    future[l][m] = 0;

                // A new cell is born
                else if ((grid[l][m] == 0) && (aliveNeighbours == 3))
                    future[l][m] = 1;

                // Remains the same
                else
                    future[l][m] = grid[l][m];
            }
        }
        /*
         * System.out.println("Next Generation"); for (int i = 0; i < M; i++) { for (int
         * j = 0; j < N; j++) { if (future[i][j] == 0) System.out.print("."); else
         * System.out.print("*"); } System.out.println(); }
         */
        for (int row = 0; row < future.length; row++) {
            for (int col = 0; col < future[0].length; col++) {
                if (future[row][col] == 1) {
                    ans[row][col] = new Cell(true);
                } else {
                    ans[row][col] = new Cell(false);
                }

            }
        }
        return ans;
    }

    private Cell[][] handleCornerCells(Cell[][] world) {
        // handle for corners
        Cell[][] tempWorld = world;
        // System.out.println("corner"+Arrays.toString(tempWorld[0][0]));
        // tempWorld=handleCell(world, 0, 0, "Corner");

        return tempWorld;
    }

    private Cell[][] handleEdges(Cell[][] world) {
        // handle edges *not corners*
        Cell[][] tempWorld = world;

        return tempWorld;
    }

    private Cell[][] handleInnards(Cell[][] world) {
        // handle all cells that are not edges nor corners
        Cell[][] tempWorld = world;

        return tempWorld;
    }

    private boolean handleCell(Cell[][] world, int row, int col, String type) {
        // handle all cells that are not edges nor corners
        Cell[][] tempWorld = world;
        boolean alive = false;
        // if fewer than 2 or more than3 neighbors - die
        // loop aruond all 9 cells, cound number dead and alive
        // no, do manual calc for corner and edge
        // for (int num = 0; int >
        if (tempWorld[row - 1][col - 1].alive()) {
            alive = true;
        }
        // if 2 or 3 neighbors - live

        // if dead cell has 3 neighbors then alive

        return alive;
    }
}
