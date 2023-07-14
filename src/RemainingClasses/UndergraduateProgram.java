package RemainingClasses;
import ProgramClasses.Program;

public class UndergraduateProgram extends Program {
	boolean accredited;
	static int creditCost;

	public UndergraduateProgram() {
		accredited = false;
		creditCost = 0;
	}

	public UndergraduateProgram(boolean accredited, int creditCost) {
		this.accredited = accredited;
		UndergraduateProgram.creditCost = creditCost;
	}

	public UndergraduateProgram(UndergraduateProgram undergraduate) {
		this.accredited = undergraduate.accredited;
		UndergraduateProgram.creditCost = undergraduate.creditCost;

	}

}
