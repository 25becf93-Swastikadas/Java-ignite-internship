package day3;
import java.util.Scanner;

public class Restaurant_Ordering {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter menu (veg/non-veg):");
		String main_menu= sc.nextLine();
		
		switch(main_menu)
		{
		case "veg":
			System.out.println("Item selection:1.Fried Rice-Rs.200 2.Noodles-Rs.100");
			int menu = sc.nextInt();
			switch(menu)
			{
			case 1:
				System.out.println(" Enter Quantity:");
				int qty = sc.nextInt();
				System.out.println("Member:1.Gold 2.Silver 3.Normal");
				int mem = sc.nextInt();
				int total = 200*qty;
				switch(mem)
				{
				case 1:
					double dis= 0.2*total;
					double bill=total-dis;
					if(bill>2000) {
					System.out.println("Bill: Rs."+bill+"\nFree desert!");
					}
					else
					{
						System.out.println("Bill: Rs."+bill);
					}
				break;
				
				case 2:
					dis= 0.1*total;
					bill=total-dis;
					System.out.println("Bill: Rs."+bill);
				break;
				
				case 3:
					System.out.println("Bill: Rs."+total);
					break;
				default:
					System.out.println("Invalid membership");
				}
			break;
			
			case 2:
				System.out.println(" Enter quantity:");
				 qty = sc.nextInt();
				System.out.println("Member: 1.Gold 2.Silver 3.Normal");
				mem = sc.nextInt();
				 total = 100*qty;
				switch(mem)
				{
				case 1:
					double dis= 0.2*total;
					double bill=total-dis;
					if(bill>2000) {
					System.out.println("Bill: Rs."+bill+"\nFree desert!");
					}
					else
					{
						System.out.println("Bill: Rs."+bill);
					}
				break;
				
				case 2:
					dis= 0.1*total;
					bill=total-dis;
					System.out.println("Bill: Rs."+bill);
				break;
				
				case 3:
					System.out.println("Bill: Rs."+total);
					break;
				default:
					System.out.println("Invalid membership");
				}
			break;
			
			default:
				System.out.println("Invalid menu");
			}
		break;
		
		case "non-veg":
			System.out.println("Item selection: 1.Chicken Biryani- Rs.200 2.Grill Chicken- Rs.100");
			 menu = sc.nextInt();
			switch(menu)
			{
			case 1:
				System.out.println(" Enter Quantity:");
				int qty = sc.nextInt();
				System.out.println("Member: 1.Gold 2.Silver 3.Normal");
				int mem = sc.nextInt();
				int total = 200*qty;
				switch(mem)
				{
				case 1:
					double dis= 0.2*total;
					double bill=total-dis;
					if(bill>2000) {
					System.out.println("Bill: Rs."+bill+"\nFree desert!");
					}
					else
					{
						System.out.println("Bill: Rs."+bill);
					}
				break;
				
				case 2:
					dis= 0.1*total;
					bill=total-dis;
					System.out.println("Bill: Rs."+bill);
				break;
				
				case 3:
					System.out.println("Bill: Rs."+total);
					break;
				default:
					System.out.println("Invalid membership");
				}
			break;
			
			case 2:
				System.out.println(" Enter Quantity:");
				 qty = sc.nextInt();
				System.out.println("Member: 1.Gold 2.Silver 3.Normal");
				 mem = sc.nextInt();
				 total = 100*qty;
				switch(mem)
				{
				case 1:
					double dis= 0.2*total;
					double bill=total-dis;
					if(bill>2000) {
					System.out.println("Bill: Rs."+bill+"\nFree desert!");
					}
					else
					{
						System.out.println("Bill: Rs."+bill);
					}
				break;
				
				case 2:
					dis= 0.1*total;
					bill=total-dis;
					System.out.println("Bill: Rs."+bill);
				break;
				
				case 3:
					System.out.println("Bill: Rs."+total);
					break;
				default:
					System.out.println("Invalid membership");
				}
			break;
			
			default:
				System.out.println("Invalid menu");
			}
		break;
			
		}
		sc.close();

	}

}
