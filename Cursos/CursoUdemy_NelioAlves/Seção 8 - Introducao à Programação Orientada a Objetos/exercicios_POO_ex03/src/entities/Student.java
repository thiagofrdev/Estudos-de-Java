package entities;

public class Student {
	public String name;
	public double nota1;
	public double nota2;
	public double nota3;
	public double missingPoints;
	
	public double average(){
		return nota1+nota2+nota3;
	}
	
	public String result(){
		if(average() >= 60){
			return "PASS";
		} else {
			missingPoints = 60-average();
			return "FALIELD";
		}
	}
	
	public String toString(){
		return "Student: " 
				+ name
				+ "\nAverage: "
				+ average();
	}
}
