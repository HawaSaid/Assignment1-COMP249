package ProgramClasses;

//------------------------------------------------------------------------------
//Assignment 1
//Part: Part 1
//Written by: Hawa-Afnane Said(ID:40263400)
//------------------------------------------------------------------------------

import ProgramClasses.Program;
import RemainingClasses.GraduateProgram;
import RemainingClasses.UndergraduateProgram;
import RemainingClasses.CertificateProgram;
import RemainingClasses.SpecialProgram;
import java.util.Scanner;

public class Driver {

	public static void findLeastAndMostExpensiveProgram(Program[] arr) {// Custom method
		// Declares and intializes two objects of type Program to find the Least and
		// Most expensive program
		Program leastExpensive = null;
		Program mostExpensive = null;

		// Checks the members of the array and if it's empty, error message printed
		if (arr.length == 0) {
			System.out.println("The array you're trying to access is empty.");

		} else {
			leastExpensive = arr[0];
			mostExpensive = arr[0];

			for (int i = 0; i < arr.length; i++) {
				Program pr = arr[i];
				// if() {

				// }

			}

		}

		if (leastExpensive != null && mostExpensive != null) {// Prints out the most and least expensive program with
																// the toString method.
			System.out.println("The most expensive program is");
			System.out.println(mostExpensive.toString());
			System.out.println("The least expensive program is");
			System.out.println(leastExpensive.toString());

		} else { // Prints error message when the least and most expensive program are not found.
			System.out.println("Can't find a Program object :(");
		}
	}

	public static void main(String[] args) {
		// Declaration of two objects of each class from the ProgramClasses package
		Program obj1 = new Program();
		Program obj2 = new Program();
		GraduateProgram obj3 = new GraduateProgram();
		GraduateProgram obj4 = new GraduateProgram();
		UndergraduateProgram obj5 = new UndergraduateProgram();
		UndergraduateProgram obj6 = new UndergraduateProgram();
		CertificateProgram obj7 = new CertificateProgram();
		CertificateProgram obj8 = new CertificateProgram();
		SpecialProgram obj9 = new SpecialProgram();
		SpecialProgram obj10 = new SpecialProgram();

		// Takes an object of Scanner to read the keyboard's input.
		Scanner input = new Scanner(System.in);

		// Display's a prompt in the console window asking the user to necessary
		// information for obj1.
		System.out.println("Please enter the name,the specialization, the institution and the totalCredits for obj1:");
		String name = input.next();
		String specialization = input.next();
		String institution = input.next();
		int totalCredits = input.nextInt();

		// obj1(name,specialization,institution,totalCredits);

	}

}
