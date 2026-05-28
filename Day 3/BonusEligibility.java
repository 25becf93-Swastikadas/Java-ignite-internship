package day3;
import java.util.Scanner;

public class BonusEligibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int exp,att,rat;
		System.out.println("Enter the years of experience");
		exp=sc.nextInt();
		System.out.println("Enter the attendance percentage");
		att=sc.nextInt();
		System.out.println("Enter the performance rating(1-5)");
		rat=sc.nextInt();
		if(att < 60)
		{
			System.out.println("Not eligible for bonus");
		}
		else
		{
			if(att>85 && exp>3)
			{
				System.out.println("Eligible for bonus");
				if(rat==5)
				{
					System.out.println("Bonus is 50000");
				}
				else if(rat==4)
				{
					System.out.println("Bonus is 30000");
				}
				else if(rat==3)
				{
					System.out.println("Bonus is 10000");
				}
				else
				{
					System.out.println("not eligible");
				}
			}
		}
		sc.close();

	}

}
