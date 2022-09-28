package lab1;

import java.util.Scanner;

public class prime {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to be checked");
		int num = sc.nextInt();
		sc.close();
		boolean isPrime = true;
		int factors = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0)
				factors++;
			if (factors > 2) {
				isPrime = false;
				break;
			}
		}
		if (isPrime)
			System.out.println(num + " is Prime");
		else
			System.out.println(num + " isn't Prime");

		enchancedForLoopTest obj = new enchancedForLoopTest();
		obj.setA(43);
		System.out.println(obj.getA());
	}
}
