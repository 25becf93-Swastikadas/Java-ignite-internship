package HelloWorld;
import java.util.Scanner;
public class Bill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("BILL GENERATOR");
		System.out.println("Enter customer name");
		String name=sc.nextLine();
		System.out.println("Enter product name");
		String prod=sc.nextLine();
		System.out.println("Enter product price");
		int price=sc.nextInt();
		System.out.println("Enter the quantity of product");
		int quan=sc.nextInt();
		int total= price*quan;
		System.out.println("Customer name:"+name);
		System.out.println("Product:"+prod);
		System.out.println("Price:"+price);
		System.out.println("Quantity:"+quan);
		System.out.println("Total bill:"+total);
		sc.close();
		

	}

}
