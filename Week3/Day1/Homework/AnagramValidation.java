package Week3.Day1.Homework;

import java.util.Arrays;

public class AnagramValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text1 = "stops";
		String text2="potss";
		if(text1.length()==text2.length()) {
			char[] txt1ChrArray = text1.toCharArray();
			char[] txt2ChrArray= text2.toCharArray();
			Arrays.sort(txt1ChrArray);
			Arrays.sort(txt2ChrArray);
			if(Arrays.equals(txt1ChrArray, txt2ChrArray)) {
				System.out.println("The given strings are Anagram.");
			}
			else {
				System.out.println("The given strings are not an Anagram.");
			}
		}
		else {
			System.out.println("The Given Strings Length Is Mismatch, therefore the strings are not an Anagram");
		}
	}
}
