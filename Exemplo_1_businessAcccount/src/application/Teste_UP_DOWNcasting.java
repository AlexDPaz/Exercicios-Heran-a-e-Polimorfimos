package application;

import entities.Account;
import entities.BusineesAccount;
import entities.SavingsAccount;

public class Teste_UP_DOWNcasting {

	public static void main(String[] args) {
		
		Account acc = new Account(1001, "Alex", 0.0);
		BusineesAccount bacc = new BusineesAccount(1002, "Maria", 0.0, 500.0);
		
		//UPCASTING
		
		/* UpCasting (subir a hierarquia)
		 * 
           É quando uma superclasse recebe uma referência da subclasse. Implícito, pois gato É UM felino.*/
		
		Account acc1 = bacc;
		Account acc2 = new BusineesAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01);
		
		// é uma operação prefeitamente normal pergar um objeto que é de uma subclasse e atribuilo a uma variavel de uma classe.
		
		//DOWNCASTING
		
		/*DownCasting (descer a hierarquia)
		 * 
          É quando uma subclasse recebe uma referência de uma superclasse. Não implícito, porque o 
          compilador não sabe se realmente a instância é do tipo da subclasse declarada, pois, como neste
          exemplo, Felino pode ser um gato ou um Leao. Mas como o programador sabe que é do tipo 
          gato, ele coloca a subclasse entre parênteses, indicando ao compilador que o Casting está correto.*/
		
		BusineesAccount acc4 = (BusineesAccount)acc2;
		acc4.loan(100.0);
		
		//BusineesAccount acc5 = (BusineesAccount)acc3;
		if (acc3 instanceof BusineesAccount) {
			BusineesAccount acc5 = (BusineesAccount)acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updatealance();
			System.out.println("Update!");
		}

	}

}
