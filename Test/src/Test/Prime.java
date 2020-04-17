package Test;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


// TO Print prime no from Array

	int a[]= {10,6,2,12,15,4,17,21,19,22};
    
	for (int i=0;i<a.length;i++)
	{
		int temp=0;
		 
		for(int j=2;j<a[i];j++)
		{
			if(a[i]%j==0)
			{
				temp++;
			}
		}
		if(temp==0)
		{
			System.out.println(a[i]+ " ");
		}
	  }
	

// TO PRINT Prime no Between given Range//

	for(int i=0;i<=100;i++)
	{
		for(int j=2;j<=i;j++)
		{
			if(j==i)
			{
				System.out.print(i + " ");
				
			}
		if(i%j==0)
		{
			break;
		}
		}
	}
	}
}