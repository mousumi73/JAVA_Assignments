package lab5;

import java.util.Scanner;

public class Ex_2 {

	public static void main(String[] args) throws MyException {
		Scanner sc=new Scanner(System.in);
		String f_name=sc.nextLine();
		String l_name=sc.nextLine();
		String m_name=sc.nextLine();
		sc.close();
		if(f_name=="" || l_name=="") {
			throw new MyException("Please enter last name and first name");
		}
		else {
			System.out.println("Name is valid!!!");
		}

	}

}
