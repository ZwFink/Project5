package p5_Package;

public class IteratorClass {
    /**
     * Constant value for initializing default capacity array
     */
    private static int DEFAULT_CAPACITY = 10;

    /**
     * Provides constant -999999 for access failure message
     */
    private static int FAILED_ACCESS = -999999;

    /**
     * Default integer value to put into newly created integer arrays
     */
    private static int FILL_VALUE = 0;

    /**
     * Stores current capacity of utility class
     */
    private int iterCapacity;

    /**
     * Stores current size of utility class
     */
    private int iterSize;

    /**
     * Stores iterator index
     */
    private int iterIndex;

    /**
     * Stores iterator index
     */
    private int[] iterStorage;

    /**
     * Default constructor
     */
    public IteratorClass()
    {
       iterCapacity = DEFAULT_CAPACITY;
       iterIndex = 0;

       iterStorage = new int[ DEFAULT_CAPACITY ];
    }
    /**
     * Initialization constructor
     * <p> Initializes array capacity, iterator index, prepares class for use
     * @param capacitySetting Initial capacity of storage class
     */
    public IteratorClass( int capacitySetting )
    {
       iterCapacity = capacitySetting;
       iterIndex = 0;
       iterSize = 0;

       iterStorage = new int[ capacitySetting ];
       // TODO finish implementation of constructor
    }

    /**
     * Copy constructor
     * <p> copies iteratorClass object into this object
     * @param copied
     */
    public IteratorClass( IteratorClass copied )
    {
       iterCapacity = copied.iterCapacity;
       iterIndex = copied.iterIndex;

       int index = 0;

       // copy elements of this array to the other's
       for( index = 0; index < iterCapacity; index++ )
       {
           iterStorage[ index ] = copied.iterStorage[ index ];
       }
    }

    /**
     * Clears iterator array by setting size and iterator index to zero
     */
    public void clear()
    {
        iterSize = 0;
        iterIndex = 0;
    }

    /**
     * Sets iterator to beginning of list
     */
    public void setToBeginning()
    {
        iterIndex = 0;
    }

    /**
     * checks for empty list
     * @return Boolean true if list is empty, false otherwise
     */
    public boolean isEmpty()
    {
        return(  iterSize == 0 );
    }

    /**
     * Checks for iterator at beginning of list
     * @return boolean true if iterator is at beginning of list, false otherwise
     */
    public boolean isAtBeginning()
    {
        return ( iterIndex == 0 );
    }

    /**
     * Checks for iterator at end of list
     * @return boolean true if iterator at end of list, false otherwise
     */
    public boolean isAtEnd()
    {
        return ( iterIndex == iterSize );
    }

    /**
     * Gets value at current location of iterator
     * @return integer value the item at iterator
     */
    public int retrieveAtCurrent()
    {
        return iterStorage[ iterIndex ];
    }

    /**
     * Move iterator cursor ot previous item if not currently at beginning
     */
    public void movePrevious()
    {
        if ( !isAtBeginning() )
        {
           iterIndex--;
        }
    }

    /**
     * Move iterator cursor to next item if not currently at end
     */
    public void moveNext()
    {
        if ( !isAtEnd() )
        {
           iterIndex++;
        }
    }

    /**
     * Checks for resize and resizes to twice the current capacity if needed
     */
    private void checkForReSize()
    {
        int[] newArray;
        int index = 0;
        int newCapacity = iterCapacity * 2;

        if( iterSize + 1 >= iterCapacity )
        {
           newArray = new int[ newCapacity ];


           for( index = 0; index < newCapacity; index++ )
           {
                if( index < iterSize )
                {
                    newArray[ index ] = iterStorage[ index ];
                }
                else
                {
                    newArray[ index ] = FILL_VALUE;
                }
           }

           iterStorage = newArray;
           iterCapacity = newCapacity;
        }
    }

    /**
     * Inserts item prior to iterator index in list.
     * <p> Iterator points to inserted item after completion
     * <p> Resizes array if needed
     * @param newValue
     */
    public void insertPriorToIterator( int newValue )
    {
        checkForReSize();

        int index = 0;
        int tempVal = 0;

        // move elements over one
        for( index = iterIndex + 1; index > 0; index-- )
        {
            iterStorage[ index + 1 ] = iterStorage[ index ];
        }
        // put new value where it belongs
        iterStorage[ iterIndex ] = newValue;

        iterSize++;
    }
}
