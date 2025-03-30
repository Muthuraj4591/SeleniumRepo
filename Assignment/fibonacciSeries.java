package Week1.Day2.Assignment;
import java.util.Scanner;
public class fibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Reader = new Scanner(System.in); // Reading from System.in
		System.out.print("Enter any number to get an fibonacci Series:");
		int userInput = Reader.nextInt();
		System.out.println("Fibonacci Series:");
		System.out.println("********* ******");
		int a=0;
		int b=1;
		int c=0;
		for (int i =0; i<userInput;i++)
		{	
			if(i<=1) 
			{
				System.out.println(i);
			}
			else 
			{
				c=a+b;
				System.out.println(c);
				a=b;
				b=c;	
			}					
		}
		Reader.close();
	}

}
