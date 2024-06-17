package entities;

public class Individual extends People{
	private Double healthSpending;
	
	public Individual() {
	}

	public Individual(String name, Double annualIncome, Double healthSpending) {
		super(name, annualIncome);
		this.healthSpending = healthSpending;
	}

	public Double getHealthSpending() {
		return healthSpending;
	}

	public void setHealthSpending(Double healthSpending) {
		this.healthSpending = healthSpending;
	}
//Renda < 20000 pagam 15% de imposto. Renda >= 20000 pagam 20%. Se teve gastos com saúde, 50% desse valor é abatido no imposto (Desconta o salário normalmente e depois abate)
	public double tax() {
		double tax = 0;
		double annualIncome = getAnnualIncome();
		if(annualIncome < 20000) {
			tax = annualIncome*0.15;
		} else if (annualIncome >= 20000) {
			tax = annualIncome*0.25;
		}
		
		if(healthSpending > 0) {
			return tax -= healthSpending*0.5; 
		} else {
			return tax;
		}
			
	}
}
