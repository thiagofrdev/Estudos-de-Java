package entities;

public class Peoples {
	//ATRIBUTTES
	private char gen;
	private double height;
	double higerHeight = 0.0;
	double smallerHeight = 0.0;


	//CONSTRUCTOR
	public Peoples(char gen, double height) {
		this.gen = gen;
		this.height = height;
	}
	
	//GETTERS AND SETTERS
	public char getGen() {
		return gen;
	}

	public void setGen(char gen) {
		this.gen = gen;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	//METHODS
	public void getGreatSmallHeight() {
		if(height > higerHeight) {
			higerHeight = height;
		} else if() {
			smallerHeight = height;
		}
	}
}

