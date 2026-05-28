package day3;
import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int bill=0;
		System.out.println("1.Domestic 2.Commercial 3.Industrial");
		System.out.println("Enter your choice");
		String ch= sc.nextLine();
		System.out.println("Enter units consumed");
		int unit=sc.nextInt();
		switch(ch)
		{
		case "Domestic":
			if(unit<=100)
			{
				System.out.println("Free");
			}
			else if(unit>=101 && unit<=300)
			{
				bill= (unit-100)*5;
			}
			else
			{
				bill=(unit-300)*8+(unit-100)*5;
			}
			System.out.println("Bill:"+bill);
			break;
		case "Commercial":
			if(unit<200)
			{
				bill= unit*10;
			}
			else if(unit>=200)
			{
				bill=(unit-200)*15;
			}
			System.out.println("Bill:"+bill);
			break;
		case "Industrial":
			if(unit>500)
			{
				System.out.println("Enter power factor(good/bad)");
				String pf = sc.nextLine();
				switch(pf)
				{
				case "good":
					double dis=(unit*20)-(0.1)*(unit*20);
					System.out.println("Bill:"+dis);
					break;
				default:
					bill= unit*20;
					System.out.println("Bill:"+bill);
					break;
				}
			}
			else
			{
				System.out.println("Bill:"+(unit*20));
			}
			break;
			
			default:
				System.out.println("Invalid choice");
			
		}
		sc.close();

	}

}
