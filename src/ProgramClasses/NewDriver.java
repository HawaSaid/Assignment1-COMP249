package ProgramClasses;

import RemainingClasses.GraduateProgram;
import RemainingClasses.UndergraduateProgram;
import RemainingClasses.CertificateProgram;
import RemainingClasses.SpecialProgram;

//------------------------------------------------------------------------------
//Assignment 1
//Part: Part 2
//Written by: Hawa-Afnane Said(ID:40263400)& Haifaa Janoudi(40263748)
//------------------------------------------------------------------------------

public class NewDriver {

	public static Program[] copyTheObjects(Program[] arrayBeforeCopy) {// Custom method that creates a copy of the array
																		// were passing through the method
		// Creates a new array of type Program
		Program[] arrcopy = new Program[arrayBeforeCopy.length];
		for (int j = 0; j < arrayBeforeCopy.length; j++) {

			// Checks if the objects inside the array are instances of the ancestor class Program
			if (arrcopy[j] instanceof Program) {
				arrcopy[j] = new Program(arrayBeforeCopy[j]);
			} else {
				// Error message if an object in that array is not an instance of the Class Program
				System.out.println("No Program object found in this array");
			}
		}
		return arrcopy;

	}

	public static void main(String[] args) {
		// Declaration of an array of type Program and a size
		Program[] ArrayBeforeCopy = new Program[15];
		ArrayBeforeCopy[0] = new GraduateProgram("Neil", 50);
		ArrayBeforeCopy[1] = new GraduateProgram("Isabella", 30);
		ArrayBeforeCopy[2] = new UndergraduateProgram(true, 50);
		ArrayBeforeCopy[3] = new UndergraduateProgram(false, 20);
		ArrayBeforeCopy[4] = new CertificateProgram(100, 25);
		ArrayBeforeCopy[5] = new CertificateProgram(200, 25);
		ArrayBeforeCopy[6] = new CertificateProgram(150, 35);
		ArrayBeforeCopy[7] = new SpecialProgram(60, 35);
		ArrayBeforeCopy[8] = new SpecialProgram(75, 55);
		ArrayBeforeCopy[9] = new SpecialProgram(90, 55);
		ArrayBeforeCopy[10] = new SpecialProgram(100, 65);
		ArrayBeforeCopy[11] = new CertificateProgram(300, 25);
		ArrayBeforeCopy[12] = new GraduateProgram("Ella", 25);
		ArrayBeforeCopy[13] = new Program("ComputerScience", " ", 90, "Concordia University", null, null);
		ArrayBeforeCopy[14] = new Program("SoftwareEngineering", " ", 120, "Concordia University", null, null);
		Program[] ArrayAfterCopy = copyTheObjects(ArrayBeforeCopy);
		System.out.println("Array before copy");
		for (Program program : ArrayBeforeCopy) {
			System.out.println(ArrayBeforeCopy);
		}
		System.out.println("Array after copy");
		for (Program program : ArrayAfterCopy) {
			System.out.println(ArrayAfterCopy);
		}
	}

}
