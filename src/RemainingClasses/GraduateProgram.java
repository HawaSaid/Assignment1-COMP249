package RemainingClasses;
import ProgramClasses.Program;;

public class GraduateProgram extends Program {

	String coordinator;
	static int creditCost;

	public GraduateProgram() {
		coordinator = null;
		creditCost = 0;
	}

	public GraduateProgram(String coordinator, int creditCost) {
		this.coordinator = coordinator;
		GraduateProgram.creditCost = creditCost;
	}

	public GraduateProgram(GraduateProgram graduate) {
		this.coordinator = graduate.coordinator;
		GraduateProgram.creditCost = graduate.creditCost;
	}

}
