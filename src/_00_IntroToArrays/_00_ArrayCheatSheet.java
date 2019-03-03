package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String [] s = {"a","b","c","d","e"};
		//2. print the third element in the array
		System.out.println(s[3]);
		//3. set the third element to a different value
		s[3] = "f";
		//4. print the third element again
		System.out.println(s[3]);
		//5. use a for loop to set all the elements in the array to a string of your choice
		for (int i = 0; i < s.length; i++) {
			s[i] = "a";
		}
		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
		//7. make an array of 50 integers
		int[] fifty = new int[50];
		Random r = new Random();
		//8. use a for loop to make every value of the integer array a random number
		for (int i = 0; i < fifty.length; i++) {
			fifty[i] = r.nextInt(50); 
		}
		int small = 50;
		//9. without printing the entire array, print only the smallest number on the array
		for (int i = 0; i < fifty.length; i++) {
			if(fifty[i] < small) {
				small = fifty[i];
			}
		}
		System.out.println(small);
		//10 print the entire array to see if step 8 was correct
		for (int i = 0; i < fifty.length; i++) {
			System.out.println(fifty[i]);
		}
		//11. print the largest number in the array.
		int big = 0;
		for (int i = 0; i < fifty.length; i++) {
			if(fifty[i] > big) {
				big = fifty[i];
			}
		}
		System.out.println(big);
		//12. print only the last element in the array
		System.out.println(fifty[49]);
	}
}
