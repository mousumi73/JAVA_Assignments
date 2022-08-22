package lab1;

import java.util.Scanner;

public class Ex_2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String light=sc.next();
		switch(light) {
		case "red":
		System.out.println("Stop");
		break;
		case "yellow":
			System.out.println("Ready");
			break;
		case "green":
			System.out.println("Go");
		}
	}

}
