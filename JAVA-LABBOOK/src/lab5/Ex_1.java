package lab5;

import java.util.Scanner;

public class Ex_1 {

	public static void main(String[] args) throws MyException {
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
			if(age>=15) {
				System.out.println("Valid age");
			}
			else {
				throw new MyException("Age should be above 15");
			}

	}

}
