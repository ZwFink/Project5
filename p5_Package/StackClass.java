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

    /**
     * Places a value on the stack
     * @param value integer value to be placed on stack
     */
    public void push( int value )
    {
        stackData.setToEnd();
        stackData.insertAfterIterator( value );
    }

    /**
     * Removes a value from the top of the stack
     * @return integer value removed from the top of the stack
     */
    public int pop()
    {
        int returnVal = 0;

        stackData.setToEnd();
        returnVal = stackData.removeAtCurrent();
        return returnVal;
    }

    /**
     * Clears stack data
     */
    public void clear()
    {
        stackData.clear();
    }

    public String toString()
    {
        return stackData.toString();
    }

}
