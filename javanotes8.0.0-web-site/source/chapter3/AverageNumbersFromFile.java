import textio.TextIO;

/**
 * This program reads numbers from a file.  It computes the sum and 
 * the average of the numbers that it reads.  The file should contain 
 * nothing but numbers of type double; if this is not the case, the 
 * output will be the sum and average of however many numbers were 
 * successfully read from the file.  The name of the file will be
 * input by the user.
 */
public class AverageNumbersFromFile {

    public static void main(String[] args) {

        while (true) {
            String fileName;  // The name of the file, to be input by the user.
            System.out.print("Enter the name of the file: ");
            fileName = TextIO.getln();
            try {
                TextIO.readFile( fileName );  // Try to open the file for input.
                break;  // If that succeeds, break out of the loop.
            }
            catch ( IllegalArgumentException e ) {
                System.out.println("Can't read from the file \"" + fileName + "\".");
                System.out.println("Please try again.\n");
            }
        }

        /* At this point, TextIO is reading from the file. */

        double number;  // A number read from the data file.
        double sum;     // The sum of all the numbers read so far.
        int count;      // The number of numbers that were read.

        sum = 0;
        count = 0;

        try {
            while (true) { // Loop ends when an exception occurs.
                number = TextIO.getDouble();
                count++;  // This is skipped when the exception occurs
                sum += number;
            }
        }
        catch ( IllegalArgumentException e ) {
            // We expect this to occur when the end-of-file is encountered.
            // We don't consider this to be an error, so there is nothing to do
            // in this catch clause.  Just proceed with the rest of the program.
        }

        // At this point, we've read the entire file.

        System.out.println();
        System.out.println("Number of data values read: " + count);
        System.out.println("The sum of the data values: " + sum);
        if ( count == 0 )
            System.out.println("Can't compute an average of 0 values.");
        else
            System.out.println("The average of the values:  " + (sum/count));

    }

}