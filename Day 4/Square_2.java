package day4;
import java.util.Scanner;

public class Square_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a base and exponent");
		int b= sc.nextInt();
		int e=sc.nextInt();
		double res=Math.pow(b, e);
		System.out.println(res);
		sc.close();
	}

}
