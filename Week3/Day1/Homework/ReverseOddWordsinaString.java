package Week3.Day1.Homework;

public class ReverseOddWordsinaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "I am a software tester";
		String words[]=text.split(" ");
		for (int i=0;i<words.length;i++) {
			if(i%2!=0) {
				char temp[]=words[i].toCharArray();
				for (int j=temp.length-1;j>=0;j--) {
					System.out.print(temp[j]);
				}
			}
			else {
				System.out.print(words[i]);
			}			
			System.out.print(" ");
		}
	}

}
