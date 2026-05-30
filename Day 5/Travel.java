package day5;
import java.util.Scanner;

public class Travel {
	double petrol_p(double d,double m,double p)
	{
		double total=d/m;
		return p*total;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the distance travelled");
		double d= sc.nextDouble();
		System.out.println("Enter the price of petrol per litre");
		double p= sc.nextDouble();
		System.out.println("Enter the mileage");
		double m= sc.nextDouble();
		Travel pp= new Travel();
		double price= pp.petrol_p(d,p,m);
		System.out.println("The total travel cost is: "+price);
		sc.close();

	}

}
