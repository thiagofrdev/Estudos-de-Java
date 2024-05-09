package entities;

public class Employee {
	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary(){
		return grossSalary - tax;
	}
	
	public void inceraseSalary(double percentage){
		grossSalary += grossSalary*(percentage/100);
	}
	
	public String toString(){
		return "Name: " + name + "\nSalary: " + netSalary();
	}
}
