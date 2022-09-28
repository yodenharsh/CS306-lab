package lab7;
//Sep 13
//Write a Java program in which you declare two interfaces
//Sum and add, class InterfaceOne implements these interfaces
//and displays their content. 

public class InterfaceOne implements sum,add{

	@Override
	public int getAdd(int a, int b) {
		return a+b;
	}

	@Override
	public int getSum(int[] intArray) {
		int sum = 0;
		for(int num: intArray) {
			sum+= num;
		}
		return sum;
	}
	public static void main(String[] args) {
		var obj = new InterfaceOne();
		System.out.println("3+11= "+obj.getAdd(3, 11));
		System.out.println("0+1+1+2+3= " + obj.getSum(new int[] {0,1,1,2,3}));
	}
}

interface sum{
	public int getSum(int[] intArray);
}

interface add{
	public int getAdd(int a,int b);
}