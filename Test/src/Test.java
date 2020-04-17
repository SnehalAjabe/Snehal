
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		
		//int i = 6 ;
		//for(int j = 0 ; j< 5;j++) {
			//System.out.println("hi");
		//}
		
		
//		for(int a = 0 ; a<5;a++) {
//			for(int b= 0 ; b<5;b++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
		
		
//		for(int a = 1 ; a<5;a++) {
////			System.out.print("a:"+a+" ");
//			for(int b= 0 ; b<a;b++) {
////				System.out.print(" "+a +" "+b);
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
		
		//int x = 5 ;//
		//for(int a = 1 ; a<= x ; a++) {
//			for(int b=(x-a);b>=1;b--) {
//				System.out.print(" ");
//			}
			///for(int j=1;j<=a;j++) {
				//System.out.print(" ");
//			}
			///for( int c =(x-a);c >=1 ; c--) {
				//System.out.print("*");
		///	}
			
//			for(int b=0; b <(x-a);b++) {
//				System.out.print(" ");
//			}
			
		//	System.out.println("");
	///	}
//	}

//}
	{
int[]a= {4,9,7,12,17,11,99,44};
int b;
int c=a.length;
System.out.print("Oriniginal Array");
for(int i = 0;i<a.length;i++)
{
	System.out.print(a[i] + " ");

}

for(int i=0; i<c/2;i++)
{
	b=a[c-1];
	a[c-1]=a[i];
	a[i]=b;
	c--;
	
}
System.out.print("Reverse the array");
for(int i=0; i<a.length; i++)
{
	System.out.print(a[i] + " ");
	
}
}
}
}
	