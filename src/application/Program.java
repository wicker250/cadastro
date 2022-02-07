package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Cadastro;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		String name,email;
		double salary;
		double percentage;
		
		System.out.print("digite o nome: ");
		name = sc.nextLine();
		
		System.out.print("digite o salario: ");
		salary = sc.nextDouble();
		sc.nextLine();
		
		System.out.print("digite o email: ");
		email = sc.nextLine();
		
		Cadastro cadastro = new Cadastro(name,email,salary);
		
	   System.out.println("o email atual eh: "+cadastro.getEmail());
	   System.out.print("mudando email: ");
	   email=sc.nextLine();
	
	   cadastro.setEmail(email);
	   System.out.println(cadastro.getEmail());
	   
	   percentage=10;
	   
	   cadastro.Aumento(percentage);
	   
	   System.out.println("salario atualizado: "+cadastro.getSalary());
	   
	   sc.close();
		
	}

}
