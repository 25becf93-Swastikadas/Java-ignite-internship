package day3;
import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num from 1 to 7");
		int day = sc.nextInt();
		switch(day)
		{
		case 1:
			System.out.println("Mon");
			break;
		case 2:
			System.out.println("Tue");
			break;
		case 3:
			System.out.println("Wed");
			break;
		case 4:
			System.out.println("Thu");
			break;
		case 5:
			System.out.println("Fri");
			break;
		case 6:
			System.out.println("Sat");
			break;
		case 7:
			System.out.println("Sun");
			break;
		default:
			System.out.println("Invalid input");
			break;
		}
		sc.close();

	}

}
