package entities;

public class People {
	//ATRIBUTTES
	private String name;
	private int age;
	
	//CONTRUCTOR
	public People (String name, int age){
		this.name = name;
		this.age = age;
	}

	//GETTERS AND SETTERS
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
