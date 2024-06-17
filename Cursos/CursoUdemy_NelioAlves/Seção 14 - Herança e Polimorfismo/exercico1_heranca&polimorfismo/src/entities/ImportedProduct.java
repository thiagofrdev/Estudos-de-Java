package entities;

public final class ImportedProduct extends Product {
	private Double customsFee;
	
	public ImportedProduct() {
		super();
	}

	public ImportedProduct(String name, Double preco, Double customsFee) {
		super(name, preco);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	@Override
	public String priceTag() {
		return getName() + " R$" + (getPreco()+customsFee) + " (Customs fee: R$" + customsFee + ")"; 
	}
}
