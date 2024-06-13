package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLevel;

//LEMBRETE LÓGICO: Imagine essa classe como um único trabalhador. Cada trabalhador são instâncias dessa classe

public class Worker {
	/*ATRIBUTOS*/
	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	
	/*ASSOCIAÇÕES*/
	//Diacordo com o UML, um Worker só irá possuir UM departamento
	private Department department;
	//Diacordo com o UML, um Worker poderá ter VÁRIOS contratos. Para armazenar esses vários contratos foi criado uma lista
	private List<HourContract> contracts = new ArrayList<>();//Iniciando uma lista vazia
	
	/*CONSTRUTORES*/
	public Worker() {
		
	}

	public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}

	/*GETTERS E SETTERS*/
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

 	public List<HourContract> getContracts() {
		return contracts;
	}

	/* Esse SETTER está criando/setando uma nova lista em cima da que já existe, trocando a original por outra lista
	public void setContracts(List<HourContract> contracts) {
		this.contracts = contracts;
	}
	 */	
 	
	public void addContract(HourContract contract) {
		contracts.add(contract);
	}
	
	public void removeContract(HourContract contract) {
		contracts.remove(contract);
	}
	
	public double income(int year, int month) {
		double sum = baseSalary;
		Calendar cal = Calendar.getInstance();
		//Lê-se: Para cada contrato "c" na lista de contratos...
		for(HourContract c : contracts) {
			cal.setTime(c.getDate());
			int c_year = cal.get(Calendar.YEAR);
			int c_month = 1 + cal.get(Calendar.MONTH);
			if(year == c_year && month == c_month) {
				sum += c.totalValue();
			}
		}
		return sum;
	}
}
