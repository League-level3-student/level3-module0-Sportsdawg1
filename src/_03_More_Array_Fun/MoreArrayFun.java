package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		String [] testArr = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		//printString(testArr);
		//printStringReverse(testArr);
		//printOtherString(testArr);
		printRandomString(testArr);
	}
	
	
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	static void printString (String [] s) {
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
	}
	
	
	static //3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	void printStringReverse (String [] s) {
		for (int i = s.length; i < 0; i--) {
			System.out.println(s[i]);
		}
	}
	
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
	static void printOtherString (String [] s) {
		for (int i = 0; i < s.length; i++) {
			if(i%2 == 0) {
				System.out.println(s[i]);
			}
			
		}
	}
	
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	/*static void printRandomString (String [] s) {
		Random r = new Random(s.length);
		int nextIndex;
		int [] indexUsed = new int [s.length];
		for (int i = 0; i < indexUsed.length; i++) {
			indexUsed[i] = -1;
		}
		nextIndex = r.nextInt(s.length);
		for (int j = 0; j < indexUsed.length; j++) {
			for (int j2 = 0; j2 < indexUsed.length; j2++) {
				if(nextIndex == indexUsed[j]) {
					nextIndex = r.nextInt(s.length);
					j2 = 0;
				}
			}
			System.out.println(s[nextIndex]);
		}
	}*/
	static void printRandomString (String [] s) {
		String index;
		Random r = new Random(s.length);
		
		for (int i = 0; i < s.length; i++) {
			int random = r.nextInt(s.length);
			index = s[random];
			s[random] = s[i];
			s[i] = index;
		}
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
	}
}
	