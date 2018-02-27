package p5_Package;

public class StackClassMain {
    public static void main( String[] args )
    {
        StackClass stack = new StackClass( 10 );
        for( int index = 0; index < 20; index++ )
        {
            stack.push( index );
        }
        System.out.println(stack.stackData);
        System.out.println( stack.peekTop() );
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack.stackData);
        StackClass sto = new StackClass( stack );
        System.out.println(stack.stackData);
    }
}
