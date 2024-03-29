
//------------------------------------------------------------------------------
//Assignment 1
//Part: Part 1 and 2
//Written by: Hawa-Afnane Said(ID:40263400)& Haifaa Janoudi(40263748)
//------------------------------------------------------------------------------

package RemainingClasses;

import ProgramClasses.Program;;

public class GraduateProgram extends Program {
	String coordinator;
	public static int creditCost;

	public GraduateProgram() { // Default constructor
		coordinator = null;
		creditCost = 0;
	}

	public GraduateProgram(String coordinator, int creditCost) { // Custom constructor
		this.coordinator = coordinator;
		GraduateProgram.creditCost = creditCost;
	}

	public GraduateProgram(GraduateProgram graduate) { // Copy constructor
		super(graduate);
		this.coordinator = graduate.coordinator;
		GraduateProgram.creditCost = graduate.getCreditCost();
	}

	public void setCoordinator(String coordinator) { // Setter method for the String coordinator
		this.coordinator = coordinator;
	}

	public String getCoordinator() {// Getter method for the String coordinator
		return coordinator;
	}

	public void setCreditCost(int creditCost) {// Setter method for the int creditCost
		GraduateProgram.creditCost = creditCost;
	}

	public int getCreditCost() {// Getter method for the int creditCost
		return creditCost;
	}

	@Override
	public String toString() { // ToString method
		return "In the Graduate Program,the name of the coordinator is " + coordinator + " and the credit cost is "
				+ creditCost + " $.";
	}

	@Override
	public boolean equals(Program gp) { // Equals method
		if (gp == null || getClass() != gp.getClass()) {
			return false;
		} else {
			GraduateProgram othergp = (GraduateProgram) gp;
			if (this.coordinator.equalsIgnoreCase(othergp.coordinator)
					&& GraduateProgram.creditCost == othergp.getCreditCost()) {
				return true;
			} else {
				return false;
			}

		}

	}
}