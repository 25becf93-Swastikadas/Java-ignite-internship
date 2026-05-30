package day5;
import java.util.Scanner;

public class Battle {
	String res(int a,int b)
	{
		if(a>b)
			return "Player A wins!";
		else if(b>a)
			return "Player B wins!";
		else
			return "Draw!";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter player 1 score:");
		int a = sc.nextInt();
		System.out.println("Enter player 2 score:");
		int b = sc.nextInt();
		Battle score = new Battle();
		System.out.println("The winner of the game is: "+score.res(a,b));
		sc.close();

	}

}
