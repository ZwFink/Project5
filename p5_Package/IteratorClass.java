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
}
