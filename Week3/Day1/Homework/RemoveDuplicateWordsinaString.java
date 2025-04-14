package Week3.Day1.Homework;

public class RemoveDuplicateWordsinaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn Java basics as part of java sessions in java week1";
		String words[] = text.split(" ");
		
		for (int i=0;i<words.length;i++) {
			if(words[i]!=null) {
				for(int j=i+1;j<words.length;j++) {
					if(words[i].equalsIgnoreCase(words[j])) {
						words[j]=" ";
					}
				}
			}			
			System.out.print(words[i]+" ");
		}
	}
}
