package ProgramClasses;

import java.util.Scanner;

//------------------------------------------------------------------------------
//Assignment 1
//Part: Part 2
//Written by: Hawa-Afnane Said(ID:40263400)& Haifaa Janoudi(40263748)
//------------------------------------------------------------------------------

public class NewDriver {

	public static Program[] copyTheObjects(Program[] array) {// Custom method that creates a copy of the array were
																// passing through the method
		// Creates a new array of type Program
		Program[] arrcopy = new Program[array.length];
		for (int j = 0; j < array.length; j++) {

			// Checks if the objects are instances of the ancestor class Program
			if (arrcopy[j] instanceof Program) {
				arrcopy[j] = new Program(array[j]);
			} else {
				// Error message ff an object in that array is not an instance of the Class
				// Program
				System.out.println("No Program object found in this array");
			}
		}
		return arrcopy;

	}

	public static void main(String[] args) {
		Program[] copy = new Program[15];

	}

}
