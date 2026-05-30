package day5;
import java.util.Scanner;

public class Grade_Calc {
	void df(int m)
	{
		if(m>=90)
			System.out.println("A grade");
		else if(m>=80 && m<=90)
			System.out.println("B grade");
		else if(m>=60 && m<=80)
			System.out.println("C grade");
		else
			System.out.println("Fail");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter marks of a student");
		int grade=sc.nextInt();
		Grade_Calc object=new Grade_Calc();
		object.df(grade);
		sc.close();
	}

	}


