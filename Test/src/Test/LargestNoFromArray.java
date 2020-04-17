package Test;

public class LargestNoFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {10,50,60,20,30,55};
		  
		
		
		int max=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println(max);
		
	}

}