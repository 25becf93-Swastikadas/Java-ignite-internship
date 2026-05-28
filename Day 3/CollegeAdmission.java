package day3;
import java.util.Scanner;

public class CollegeAdmission {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter maths marks");
		int m1=sc.nextInt();
		System.out.println("Enter physics marks");
		int m2=sc.nextInt();
		System.out.println("Enter chemistry marks");
		int m3=sc.nextInt();
		double avg=(m1+m2+m3)/3;
		if(m1<35 || m2<35 || m3<35)
		{
			System.out.println("Admission rejected");
		}
		else if((m1>=70 && m2>=60 && m3>=60 )|| avg>=80)
		{
			System.out.println("Admission granted, no scholarship");
		}
		else if(m1>90 && m2>90 && m3>90)
		{
			System.out.println("Admission granted, eligible for scholarship");
		}
		sc.close();

	}

}
