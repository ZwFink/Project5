package p5_Package;

public class IteratorClassMain {
    public static void main( String[] args )
    {
        IteratorClass ic = new IteratorClass( 5 );
        final int NUMBER = 20;
        for( int index = 0; index < NUMBER; index++ )
        {
            ic.insertPriorToIterator( index );
            ic.moveNext();
        }
        System.out.println(ic);
        ic.movePrevious();
        System.out.println(ic);
        ic.movePrevious();
        System.out.println(ic);
        ic.insertAfterIterator( 300 );
        System.out.println(ic);
        ic.movePrevious();
        System.out.println(ic);
        ic.movePrevious();
        ic.movePrevious();
        ic.movePrevious();
        System.out.println(ic);
        ic.removeAtCurrent();
        ic.removeAtCurrent();
        ic.removeAtCurrent();
        ic.removeAtCurrent();
        ic.removeAtCurrent();
        System.out.println(ic);
    }
}
