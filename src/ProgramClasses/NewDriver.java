package ProgramClasses;

//------------------------------------------------------------------------------
//Assignment 1
//Part: Part 2
//Written by: Hawa-Afnane Said(ID:40263400)
//------------------------------------------------------------------------------
/**
 *
 * @author Hawa-Afnane Said
 */

public class NewDriver {

	public static Program[] copyTheObjects(Program[] array) {// Custom method that creates a copy of the array were
																// passing
		// through the method
		Program[] arrcopy = new Program[array.length];
		for (int j = 0; j < array.length; j++) {
			if (arrcopy[j] instanceof Program) {
				arrcopy[j] = new Program(array[j]);
			} else {
				System.out.println("Can't find a Program object");
			}
		}
		return arrcopy;

	}

	public static void main(String[] args) {

	}

}
