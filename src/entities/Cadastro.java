package entities;

public class Cadastro {

	private String name;
	private String email;
	private Double salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Double getSalary() {
		return salary;
	}
	
	
	public Cadastro(String name, String email, Double salary) {
		this.name = name;
		this.email = email;
		this.salary = salary;
	}
	
	public Cadastro() {
		
	}
	
	public void Aumento(Double percentage) {
		this.salary = this.salary + this.salary*percentage /100;
	}
	
	
	
	
}
