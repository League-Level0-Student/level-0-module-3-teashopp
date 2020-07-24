package _02_loop_variables._4_99_bottles.bottles;

import javax.swing.JOptionPane;

public class Bottles {

	public static void main(String[] args) {

		for (int i = 99; i > 0; i--) {
			
			System.out.println(i + " bottles of milk on the wall, " + i + " bottles of milk. You take one down, pass it around, " + (i-1) + " bottles of milk on the wall.");
			
		}
	}
}
