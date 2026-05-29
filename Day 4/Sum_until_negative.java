package day4;
import java.util.Scanner;

public class Sum_until_negative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n,sum=0;
		do
		{
			System.out.println("Enter a number");
			n=sc.nextInt();
			if(n>0)
			{
				sum=sum+n;
			}
		}
		while(n>0);
		System.out.println("Sum: "+sum);
		sc.close();

	}

}
