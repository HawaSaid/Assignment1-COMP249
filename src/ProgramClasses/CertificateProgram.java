package ProgramClasses;

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
		CertificateProgram.creditCost = certificate.creditCost;
	}
}
