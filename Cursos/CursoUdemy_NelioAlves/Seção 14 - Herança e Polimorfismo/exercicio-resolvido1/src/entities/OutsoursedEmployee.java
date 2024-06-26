package entities;

public class OutsoursedEmployee extends Employee {
	private Double additionalCharge;
	
	public OutsoursedEmployee() {
		super();
	}

	public OutsoursedEmployee(String name, Integer hour, Double valuePerHour, Double additionalCharge) {
		super(name, hour, valuePerHour);
		this.additionalCharge = additionalCharge;
	}

	public Double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	
	@Override
	public double payment() {
		return super.payment() + additionalCharge*1.1;
	}
}
