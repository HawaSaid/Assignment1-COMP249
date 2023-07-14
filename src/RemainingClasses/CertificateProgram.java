package RemainingClasses;

import ProgramClasses.Program;

public class CertificateProgram extends Program {
	int capacity;
	static int creditCost;

	public CertificateProgram() {
		capacity = 0;
		creditCost = 0;
	}

	public CertificateProgram(int capacity, int creditCost) {
		this.capacity = capacity;
		CertificateProgram.creditCost = creditCost;
	}

	public CertificateProgram(CertificateProgram certificate) {
		this.capacity = certificate.capacity;
		CertificateProgram.creditCost = certificate.getCreditCost();
	}

	public void setCapacity(int capacity) {// Setter method for the int capacity
		this.capacity = capacity;
	}

	public int getCapacity() {// Getter method for the int capacity
		return capacity;
	}

	public void setCreditCost(int creditCost) {// Setter method for the int creditCost
		CertificateProgram.creditCost = creditCost;
	}

	public int getCreditCost() {// Getter method for the int creditCost
		return creditCost;
	}

	@Override
	public String toString() {// toString method
		return "The capacity is " + capacity + " and the creditCost is" + creditCost;
	}

	@Override
	public boolean equals(Object cp) { // Equals method
		if (cp == null || getClass() != cp.getClass()) {
			return false;
		} else if (this == cp) {
			return true;
		}
		CertificateProgram othercp = (CertificateProgram) cp;
		return this.capacity == othercp.capacity && CertificateProgram.creditCost == othercp.getCreditCost();

	}


}
