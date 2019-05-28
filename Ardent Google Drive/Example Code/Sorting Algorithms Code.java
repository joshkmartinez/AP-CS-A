public class Sorts
{
    public static void main( String[] args )
    {
        int[] numbers = { 8, 2, 4, 1, 9, 6, 5, 0, 7, 3 };
        
        // ENABLE/DISABLE each sort type by commenting it in/out
        // SelectionSort( numbers );
        // InsertionSort( numbers );
        MergeSort( numbers );
        
        System.out.println();
        // use a for-each loop to print out the array
        for( int i : numbers )
        {
            System.out.print( i + " " );
        }
    }
    
    public static void SelectionSort( int[] nums )
    {
        for( int i = 0; i < nums.length; i++ )
        {
            int index = i;
            
            for( int j = i + 1; j < nums.length; j++ )
            {
                if( nums[ j ] < nums[ index ] )
                {
                    index = j;
                }
            }
            
            if( index != i )
            {
                int temp = nums[ i ];
                nums[ i ] = nums[ index ];
                nums[ index ] = temp;
            }
        }
    
    }
    
    public static void InsertionSort( int[] nums )
    {
        for( int i = 1; i< nums.length; i++ )
        {
            int next = nums[ i ];
            
            // find the insert loc while shifting everything up
            int j = i;
            while( j > 0 && nums[ j - 1 ] > next )
            {
                nums[ j ] = nums[ j - 1 ];
                j--;
            }
            
            // insert
            nums[ j ] = next;
        }
    }
    
    public static void MergeSort( int[] nums )
    {
        // find midpoint
        int size = nums.length;
        
        // stop the recursion when we hit 2
        if( size < 2 )
        {
            return;
        }
        
        int mid = size / 2;
        
        // split the arrays at mid
        int leftSize = mid;
        int rightSize = size - mid;
        int[] left = new int[ leftSize ];
        int[] right = new int[ rightSize ];
        
        for( int i = 0; i < mid; i++ )
        {
            left[ i ] = nums[ i ];
        }
        
        for( int i = mid; i < size; i++ )
        {
            right[ i - mid ] = nums[ i ];
        }
        
        // recursive sort on both halves
        MergeSort( left );
        MergeSort( right );
        
        // merge
        merge( left, right, nums );
    }
    
    public static void merge( int[] left, int[] right, int[] nums )
    {
        int leftSize = left.length;
        int rightSize = right.length;
        int i = 0;
        int j = 0;
        int k = 0;
        
        while( i < leftSize && j < rightSize )
        {
            if( left[ i ] <= right[ j ] )
            {
                nums[ k ] = left[ i ];
                i++;
                k++;
            }
            else
            {
                nums[ k ] = right[ j ];
                k++;
                j++;
            }
        }
            
        while( i < leftSize )
        {
            nums[ k ] = left[ i ];
            k++;
            i++;
        }
            
        while( j < rightSize )
        {
            nums[ k ] = right[ j ];
            k++;
            j++;
        }
    }
}
