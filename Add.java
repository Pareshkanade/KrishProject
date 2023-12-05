
public class Add
{
    public static void main( String ar [ ] )
    {

	Scanner sc = new Scanner( System.in );
	int n1, n2, sum; 

	System.out.print("\n\n\t Enter first number ");
	n1 = sc.nextInt( ) ;

	System.out.print("\n\n\t Enter Second number ");
	n2 = sc.nextInt( ) ;

	sum = n1 + n2 ;

	System.out.print("\n\n\t Addition is " + sum );

    }
}