package ProgramClasses;

public class Program {
	String name;
	String specialization;
	int totalCredits;
	String institution;
	Course[] requiredCourses;
	
	public Program() {
		
	}
	public Program() {
		
	}
	public Program(Program program1) {
		name=program1.name;
		specialization=program1.specialization;
		totalCredits=program1.totalCredits;
		institution=program1.institution;
		
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setSpecialization(String specialization) {
		this.specialization=specialization;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setTotalCredits(int totalCredits) {
		this.totalCredits=totalCredits;
	}
	public int getTotalCredits() {
		return totalCredits;
	}
}
