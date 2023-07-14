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

	public SpecialProgram(CertificateProgram certificate) {// Copy constructor
		super(certificate);
		this.duration = certificate.capacity;
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

	@Override
	public String toString() {// toString method
		return "The duration is for the SpecialProgram " + duration + " and the creditCost is" + creditCost;
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