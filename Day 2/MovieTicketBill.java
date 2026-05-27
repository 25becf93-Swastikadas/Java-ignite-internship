package HelloWorld;
import java.util.Scanner;
public class MovieTicketBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the movie name");
		String name=sc.nextLine();
		System.out.println("Enter the ticket price");
		double price=sc.nextDouble();
		System.out.println("Enter the quantity");
		int quan=sc.nextInt();
		double bill= price*quan;
		System.out.println("Movie:"+name);
		System.out.println("ticket price:"+price);
		System.out.println("Quantity:"+quan);
		System.out.println("Total bill:"+bill);
		sc.close();
		

	}

}
