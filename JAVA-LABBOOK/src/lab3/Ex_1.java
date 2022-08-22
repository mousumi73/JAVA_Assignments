package lab3;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex_1 {

	public static void main(String[] args) {
		int n;
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers: ");
		String s=sc.nextLine();
		StringTokenizer st=new StringTokenizer(s," ");
		while(st.hasMoreTokens()) {
			String temp=st.nextToken();
			n=Integer.parseInt(temp);
			System.out.print(n+" ");
			sum=sum+n;
		}
		System.out.println();
		System.out.println("Sum of the numbers is: "+sum);
		sc.close();
		
	}

}
