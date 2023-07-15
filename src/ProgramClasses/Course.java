package ProgramClasses;

public class Course {
	String name;
	int credits;

	public Course() {// Default constructor
		name = null;
		credits = 0;
	}

	public Course(String name, int credits) {// Custom constructor
		this.name = name;
		this.credits = credits;
	}

	public Course(Course course) {// Copy constructor
		this.name = course.name;
		this.credits = course.credits;
	}

	public void setName(String name) {// Setter method for the String name
		this.name = name;
	}

	public String getName() {// Getter method for the String name
		return name;
	}

	public void setCredits(int credits) {// Setter method for the int credits
		this.credits = credits;
	}

	public int getCredits() {// Getter method for the int credits
		return credits;
	}

	public String toString() {// toString method
		return "The name of the course is " + name + " and the amount of credit for that course is " + credits;
	}

	public boolean equals(Course c) {// Equals method
		if (c == null) {
			return false;
		} else {
			if (this.name.equalsIgnoreCase(c.getName()) && this.credits == c.credits) {
				return true;
			} else {
				return false;
			}

		}
	}
}
