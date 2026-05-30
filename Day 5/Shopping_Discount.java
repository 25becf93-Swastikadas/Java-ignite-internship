package day5;

import java.util.Scanner;

public class Shopping_Discount {
	double discount(double bill,double dis)
	{
		double amt=bill-(bill*(dis/100.0));
		return amt;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the bill amount");
		double bill= sc.nextDouble();
		System.out.println("Enter the discount percentage");
		double dis= sc.nextDouble();
		Shopping_Discount amount= new Shopping_Discount();
		double nb=amount.discount(bill, dis);
		System.out.println("The new bill amount is:"+nb);
		sc.close();

	}

}
