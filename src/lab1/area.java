package lab1;

import java.util.Scanner;

public class area {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter height");
		int h = sc.nextInt();
		System.out.println("Enter base");
		int b = sc.nextInt();
		double area = h * b * 1 / 2;
		sc.close();
		System.out.println("area = " + area);
	}
}
