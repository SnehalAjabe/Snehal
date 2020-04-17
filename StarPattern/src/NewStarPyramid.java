
public class NewStarPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i=0; i<=5; i++)
		{
		// Print space in decreasing order
		for (int j=5; j>i; j--)
		{
		System.out.print(" ");
		}
		// Print star in increasing order
		for (int k=0; k<=(i * 2); k++)
		{
		System.out.print("*");
		}
		System.out.println();
		}
		
		for (int i=0; i<=5; i++)
		{
		// Print space in increasing order
		for (int j=0; j<=i; j++)
		{
		System.out.print(" ");
		}
		// Print star in decreasing order
		for (int k=7; k>=(i * 2)-1; k--)
		{
		System.out.print("*");
		}
		System.out.println();
		
		}
	}
}
