package misc;

public class temp {

	public static void main(String[] args) {

		System.out.println(getN(17, 41));
	}

	public static int getN(int X, int Y) {

		if (X == 1 || Y == 1)
			return X == 1 ? Y : X;

		if (X != Y) {


			for (int i = 1; i <= Math.pow(10, 18); i ++) {
				if ((i + Y) % X == 0) {

					if ((i + X) % Y == 0)
						return i;

				}
			}
		}
		return Y;
	}

	public static int findHCF(int X, int Y) {
		int hcf = 0, i;
		for (i = 1; i <= X || i <= Y; i++) {
			if (X % i == 0 && Y % i == 0)
				hcf = i;
		}
		return hcf;
	}

}
