package ProgramClasses;
//------------------------------------------------------------------------------
//Assignment 1
//Part: Part 1 and 2
//Written by: Hawa-Afnane Said(ID:40263400)& Haifaa Janoudi(40263748)
//------------------------------------------------------------------------------

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

	public void setrequiredCourses(Course[] requiredCourses) { // Setter method for the array required courses
		this.requiredCourses = requiredCourses;

	}

	public Course[] getrequiredCourses() { // Getter method for the required courses
		return this.requiredCourses;
	}

	public void setelectiveCourses(Course[] electiveCourses) { // Setter method for the array elective courses
		this.electiveCourses = electiveCourses;
	}

	public Course[] getelectiveCourses() { // Getter method for the array elective courses
		return this.electiveCourses;
	}

	public void setinstituiton(String institution) { // Setter method for the string institution
		this.institution = institution;
	}

	public String getinstitution() { // Getter method for the string institution
		return this.institution;
	}
	// toString method
	public String toString() {
		return this.institution + " offers the program of " + this.name + " and the following specializaition "
				+ this.specialization + " that includes the following courses: \n" + this.requiredCourses
				+ " are the required courses \n " + this.electiveCourses + " are the elective courses \n "
				+ " and the total amount of credits is " + this.totalCredits + "credits.";
	}

	// Equals method
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