package ProgramClasses;

//------------------------------------------------------------------------------
//Assignment 1
//Part: Part 1
//Written by: Hawa-Afnane Said(ID:40263400)& Haifaa Janoudi(40263748)
//------------------------------------------------------------------------------

import ProgramClasses.Program;
import RemainingClasses.GraduateProgram;
import RemainingClasses.UndergraduateProgram;
import RemainingClasses.CertificateProgram;
import RemainingClasses.SpecialProgram;
import java.util.Scanner;

public class Driver {

	public static void findLeastAndMostExpensiveProgram(Object[] arr) {// Custom method
		if (arr != null) {
			int[] totalCreditCost = new int[arr.length];
			int least = 0;
			int most = 0;
			int foundprogram = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] != null && "class RemainingClasses.GraduateProgram".equals(arr[j].getClass().toString())) {
					GraduateProgram p = new GraduateProgram((GraduateProgram) arr[j]);
					totalCreditCost[j] = p.getCreditCost();
					foundprogram++;
				} else if (arr[j] != null
						&& "class RemainingClasses.UndergraduateProgram".equals(arr[j].getClass().toString())) {
					UndergraduateProgram p = new UndergraduateProgram((UndergraduateProgram) arr[j]);
					totalCreditCost[j] = p.getCreditCost();
					foundprogram++;
				} else if (arr[j] != null
						&& "class RemainingClasses.SpecialProgram".equals(arr[j].getClass().toString())) {
					SpecialProgram p = new SpecialProgram((SpecialProgram) arr[j]);
					totalCreditCost[j] = p.getCreditCost();
					foundprogram++;
				} else if (arr[j] != null
						&& "class RemainingClasses.CertificateProgram".equals(arr[j].getClass().toString())) {
					CertificateProgram p = new CertificateProgram((CertificateProgram) arr[j]);
					totalCreditCost[j] = p.getCreditCost();
					foundprogram++;
				} else {
					totalCreditCost[j] = -1;
				}
			}
			if (foundprogram > 0) {
				for (int j = 0; j < totalCreditCost.length; j++) {
					if (totalCreditCost[j] < 0)
						continue;
					else {
						if (totalCreditCost[j] < totalCreditCost[least])
							least = j;
						if (totalCreditCost[j] > totalCreditCost[most])
							most = j;
					}
				}
				System.out.println("The most expensive program: " + arr[most].toString());
				System.out.println("The least expensive program: " + arr[least].toString());

			} else
				System.out.println("The array does not contain any program.");
		} else
			System.out.println("Array is null.");
	}

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);

		// Arrays of courses for the programs.
		Course[] ENGR = { new Course("ENGR 213", 3), new Course("ENGR 233", 3) };
		Course[] COMP = { new Course("COMP 232", 3), new Course("COMP 248", 3) };
		Course[] ELEC = { new Course("ELEC 201", 3), new Course("ELEC 202", 3) };
		Course[] EDUC = { new Course("EDUC 201", 3), new Course("EDUC 202", 3) };
		Course[] PHYS = { new Course("PHYS 101", 3), new Course("PHYS 102", 3) };
		Course[] BIZN = { new Course("BIZN 101", 3), new Course("BIZN 102", 3) };
		Course[] SPAN = { new Course("SPAN 200", 3), new Course("SPAN 201", 3) };
		Course[] THEO = { new Course("THEO 101", 3), new Course("THEO 102", 3) };
		Course[] ENCS = { new Course("ENCS 200", 3), new Course("ENCS 201", 3) };

		// here is the list of undergraduate programs
		UndergraduateProgram Underp1 = new UndergraduateProgram();
		Underp1.setCreditCost(600); // cost of the undergraduate program
		Underp1.setName("Engineering");
		Underp1.setrequiredCourses(ENGR);
		Underp1.setelectiveCourses(ELEC);
		Underp1.setinstituiton("Concordia University");
		Underp1.setTotalCredits(40);
		Underp1.setAccredited(true);

		UndergraduateProgram Underp2 = new UndergraduateProgram();
		Underp2.setName("Physics");
		Underp2.setrequiredCourses(PHYS);
		Underp2.setelectiveCourses(ELEC);
		Underp2.setAccredited(false);
		Underp2.setTotalCredits(30);
		Underp2.setinstituiton("Concordia University");

		// here is a list of graduate programs
		GraduateProgram grad1 = new GraduateProgram();
		grad1.setCreditCost(700); // cost of the graduate program
		grad1.setName("Business");
		grad1.setSpecialization("Business Management");
		grad1.setCoordinator("Mathiew James");
		grad1.setrequiredCourses(BIZN);
		grad1.setinstituiton("Concordia University");
		grad1.setelectiveCourses(ELEC);
		grad1.setTotalCredits(20);

		GraduateProgram grad2 = new GraduateProgram();
		grad2.setName("Education");
		grad2.setSpecialization("Physical Education");
		grad2.setCoordinator("Fred Williams");
		grad2.setrequiredCourses(EDUC);
		grad2.setinstituiton("Concordia University");
		grad2.setelectiveCourses(ELEC);
		grad2.setTotalCredits(35);

		// List of Special Programs
		SpecialProgram spec1 = new SpecialProgram();
		spec1.setCreditCost(300); // cost of the special program
		spec1.setName("Computer Science");
		spec1.setSpecialization("Computer Science and Math");
		spec1.setDuration(30);
		spec1.setrequiredCourses(COMP);
		spec1.setelectiveCourses(ELEC);
		spec1.setinstituiton("Concordia");
		spec1.setTotalCredits(45);

		SpecialProgram spec2 = new SpecialProgram();
		spec2.setName("Religions");
		spec2.setSpecialization("Introduction to Islamic Studies");
		spec2.setDuration(40);
		spec2.setrequiredCourses(THEO);
		spec2.setelectiveCourses(ELEC);
		spec2.setinstituiton("Concordia");
		spec2.setTotalCredits(25);

		// list of certificate programs
		CertificateProgram cert1 = new CertificateProgram();
		cert1.setCreditCost(500); // cost of the certificate program
		cert1.setName("spanish");
		cert1.setSpecialization("Spanish language and Culture");
		cert1.setCapacity(30);
		cert1.setrequiredCourses(SPAN);
		cert1.setelectiveCourses(ELEC);
		cert1.setinstituiton("Concordia University");
		cert1.setTotalCredits(40);

		CertificateProgram cert2 = new CertificateProgram();
		cert2.setName("English");
		cert2.setSpecialization("English Writing and Communication");
		cert2.setCapacity(20);
		cert2.setrequiredCourses(ENCS);
		cert2.setelectiveCourses(ELEC);
		cert2.setinstituiton("Concordia University");
		cert2.setTotalCredits(25);

		// Comparing programs to see most and least expensive
		Underp1.equals(cert2);
		Underp1.equals(cert1);
		cert2.equals(spec2);
		cert1.equals(grad1);
		grad1.equals(grad2);

		// Array containing at least one object of each class
		Object[] arr1 = { Underp1, grad1, cert1, spec1 };

		// Array that includes the objects of only the class course. Because it is the
		// only one that does
		// not extend program class.
		Object[] arr2 = { COMP, ELEC, ENGR, EDUC, PHYS, BIZN, SPAN, THEO, ENCS };

		// asking the program to find least and most expensive programs
		findLeastAndMostExpensiveProgram(arr1);
		findLeastAndMostExpensiveProgram(arr2);

	}

}
