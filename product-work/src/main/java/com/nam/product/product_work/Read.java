package com.nam.product.product_work;
import java.util.Scanner;

public class Read {
	static Scanner scanner = new Scanner(System.in);
	
	static int readInt(String prompt) {
		System.out.println(prompt);
		return scanner.nextInt();
	}
	
	static double readDouble(String prompt) {
		System.out.println(prompt);
		return scanner.nextDouble();
	}
	
	static String readString(String prompt) {
		System.out.println(prompt);
		return scanner.next();
	}
}
