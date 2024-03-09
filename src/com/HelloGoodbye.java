package com;

import java.util.Scanner;

public class HelloGoodbye{
	public static void main(String[] args) {
		
		
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter two names separated by space: ");
			String name1 = scanner.next();
			String name2 = scanner.next();
			System.out.println("Hello " + name1 + " and " + name2);
			
			System.out.println("Goodbye " + name2 + " and " + name1);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
}