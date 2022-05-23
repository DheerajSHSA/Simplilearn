import java.util.Scanner;

public class ArithmeticCalc {
	public static void main(String args[])
	{
		float num1, num2;
		int operator;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		num1 = sc.nextFloat();
		System.out.println("Enter the second number");
		num2 = sc.nextFloat();
		System.out.println("Enter 1 for addition, 2 for subtraction, 3 for multiplication, 4 for division");
		operator = sc.nextInt();
		if(operator == 1)
		{
			System.out.println(num1 +num2);
			
		}
		else if(operator == 2)
		{
			if(num1 > num2) {
			System.out.println(num1 - num2);
		}
			if(num2 > num1)
			{
				System.out.println(num2 - num1);
			}
		}
		else if(operator == 3)
		{
			System.out.println(num1 * num2);
		}
		else if(operator == 4)
		{
			System.out.println(num1 / num2);
		}
		else
		{
			System.out.println("Please select the valid options");
		}
	}

}
