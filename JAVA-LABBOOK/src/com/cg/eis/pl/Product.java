package com.cg.eis.pl;

import java.util.Scanner;

import com.cg.eis.service.EmployeeService;
import com.cg.eis.service.EmployeeServiceInterface;

public class Product {
	static int selectOption;

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EmployeeService empService=new EmployeeServiceInterface();
		
		do {
			System.out.println("1. Add Employee");
			System.out.println("2. Update Employee ");
			System.out.println("3. Delete Employee");
			System.out.println("4. View scheme details");
			System.out.println("Enter 0 to exit");
			System.out.println("Choose any one option: ");
			selectOption=sc.nextInt();
			
			switch(selectOption) {
			case 1:
				
			}
		}

	}

}
