package HelloWorld;

import java.util.Scanner;

public class AssgnQ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter distance travelled(in kms)");
		double dist=sc.nextDouble();
		System.out.println("Enter petrol price");
		double price=sc.nextDouble();
		System.out.println("Enter vehicle mileage");
		int mil=sc.nextInt();
		double petrol= dist/mil;
		double cost=petrol*price;
		System.out.println("Petrol needed:"+petrol);
		System.out.println("Total travel cost:"+cost);
		sc.close();
		

	}

}
