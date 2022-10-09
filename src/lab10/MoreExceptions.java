package lab10;

public class MoreExceptions {
	public static void main(String[] args) throws Exception {
		if(args.length != 2) throw new Exception();
		else if(args[1] == String.valueOf(0)) throw new ArithmeticException();
		else System.out.println(Integer.parseInt(args[0])/Integer.parseInt(args[1]));
	}
}
