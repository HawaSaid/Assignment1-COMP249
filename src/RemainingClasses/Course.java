package RemainingClasses;

public class Course {
	String name;
	int credits;

	public Course() {
		name = null;
		credits = 0;
	}

	public Course(String name, int credits) {
		this.name = name;
		this.credits = credits;
	}

	public Course(Course course) {
		this.name = course.name;
		this.credits = course.credits;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setCredis(int credits) {
		this.credits = credits;
	}

}
