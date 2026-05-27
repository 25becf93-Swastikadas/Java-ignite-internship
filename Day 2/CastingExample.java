package HelloWorld;
import java.util.Scanner;
public class CastingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter decimal number");
		double num=sc.nextDouble();
		int result=(int)num;
		System.out.println("Original:"+num);
		System.out.println("After Casting:"+result);
		sc.close();

	}

}
