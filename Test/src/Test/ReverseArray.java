package Test;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {5,10,15,20,25,23};
		 int temp;
		 int c=a.length;

		 System.out.println(" Original Array is ");
		 
		 for(int i=0;i<a.length;i++)
		 {
			 System.out.print(" " +a[i]+ " ");
		 }
		
		 for(int i=0;i<c/2;i++)
		 {
				temp=a[c-1];
				a[c-1]=a[i];
				a[i]=temp;
				c--;
		}
	System.out.println("Reverse Array");
	
	for(int i=0;i<a.length;i++)
	{
		System.out.print(a[i]+  " ");
	}
	
	}
	

}
