package entities;

public class Product {
	public String name;
	public double price;
	public int quantity;
	
	public Product(String name, double price, int quantity) {// Esse é um corpo de um CONTRUTOR. Ele obriga inserir valores antes de instanciar o objeto
		this.name = name;//O this referencia ao atributo do objeto. Observe as cores
		this.price = price;
		this.quantity = quantity;
	}
	
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