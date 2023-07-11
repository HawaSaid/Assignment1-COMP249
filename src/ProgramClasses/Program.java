package ProgramClasses;

import RemainingClasses.Course;

public class Program {
	String name;
	String specialization;
	int totalCredits;
	String institution;
	Course[] requiredCourses;
	Course[] electiveCourses;

	public Program() { // Default constructor
		name = null;
		specialization = null;
		totalCredits = 0;
		institution = null;

	}

	public Program(String name, String specialization, int totalCredits, String institution, Course[] requiredCourses,
			Course[] electiveCourses) { // Custom constructor
		this.name = name;
		this.specialization = specialization;
		this.totalCredits = totalCredits;
		this.institution = institution;
		this.requiredCourses = requiredCourses;
		this.electiveCourses = electiveCourses;
	}

	public Program(Program program1) { // Copy constructor
		name = program1.name;
		specialization = program1.specialization;
		totalCredits = program1.totalCredits;
		institution = program1.institution;

	}

	public void setName(String name) { // Setter method for the String name
		this.name = name;
	}

	public String getName() { // Getter method for the String name
		return name;
	}

	public void setSpecialization(String specialization) { // Setter method for the String specialization
		this.specialization = specialization;
	}

	public String getSpecialization() { // Getter method for the String specialization
		return specialization;
	}

	public void setTotalCredits(int totalCredits) { // Setter method for the integer totalCredits
		this.totalCredits = totalCredits;
	}

	public int getTotalCredits() { // Getter method for the integer totalCredits
		return totalCredits;
	}

	// to modify.
	public String toString() { // ToString method
		return name;
	}
}
