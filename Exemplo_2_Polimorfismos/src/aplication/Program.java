package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entites.Employee;
import entites.OutsoursedEmployee;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Employee> list = new ArrayList<Employee>();
		
		System.out.print("Enter the number of employees:");
		int n = sc.nextInt();
		
		for (int i = 1; i<=n; i++) {
			System.out.print("Employee #" + i  + "data: ");
			System.out.print("Outsourced (y/n)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double vHours = sc.nextDouble();
			if (ch == 'y') {
				System.out.print("Additional charge: ");
				double addcharge = sc.nextDouble();
				list.add(new OutsoursedEmployee(name, hours, vHours, addcharge) );
			}
			else {
				list.add(new Employee(name, hours, vHours));
			}
		}
		
		System.out.println();
		System.out.println("PAYMENT:");
		for (Employee emp : list) {
			System.out.println(emp.getName() + "$" + String.format("%.2f",emp.payment()));
		}
		
		sc.close();
	}

}
