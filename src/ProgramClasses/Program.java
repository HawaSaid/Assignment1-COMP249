package ProgramClasses;

import RemainingClasses.Course;

public class Program {
	String name;
	String specialization;
	int totalCredits;
	String institution;
	Course[] requiredCourses;

	public Program() {
		name = null;
		specialization = null;
		totalCredits = 0;
		institution = null;

	}

	public Program() {

	}

	public Program(Program program1) {
		name = program1.name;
		specialization = program1.specialization;
		totalCredits = program1.totalCredits;
		institution = program1.institution;

	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setTotalCredits(int totalCredits) {
		this.totalCredits = totalCredits;
	}

	public int getTotalCredits() {
		return totalCredits;
	}

	// to modify.
	public String toString() {
		return name;
	}
}
