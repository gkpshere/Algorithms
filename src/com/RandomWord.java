package com;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
	public static void main(String[] args) {

		int index = 0;
		String champion = "";
		while(!(StdIn.isEmpty())){
			StdOut.println("Enter While loop");
			String name = StdIn.readString();
			StdOut.println(name);
			Boolean isTrue = StdRandom.bernoulli(1 / (index + 1.0));
			StdOut.println(isTrue);
			if (isTrue) {
				champion = name;
			}
			index++;
			StdOut.println("Ending While loop");
		}
		
		StdOut.println("Outside While loop");
		StdOut.println("the champion of the game is " + champion);
	}

}