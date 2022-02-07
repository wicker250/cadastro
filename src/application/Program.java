package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Cadastro;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("mudando");
		
		String name,email;
		double salary;
		double percentage;
		
		System.out.println("digite o nome");
		name = sc.nextLine();
		
		System.out.println("digite o salario");
		salary = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("digite o email");
		email = sc.nextLine();
		
		Cadastro cadastro = new Cadastro(name,email,salary);
		
	   System.out.println(cadastro.getEmail());
	   System.out.println();
	   System.out.print("mudando email: ");
	   email=sc.nextLine();
	
	   cadastro.setEmail(email);
	   System.out.println(cadastro.getEmail());
	   
	   percentage=10;
	   
	   cadastro.Aumento(percentage);
	   
	   System.out.println(cadastro.getSalary());
	   
	   sc.close();
		
	}

}
