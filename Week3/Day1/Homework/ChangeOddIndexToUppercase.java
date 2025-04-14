package Week3.Day1.Homework;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "changename";
		char a[]=test.toCharArray();
		for (int i=0;i<a.length;i++) {
			if(i%2!=0) {
				System.out.print(Character.toUpperCase(a[i]));
			}
			else {
				System.out.print(a[i]);
			}			
		}
	}
}
