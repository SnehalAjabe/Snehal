
public class STARPyramid1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<=5;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=7;k>(i*2);k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
