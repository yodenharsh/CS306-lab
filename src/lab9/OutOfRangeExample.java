package lab9;

import java.util.Scanner;

import org.w3c.dom.ranges.RangeException;

public class OutOfRangeExample {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		int num = (new Scanner(System.in)).nextInt();
		if(num<10 || num>50) throw new RangeException((short) 0, "given number is out of range");
		else System.out.println(num*num);
	}
}
