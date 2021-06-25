// This is a solution to the exercise at https://coderbyte.com/editor/First%20Reverse:Java

import java.util.Scanner;

public class ReverseWord {

	public static String FirstReverse(String str) {
		char[] reversedList = new char[str.length()];
		int count = 0;
		for (int characterPosition = str.length() - 1; characterPosition > -1; characterPosition--) {
			reversedList[count++] = (str.charAt(characterPosition));
		}
		str = "";
		for (char individualCharacter : reversedList) {
			str += individualCharacter;
		}
		return str;
	}

	public static void main(String[] args) {
		System.out.print("Please enter the word you would like to reverse.");
		Scanner s = new Scanner(System.in);
		System.out.print(FirstReverse(s.nextLine()));
		s.close();
	}
}
