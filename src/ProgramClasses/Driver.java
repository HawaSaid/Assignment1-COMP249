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
				Object o;
				if ("class ProgramClasses.GraduateProgram".equals(arr[j].getClass().toString())) {
					o = new GraduateProgram((GraduateProgram) arr[j]);
					foundprogram++;
				} else if ("class programClasses.UndergraduateProgram".equals(arr[j].getClass().toString())) {
					o = new UndergraduateProgram((UndergraduateProgram) arr[j]);
					foundprogram++;
				} else if ("class programClasses.SpecialProgram".equals(arr[j].getClass().toString())) {
					o = new SpecialProgram((SpecialProgram) arr[j]);
					foundprogram++;
				} else if ("class programClasses.CertificateProgram".equals(arr[j].getClass().toString())) {
					o = new CertificateProgram((CertificateProgram) arr[j]);
					foundprogram++;
				} else if ("class programClasses.Program".equals(arr[j].getClass().toString())) {
					o = new Program((Program) arr[j]);
					foundprogram++;
				} else
					o = new String("is not a program in university.");
				if ("is not a program in university".equals(o))
					totalCreditCost[j] = -1;
				else {
					Program program = new Program((Program) o);
					totalCreditCost[j] = ((Program) o).getTotalCredits() * ((GraduateProgram) o).getCreditCost();
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

		GraduateProgram Obj1 = new GraduateProgram("Neil",25);
		UndergraduateProgram Obj2 = new UndergraduateProgram(true,30);
		SpecialProgram Obj3 = new SpecialProgram(90,40);
		CertificateProgram Obj4 = new CertificateProgram(100,25);
		//Program Obj5 = new Program();
		//Course oj6=new Course();

		Obj1.toString();
		Obj2.toString();
		Obj3.toString();
		Obj4.toString();
		//Obj5.toString();
		Program[] arr=new Program[5];
		arr[0] = new CertificateProgram(100, 25);
		arr[1] = new CertificateProgram(200, 25);
		arr[2] = new CertificateProgram(150, 35);
		arr[3] = new SpecialProgram(60, 35);
		arr[4] = new SpecialProgram(75, 55);
		
		
		

	}

}
