package p5_Package;

public class QueueClassMain {
    public static void main( String[] args )
    {
        QueueClass dog = new QueueClass();
        QueueClass cat = new QueueClass( 30 );

        for( int index = 0; index < 20; index++ )
        {
           dog.enqueue( index );
           cat.enqueue( index );
        }
        QueueClass rat = new QueueClass( cat );

        rat.dequeue();
        System.out.println( rat );
        rat.clear();
        System.out.println( rat );


    }
}
