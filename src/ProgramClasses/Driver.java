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
import ProgramClasses.Course;
import java.util.Scanner;

public class Driver {

	public static void findLeastAndMostExpensiveProgram(Program[] arr) {// Custom method
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
				System.out.println("The most expensive program is " + arr[most].toString()
						+ "and the least expensive program is" + arr[least].toString());

			} else
				System.out.println("The array does not contain any program.");
		} else
			System.out.println("Array is null.");
	}

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);

		GraduateProgram Obj1 = new GraduateProgram("Neil", 25);
		UndergraduateProgram Obj2 = new UndergraduateProgram(true, 30);
		SpecialProgram Obj3 = new SpecialProgram(90, 40);
		CertificateProgram Obj4 = new CertificateProgram(100, 25);
		// Program Obj5 = new Program();
		// Course oj6=new Course();
		System.out.println(Obj1);
		System.out.println(Obj2);
		System.out.println(Obj3);
		System.out.println(Obj4);

		// Obj5.toString();
		Program[] arr = new Program[4];
		arr[0] = new GraduateProgram("Neil", 25);
		arr[1] = new UndergraduateProgram(true, 25);
		arr[2] = new CertificateProgram(150, 35);
		arr[3] = new SpecialProgram(60, 35);

		Program[] arr2 = new Program[4];
		arr2[0] = new GraduateProgram("Liam", 25);
		arr2[1] = new UndergraduateProgram(false, 25);
		arr2[2] = new CertificateProgram(300, 35);
		arr2[3] = new SpecialProgram(30, 35);

		findLeastAndMostExpensiveProgram(arr);

	}

}
