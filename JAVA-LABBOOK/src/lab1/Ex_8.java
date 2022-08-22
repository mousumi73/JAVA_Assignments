package lab1;

import java.util.Scanner;

public class Ex_8 {
	static boolean checkNumber(int n) {
		while(n%2==0) {
			n=n/2;
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(checkNumber(n));
	}

}
