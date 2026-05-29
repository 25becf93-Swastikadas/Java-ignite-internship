package day4;
import java.util.Scanner;

public class ATM_retry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int cpin= 1234;
		System.out.println("Enter the PIN" );
		int pin=sc.nextInt();
		while(pin!=cpin)
		{
			System.out.println("Enter the PIN");
			pin=sc.nextInt();
		}
		System.out.println("Success!");
		sc.close();

	}

}
