import java.io.*;
import java.util.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class BitManipulation {
	public static void main(String[] args) {
		// Taking two numbers for bit manipulation
		int number1 = 19; // let this number be A
		int number2 = 8; // let this number be B

		System.out.println("Binary representation of (32-bit Integer) A = " + getBinary(number1));
		System.out.println("Binary representation of (32-bit Integer) B = " + getBinary(number2));

		// Basic Bit operations:
		// OR
		System.out.println("A OR B = " + (number1 | number2));
		// AND
		System.out.println("A AND B = " + (number1 & number2));
		// XOR
		System.out.println("A XOR B = " + (number1 ^ number2));

		// Find ith bit
		int i = 3;
		System.out.println(i + "th bit of A = " + findIthBit(number1, i));
		System.out.println(i + "th bit of B = " + findIthBit(number2, i));

		// Set ith bit
		i = 3;
		number1 = number1 | (1 << i);
		number2 = number2 | (1 << i);
		System.out.println("After set operation, " + i + "th bit of A = " + findIthBit(number1, i));
		System.out.println("After set operation, " + i + "th bit of B = " + findIthBit(number2, i));

		// Clear ith set bit
		// i = 3
		number1 = number1 & (~(1 << i));
		number2 = number2 & (~(1 << i));
		System.out.println("After clear operation, " + i + "th bit of A = " + findIthBit(number1, i));
		System.out.println("After clear operation, " + i + "th bit of B = " + findIthBit(number2, i));
	}
	public static int findIthBit(int number, int i) {
		return (number & (1 << i)) != 0 ? 1 : 0;
	}
	public static String getBinary(int number) {
		StringBuilder bin = new StringBuilder();
		for (int i = 31; i >= 0; i--) {
			int bit = findIthBit(number, i);
			bin.append(bit);
		}
		return bin.toString();
	}
}