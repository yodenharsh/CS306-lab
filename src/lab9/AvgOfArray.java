package lab9;

public class AvgOfArray {
	public static void main(String[] args) {
		double sum = 0;
		for(String s: args) {
			sum+= Double.parseDouble(s);
		}
		System.out.println(sum);
	}
}
