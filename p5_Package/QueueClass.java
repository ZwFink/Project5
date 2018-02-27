package p5_Package;

/**
 * Class manages data in queue form, using IteratorClass
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
     * @param setCapacity
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

}
