package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	/*ATRIBUTOS*/
	private Date moment;
	private OrderStatus status;
	
	/*ASSOCIAÇÕES*/
	private Client client;
	private List<OrderItem> items = new ArrayList<>();
	
	/*CONSTRUTORES*/
	public Order() {
	}

	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	/*GETTERS E SETTERS*/
	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}		
	
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	/*MÉTODOS*/
	public void addItem(OrderItem item) {
		items.add(item);
	}
	
	public void removeItem(OrderItem item) {
		items.remove(item);
	}
	
	public double total() {
		double sum = 0.0;
		for(OrderItem item : items) {
			sum += item.subTotal();
		}
		return sum;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("SUMÁRIO DA ORDEM:\n");
		sb.append("Data da ordem: " + sdf.format(moment));
		sb.append("\nStatus da ordem: " + status);
		sb.append("\nCliente: " + client);
		sb.append("\nItens da ordem: \n");
		for(OrderItem item : items) {
			sb.append(item + "\n");
		}
		sb.append("Preço total: " + total());
		return sb.toString();
	}
}