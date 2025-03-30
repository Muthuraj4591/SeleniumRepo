package Week1.Day2.Assignment;
//import java.util.Scanner;
public class CheckNumberIsPositive 
{
	public static void main(String[] args) 
	{
		//Scanner Reader = new Scanner(System.in); // Reading from System.in
		//System.out.print("Enter an number to check that number is positive or Not:");
		//int userInput = Reader.nextInt();
		int userInput = 10;
		if (userInput>0) {
			System.out.println("User Entered Number is Positive");
			
		}
		else if (userInput<0) {
			System.out.println("User Entered Number is Negative");
		}
		else {
			System.out.println("User Entered Number is Zero");
		}
		//Reader.close();
	}

}
