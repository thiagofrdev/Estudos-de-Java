package entities;

public class Product {
	public String name;
	public double price;
	public int quantity;
	
	public double totalValueInStock(){
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity; //Acessa o atributo principal da CLASSE, não desse método, e soma com o do método 
	}
	
	public void removeProducts(int quantity){
		this.quantity -= quantity; 
	}
	
	public String toString(){ //Sobrepõe o método toString() natural de um Objeto em Java
		return "-------------------"
				+ "\nName: "
				+ name
				+ "\nQuantity: "
				+ quantity
				+ "\nPrice: "
				+ String.format("%.2f", price) //Converte para duas casas decimais
				+ "\nTotal: "
				+ String.format("%.2f", totalValueInStock())
				+"\n-------------------";
	}
}
