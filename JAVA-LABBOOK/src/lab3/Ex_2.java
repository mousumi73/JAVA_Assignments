package lab3;

import java.util.Scanner;

public class Ex_2 {
	static String getImage(String s) {
		StringBuilder sb= new StringBuilder(s);
		sb.reverse();
		return sb.toString();
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str=sc.nextLine();System.out.println(str+ " | "+getImage(str));

	}

}
