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
		this.name = null;
		this.specialization = null;
		this.totalCredits = 0;
		this.institution = null;

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
		this.name = program1.name;
		this.specialization = program1.specialization;
		this.totalCredits = program1.totalCredits;
		this.institution = program1.institution;

	}

	public void setName(String name) { // Setter method for the String name
		this.name = name;
	}

	public String getName() { // Getter method for the String name
		return this.name;
	}

	public void setSpecialization(String specialization) { // Setter method for the String specialization
		this.specialization = specialization;
	}

	public String getSpecialization() { // Getter method for the String specialization
		return this.specialization;
	}

	public void setTotalCredits(int totalCredits) { // Setter method for the integer totalCredits
		this.totalCredits = totalCredits;
	}

	public int getTotalCredits() { // Getter method for the integer totalCredits
		return this.totalCredits;
	}

	public void setrequiredCourses(Course[] requiredCourses) { // setter method for the array required courses
		this.requiredCourses = requiredCourses;

	}

	public Course[] getrequiredCourses() { // getter method for the required courses
		return this.requiredCourses;
	}

	public void setelectiveCourses(Course[] electiveCourses) { // setter method for the array elective courses
		this.electiveCourses = electiveCourses;
	}

	public Course[] getelectiveCourses() { // getter method for the array elective courses
		return this.electiveCourses;
	}

	public void setinstituiton(String institution) { // setter method for the string institution
		this.institution = institution;
	}

	public String getinstitution() { // getter method for the string institution
		return this.institution;
	}

	// overridden methods
	public String toString() {
		return this.institution + "offer the program of " + this.name + "the following specializaition"
				+ this.specialization + "that include the following courses: \n" + this.requiredCourses
				+ " are the required courses \n " + this.electiveCourses + " are the elective courses \n"
				+ " and the total amount of credits is " + this.totalCredits + "credits.";
	}

	public boolean equals(Program Program1) {
		if (Program1 == null || this.getClass() != Program1.getClass())
			return false;
		else {
			Program P = (Program) Program1;
			if (this.name.equalsIgnoreCase(P.name) && this.specialization.equalsIgnoreCase(P.specialization)
					&& this.electiveCourses.equals(P.electiveCourses) && this.requiredCourses.equals(P.requiredCourses)
					&& this.institution.equals(P.institution) && this.totalCredits == P.totalCredits)
				return true;
			else
				return false;

		}
	}

}