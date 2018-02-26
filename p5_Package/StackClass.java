package p5_Package;

/**
 * Class manages data in stack form, using IteratorClass
 * @author Zane Fink
 */
public class StackClass {

    /**
     *  stack data to be managed by iterator object
     */
    IteratorClass stackData;

    /**
     * Default constructor
     */
    public StackClass()
    {
        stackData = new IteratorClass();
    }

    /**
     * Initialization constructor, constructs StackClass with initial capacity
     * @param setCapacity integer value to set capacity of stack array
     */
    public StackClass( int setCapacity )
    {
    stackData = new IteratorClass( setCapacity );
    }

    /**
     * Copies a stackClass object
     * @param copied the StackClass object to be copied
     */
    public StackClass( StackClass copied )
    {
        stackData = new IteratorClass( copied.stackData );
    }

    /**
     * views the value on the top of the stack
     * @return Integer value found on the top of the stack
     */
    public int peekTop()
    {
        int returnVal;
        stackData.setToEnd();
        returnVal = stackData.retrieveAtCurrent();

        return returnVal;
    }

    
}
