package Week1.Day2.Assignment;
import java.util.Scanner;

public class PalindromeChek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Reader = new Scanner(System.in);// Reading from System.in
		System.out.print("Enter an number to Check Palindorme:");
		int userInput = Reader.nextInt();
		int RevuserInput=0;
		int temp = 0;
		for (int i = userInput; i>0; i=i/10) 
		{
			temp = i % 10;
			RevuserInput = (RevuserInput *10) + temp;
		}
		if (RevuserInput == userInput)
		{
			System.out.println("User Entered Number is Palindrome");
		}
		else {
			System.out.println("User Entered Number is Not Palindrome");
		}
		Reader.close();
	}
}
