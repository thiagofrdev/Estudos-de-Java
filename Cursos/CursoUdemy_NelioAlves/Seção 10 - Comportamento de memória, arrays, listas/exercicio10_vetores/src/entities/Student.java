package entities;

public class Student {
	//ATRIBUTTES
	private String name;
	private double grade1;
	private double grade2; 
	
	//CONSTRUCTOR
	public Student(String name, double grade1, double grade2) {
		this.name = name;
		this.grade1 = grade1;
		this.grade2 = grade2;
	}
	
	//GETTERS AND SETTERS
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGrade1() {
		return grade1;
	}

	public void setGrade1(double grade1) {
		this.grade1 = grade1;
	}

	public double getGrade2() {
		return grade2;
	}

	public void setGrade2(double grade2) {
		this.grade2 = grade2;
	}
	
	//METHODS
	public double average() {
		return (grade1+grade2)/2.0;
	}
	
	public boolean approved() {
		return average() >= 6.0;
	}
}
