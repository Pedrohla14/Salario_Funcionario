package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Etities.Employee;
import Etities.OutsourcedEmployee;

public class Program {
	public static void main(String[] args)  {
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		
		List<Employee> list= new ArrayList<Employee>();
		 
		System.out.println(" quantos funcionarios? ");
		int qnt_funcionario = sc.nextInt();
		
		for(int i=1; i<=qnt_funcionario;i++) {
			System.out.printf("Employee #%d data: %n ",i);
			System.out.println(" Tercerizado?(y/n) ");
			char outsourced= sc.next().charAt(0);
			
			sc.nextLine();
			System.out.println("Name:");
			String name=sc.nextLine();
			
			System.out.println("Hours: ");
			int hours = sc.nextInt();
			
			System.out.println(" Value por hora: ");
			Double valuePerHour= sc.nextDouble();
			
			if (outsourced=='y') {
				System.out.println(" Additional charge :");
				Double additionalCharge = sc.nextDouble();
				
			    Employee employee= new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
			    list.add(employee);
			}
			else {
				Employee employee= new Employee(name, hours, valuePerHour);
				list.add(employee);
			}
			
			
			
		}
		
		//imprimir os salários dos funcionários 
		System.out.println("Payment :");
		for(Employee obj: list) {
			
			System.out.printf(" %s - $ %.2f %n",obj.getName(),obj.payment());
			
			
			
		}
		
		
		
		
		
		
		
		
		sc.close();
	}

}
