package p5_Package;

/**
 * Class manages data in queue form, using IteratorClass
 * @author Zane Fink
 */
public class QueueClass {
    /**
     * Queue data managed by IteratorClass object
     */
    IteratorClass queueData;

    /**
     * Default constructor.
     */
    public QueueClass()
    {
        queueData = new IteratorClass();
    }

    /**
     * Initialization constructor, constructs QueueClass with initial capacity
     * @param setCapacity Integer capacity of object
     */
    public QueueClass( int setCapacity )
    {
        queueData = new IteratorClass( setCapacity );
    }

    /**
     * Copies a QueueClass object
     * @param copied QueueClass object to be copied
     */
    public QueueClass( QueueClass copied )
    {
        queueData = new IteratorClass( copied.queueData );
    }

    /**
     * Views data at front of queue
     * @return integer value found at front of queue
     */
    public int peekFront()
    {
       queueData.setToEnd();

       return queueData.retrieveAtCurrent();
    }

    /**
     * Enqueues data to queue
     * @param value integer data to be enqueued
     */
    public void enqueue( int value )
    {
       queueData.setToBeginning();
       queueData.insertPriorToIterator( value );
    }

    /**
     * Dequeues data from queue
     * @return Integer value removed from queue
     */
    public int dequeue()
    {
       queueData.setToEnd();
       return queueData.removeAtCurrent();
    }

    /**
     * Clears queue Data
     */
    public void clear()
    {
        queueData.clear();
    }

    /**
     * Provides array data as a string
     * @return
     */
    public String toString()
    {
        return queueData.toString();
    }
}
