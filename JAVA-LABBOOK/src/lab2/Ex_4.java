package lab2;

import java.util.Arrays;

public class Ex_4 {
	static int modifyArray(int[] arr,int n) {
		int j=0;
		for(int i=0;i<n-1;i++) {
				if(arr[i]!=arr[i+1])
					arr[j++]=arr[i];
		}
			        arr[j++]=arr[n-1];
		return j;
	}

	public static void main(String[] args) {
		int arr[]= {2,4,6,1,9,5,2,9};
		Arrays.sort(arr);
		int n=arr.length;
		n=modifyArray(arr,n);
		for(int i=n-1;i>=0;i--)
		System.out.print(arr[i]+" ");
		
	}

}
