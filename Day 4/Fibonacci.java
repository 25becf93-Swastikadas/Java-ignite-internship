package day4;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int first=0,sec=1,next;
		System.out.println("Enter the number of terms");
		int n=sc.nextInt();
		System.out.println("Fibonacci Series:");
		for(int i=1;i<=n;i++)
		{
			System.out.println(first);
			next=first+sec;
			first=sec;
			sec=next;
		}
		sc.close();
        
	}

}
