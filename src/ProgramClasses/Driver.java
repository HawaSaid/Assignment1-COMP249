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
					totalCreditCost[j] = o.getTotalCredits() * o.getCreditCost();
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

	}

}
