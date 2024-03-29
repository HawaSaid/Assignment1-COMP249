//------------------------------------------------------------------------------
//Assignment 1
//Part: Part 1 and 2
//Written by: Hawa-Afnane Said(ID:40263400)& Haifaa Janoudi(40263748)
//------------------------------------------------------------------------------


package RemainingClasses;

import ProgramClasses.Program;

public class SpecialProgram extends Program {
	int duration;
	static int creditCost;

	public SpecialProgram() {// Default constructor
		duration = 0;
		creditCost = 0;
	}

	public SpecialProgram(int capacity, int creditCost) {// Custom constructor
		this.duration = capacity;
		SpecialProgram.creditCost = creditCost;
	}

	public SpecialProgram(SpecialProgram certificate) {// Copy constructor
		super(certificate);
		this.duration = certificate.duration;
		SpecialProgram.creditCost = certificate.getCreditCost();
	}

	public void setDuration(int duration) {// Setter method for the int duration
		this.duration = duration;
	}

	public int getDuration() {// Getter method for the int duration
		return duration;
	}

	public void setCreditCost(int creditCost) {// Setter method for the int creditCost
		GraduateProgram.creditCost = creditCost;
	}

	public int getCreditCost() {// Getter method for the int creditCost
		return creditCost;
	}

	@Override
	public String toString() {// toString method
		return "In the SpecialProgram,the duration is " + duration + "years" + " and the creditCost is " + creditCost
				+ " $.";
	}

	@Override
	public boolean equals(Program sp) { // Equals method
		if (sp == null || getClass() != sp.getClass()) {
			return false;
		} else {
			SpecialProgram othersp = (SpecialProgram) sp;
			if (this.duration == othersp.duration && SpecialProgram.creditCost == othersp.getCreditCost()) {
				return true;
			} else {
				return false;
			}

		}

	}

}