//------------------------------------------------------------------------------
//Assignment 1
//Part: Part 1 and 2
//Written by: Hawa-Afnane Said(ID:40263400)& Haifaa Janoudi(40263748)
//------------------------------------------------------------------------------


package RemainingClasses;

import ProgramClasses.Program;

public class UndergraduateProgram extends Program {
	boolean accredited;
	static int creditCost;

	public UndergraduateProgram() {// Default constructor
		accredited = false;
		creditCost = 0;
	}

	public UndergraduateProgram(boolean accredited, int creditCost) {// Custom constructor
		this.accredited = accredited;
		UndergraduateProgram.creditCost = creditCost;
	}

	public UndergraduateProgram(UndergraduateProgram undergraduate) {// Copy constructor
		super(undergraduate);
		this.accredited = undergraduate.accredited;
		UndergraduateProgram.creditCost = undergraduate.getCreditCost();
	}

	public void setAccredited(boolean accredited) {// Setter method for the boolean accredited
		this.accredited = accredited;
	}

	public boolean getAccredited() {// Getter method for the boolean accredited
		return accredited;
	}

	public void setCreditCost(int creditCost) {// Setter method for the int creditCost
		GraduateProgram.creditCost = creditCost;
	}

	public int getCreditCost() {// Getter method for the int creditCost
		return creditCost;
	}
	public double FindPrice() {// Method that returns the price of the UndergraduateProgram
		return creditCost*getTotalCredits();
	}

	@Override
	public String toString() {// toString method
		return "In the UndergraduateProgram, is the course accredited? " + accredited + " and the creditCost is " + creditCost+" $.";
	}

	@Override
	public boolean equals(Program up) { // Equals method
		if (up == null || getClass() != up.getClass()) {
			return false;
		} else {
			UndergraduateProgram otherup = (UndergraduateProgram) up;
			if (this.accredited == otherup.accredited && GraduateProgram.creditCost == otherup.getCreditCost()) {
				return true;
			} else {
				return false;
			}

		}

	}
}