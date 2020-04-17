package Test;

public class AmstrongNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=54748;
		
		int r;
		int temp=n;
		int sum=0;
		
		while(n>0)
		{
			r=n%10;
			n=n/10;
			sum=sum+r*r*r*r*r;
		}
	if(temp==sum)
	{
		System.out.println("no is amstrong no");
	}
	
	else
	{
		System.out.println("no is nott amstrong no");
	}
	
	}
	

}
