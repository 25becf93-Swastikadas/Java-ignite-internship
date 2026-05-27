package HelloWorld;

import java.util.Scanner;

public class Result {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter student name");
		String name=sc.nextLine();
		System.out.println("Enter the marks of 3 subjects");
		int m1=sc.nextInt();
		int m2=sc.nextInt();
		int m3=sc.nextInt();
		int total=m1+m2+m3;
		int avg= total/3;
		System.out.println("Student Name:"+name);
		System.out.println("Total marks:"+total);
		System.out.println("Average marks:"+avg);
		System.out.println("Average>50:"+(avg>50));
		sc.close();
				}

}
