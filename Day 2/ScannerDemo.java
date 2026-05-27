package HelloWorld;
import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=sc.nextLine();
		System.out.println("Enter your age");
		int age=sc.nextInt();
		System.out.println("Are you a student(true/false)");
		boolean isStudent=sc.nextBoolean();
		//String age=String.valueOf(sc.nextInt());
		System.out.println("Name:"+name);
		System.out.println("Age"+age);
		System.out.println("Student Status:"+isStudent);
		sc.close();
		
		

	}

}
