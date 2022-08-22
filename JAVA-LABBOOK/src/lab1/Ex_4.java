package lab1;

import java.util.Scanner;

public class Ex_4 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		for(int i=2;i<n;i++) {
			int p=0;
			for(int j=2;j<i;j++) {
				if(i%j==0)
					p=1;
			}
			if(p==0)
				System.out.println(i);
		}
		

	}

}
