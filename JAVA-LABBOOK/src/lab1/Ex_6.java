package lab1;

import java.util.Scanner;

public class Ex_6 {
	static int calculateDifference(int n){
		int sum=0,sum1=0,sum2=0,difference=0;
		for(int i=0;i<n;i++) {
			sum=sum+i;
			sum1=sum*sum;
			sum2=sum2+(i*i);
		}
		if(sum1>sum2) {
			difference=sum1-sum2;
		} else {
			difference=sum2-sum1;
		}
		return difference;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(calculateDifference(n));
	}

}
