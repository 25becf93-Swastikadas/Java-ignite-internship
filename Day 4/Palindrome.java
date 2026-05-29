package day4;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check for palindrome");
		int n=sc.nextInt();
		int t=n;
		int d,rev=0;
		while(t!=0)
		{
			d=t%10;
			rev= (rev*10)+d;
			t=t/10;
		}
		if(rev==n)
		{
			System.out.println("Palindrome Number");
		}
		else
		{
			System.out.println("Not a Palindrome Number");
		}
		sc.close();

	}

}
