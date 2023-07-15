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

	public static Object[] copyTheObjects(Object[] arrayBeforeCopy) {// Custom method that creates a copy of the array
																		// were passing through the method
		// Creates a new array of type Program
		Object[] arrcopy = new Object[arrayBeforeCopy.length];
		for (int j = 0; j < arrayBeforeCopy.length; j++) {

			// Checks if the objects inside the array are instances of the ancestor class
			// Program
			if (arrcopy[j] instanceof Program) {
				arrcopy[j] = new Program((Program) arrayBeforeCopy[j]);
				System.out.print("The array before copying is: " + arrayBeforeCopy[j]);
				System.out.print("The copy  array is: " + arrcopy[j]);
			}
		}
		// Error message if an object in that array is not an instance of the Class
		// Program
		System.out.println("No Program object found in the array.");

		return arrcopy;
	}

	public static void main(String[] args) {
		// Declaration of an array of type Program and a size
		Object[] ArrayBeforeCopy = new Object[15];
		
		//Arrays of Courses
		Course[] ENGR = { new Course("ENGR 213", 3), new Course("ENGR 233", 3) };
		Course[] COMP = { new Course("COMP 232", 3), new Course("COMP 248", 3) };
		Course[] ELEC = { new Course("ELEC 201", 3), new Course("ELEC 202", 3) };
		Course[] EDUC = { new Course("EDUC 201", 3), new Course("EDUC 202", 3) };
		Course[] PHYS = { new Course("PHYS 101", 3), new Course("PHYS 102", 3) };

		// Initialization of each array cell
		ArrayBeforeCopy[0] = new GraduateProgram("Neil", 50);
		ArrayBeforeCopy[1] = new GraduateProgram("Isabella", 30);
		ArrayBeforeCopy[2] = new GraduateProgram("Ella", 25);
		ArrayBeforeCopy[3] = new UndergraduateProgram(true, 50);
		ArrayBeforeCopy[4] = new UndergraduateProgram(false, 20);
		ArrayBeforeCopy[5] = new UndergraduateProgram(true, 25);
		ArrayBeforeCopy[6] = new CertificateProgram(100, 25);
		ArrayBeforeCopy[7] = new CertificateProgram(200, 25);
		ArrayBeforeCopy[8] = new CertificateProgram(150, 35);
		ArrayBeforeCopy[9] = new SpecialProgram(4, 35);
		ArrayBeforeCopy[10] = new SpecialProgram(3, 55);
		ArrayBeforeCopy[11] = new Course("COMP248", 50);
		ArrayBeforeCopy[12] = new Course("COMP249", 50);
		ArrayBeforeCopy[13] = new Program("ComputerScience", " ", 90, "Concordia University", ENGR,ELEC );
		ArrayBeforeCopy[14] = new Program("SoftwareEngineering", " ", 120, "Concordia University", COMP, ELEC);

		// Copies the objects in the ArrayBeforeCopy array in the ArrayAfterCopy array
		Object[] ArrayAfterCopy = copyTheObjects(ArrayBeforeCopy);
	}

}
