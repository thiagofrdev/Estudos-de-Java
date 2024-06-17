package entities;

public class Company extends People{
	private Integer numberEmployees;
	
	public Company() {
	}

	public Company(String name, Double annualIncome, Integer numberEmployees) {
		super(name, annualIncome);
		this.numberEmployees = numberEmployees;
	}

	public Integer getNumberEmployees() {
		return numberEmployees;
	}

	public void setNumberEmployees(Integer numberEmployees) {
		this.numberEmployees = numberEmployees;
	}
//Paga 16% de imposto. Se tiver 10 < funcionários paga 14%
	public double tax() {
		double tax = 0;
		double annualIncome = getAnnualIncome();
		if(numberEmployees <= 10) {
			tax = annualIncome*0.16;
		} else if (numberEmployees > 10) {
			tax = annualIncome*0.14;
		}
		return tax;
	}
}
