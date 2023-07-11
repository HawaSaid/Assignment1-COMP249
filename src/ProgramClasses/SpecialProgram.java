package ProgramClasses;

public class SpecialProgram extends Program {

	int duration;
	static int creditCost;

	public SpecialProgram() {
		duration = 0;
		creditCost = 0;
	}

	public SpecialProgram(int capacity, int creditCost) {
		this.duration = capacity;
		SpecialProgram.creditCost = creditCost;
	}

	public SpecialProgram(CertificateProgram certificate) {
		this.duration = certificate.capacity;
		SpecialProgram.creditCost = certificate.creditCost;
	}

}
