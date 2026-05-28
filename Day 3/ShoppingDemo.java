package day3;
//multiple conditions with if elseif and logical operator
public class ShoppingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double amt=6000;
		boolean premiumUser=true;
		if(amt>=5000 && premiumUser)
		{
			System.out.println("30% disc");
		}
		else if(amt>=5000 || premiumUser)
		{
			System.out.println("!0% disc");
		}
		else
		{
			System.out.println("NO disc");
		}
	}

}
