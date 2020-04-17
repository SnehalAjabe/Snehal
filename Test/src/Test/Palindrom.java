package Test;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stubn
		Scanner sc= new Scanner(System.in);
		int number = sc.nextInt(); 
        int rem;
        int rev=0;
		
		int temp= number;
		while(temp!=0)
		{
			rem= temp%10;
			rev= rev*10+rem;
			temp= temp/10;
			
		}
		if (rev==number)
		{
			System.out.println("no is palindrome");
		}
		else
		{
			System.out.println("no is not palindrome ");
		}
		}
	}


