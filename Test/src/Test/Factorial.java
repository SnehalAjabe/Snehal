package Test;

public class Factorial {

	
	
	public  static int factorial(int num) {
		 int fact = 1;
		///if(num==1)
			// return 1;
		 
		for(int i=1;i<=num;i++) {
		 fact=fact*i;
		}
		return fact;
	}
	 public static int fact(int num) {
		 if(num==0)
		 {
			 return 1;
		 }
		 else
		 {
			 return(num*fact(num-1));
		 }
		 
	 }
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 System.out.println(factorial(4));
	System.out.println(factorial(5));
	System.out.println((1));
	System.out.println(factorial(3));
	
	}
}

// int a=5;
 //int fact=1;
 // for(int i=1;i<=a;i++)
  //{
	//  fact=fact*i;
	  
//  }
	//System.out.println(fact);
  

 