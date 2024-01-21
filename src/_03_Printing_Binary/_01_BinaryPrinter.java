package _03_Printing_Binary;

public class _01_BinaryPrinter {
	/*
	 * Complete the methods below so they print the passed in parameter in binary.
	 * Do not use the Integer.toBinaryString method! Use the main method to test
	 * your methods.
	 */

	public static void printByteBinary(byte b) {
		// We first want to print the bit in the one's place
		for (int i = 7; i >= 0; i--) {
			byte B = (byte) (b >>> i);
			B = (byte) (B & 0b00000001);
			System.out.print(B);
		}

		// Use this method to print the remaining 7 bits of b
	}

	public static void printShortBinary(short s) {
		// Create 2 byte variables
		byte one;
		byte two;
		// Use bit shifting and masking (&) to save the first
		// 8 bits of s in one byte, and the second 8 bits of
		// s in the other byte
		one = (byte) (s >>> 8);
		two = (byte) (s);
		// Call printByteBinary twice using the two bytes
		// Make sure they are in the correct order
		printByteBinary(one);
		printByteBinary(two);
	}

	public static void printIntBinary(int i) {
		// Create 2 short variables
		short one;
		short two;
		// Use bit shifting and masking (&) to save the first
		// 16 bits of i in one short, and the second 16 bits of
		// i in the other short
		one = (short) (i >>> 16);
		two = (short) (i);
		// Call printShortBinary twice using the two short variables
		// Make sure they are in the correct order
		printShortBinary(one);
		printShortBinary(two);
	}

	public static void printLongBinary(long l) {
		// Use the same method as before to complete this method
		int one;
		int two;

		one = (int) (l >>> 32);
		two = (int) (l);

		printIntBinary(one);
		printIntBinary(two);
	}

	public static void main(String[] args) {
		byte by = (byte) 11;
		System.out.println("\n");
		printByteBinary(by);

		short s = (short) 1111;
		System.out.println("\n");
		printShortBinary(s);

		int i = 111111;
		System.out.println("\n");
		printIntBinary(i);

		long l = (long) 111111;
		System.out.println("\n");
		printLongBinary(l);
		// Test your methods here
	}
}
