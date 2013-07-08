package binarysearch;

import java.util.Scanner;

public class BinarySearch {

	private static int[] array = { 1, 4, 5, 5, 6, 7, 9, 14, 15, 17, 21, 25, 26, 26, 26, 27, 28, 30 };
	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		while (true) {
			System.out.println("Enter a value to search for: ");
			int x = input.nextInt();
			System.out.println(binarySearch(x));
		}
	}
	
	// Returns the location of x in the array
	// -1 if x is not in the array
	// Operates in O(log n) time
	private static int binarySearch(int x) {
		
		return 0;
	}

}
