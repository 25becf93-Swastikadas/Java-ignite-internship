package HelloWorld;
import java.util.Scanner;

public class Atm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the account holder name");
		String name=sc.nextLine();
		System.out.println("Enter account balance");
		double bal=sc.nextDouble();
		System.out.println("Ener withdrawal amount");
		double amt=sc.nextDouble();
		double rem=bal-amt;
		System.out.println("Remaining balance:"+rem);
		System.out.println("balance>withdrawal:"+(bal>amt));
		sc.close();
		
	}

}
