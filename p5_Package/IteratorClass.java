package p5_Package;

public class IteratorClass {
    /**
     * Constant value for initializing default capacity array
     */
    private static int DEFAULT_CAPACITY = 10;

    /**
     * Provides constant -999999 for access failure message
     */
    static int FAILED_ACCESS = -999999;

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
        return ( iterIndex == iterCapacity );
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
}
