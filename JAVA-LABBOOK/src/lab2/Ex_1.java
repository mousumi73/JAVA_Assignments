package lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex_1 {
	static int getSecondSmallest(int[] arr) {
		Arrays.sort(arr);
		return arr[1];
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Second smallest element is: "+getSecondSmallest(arr));
	}

}
