package day3;
import java.util.Scanner;
public class FoodMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num from 1-4");
		int n= sc.nextInt();
		switch(n)
		{
		case 1:
			System.out.println("Pizza");
			break;
		case 2:
			System.out.println("Burger");
			break;
		case 3:
			System.out.println("juice");
			break;
		case 4:
			System.out.println("Icecream");
			break;
		default:
			System.out.println("Invalid input");
			break;
		}
		sc.close();

	}

}
