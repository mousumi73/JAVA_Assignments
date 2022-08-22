package lab1;

import java.util.Scanner;

public class Ex_3 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int a=1,b=1,sum=0;
		System.out.println("Enter the value of n: ");
		int n=sc.nextInt();
		System.out.print(a);
		System.out.println(" "+b);
		for(int i=0;i<n-2;i++) {
			sum=a+b;
			a=b;
			b=sum;
			System.out.println(" "+sum);
		}
		System.out.println();
		System.out.println(n+"th numberof the series is: "+sum);
	}

}
