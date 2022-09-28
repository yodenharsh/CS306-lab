package lab2;

import java.util.Scanner;

public class Ladder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int n = sc.nextInt();
		sc.close();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			for (int j = i - 1; j >= 1; j--) {
				System.out.print(j);
			}
			System.out.println("");
		}
	}
}
