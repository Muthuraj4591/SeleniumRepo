package Week1.Day2.Assignment;
import java.util.Scanner;
public class IsPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Reader = new Scanner(System.in);// Reading from System.in
		System.out.print("Enter an number to Check Pimenumber or Not:");
		int userInput = Reader.nextInt();
		int temp = 0;
		for (int i=2;i<userInput;i++) {
			if(userInput % i ==0)
			{
				temp++;
			}
		}
		if(temp ==0) {
			System.out.println("User Entered Number is a Prime Number");
		}
		else {
			System.out.println("User Entered Number is Not a Prime Number");
		}
		Reader.close();
	}

}
