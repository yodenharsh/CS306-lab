package lab9;

import java.util.Scanner;

public class MatrixSum {
	public static int[][] matrixInput(int n[][], Scanner sc) {
		for(int i = 0;i<=n.length-1;i++) {
			for(int j = 0;j<=n[i].length-1;j++) {
				n[i][j] = sc.nextInt();
			}
		}
		
		return n;
	}
	
	public static int[][] sum(int n1[][], int n2[][]){
		
		int result[][] = new int[n1.length][n1[0].length];
		
		for(int i = 0;i<=n1.length-1;i++) {
			for(int j = 0;j<=n1[i].length-1;j++) {
				result[i][j] = n1[i][j] + n2[i][j];
			}
		}
		return result;
	}
	
	public static void displayMatrix(int [][]n) {
		for(int i = 0;i<=n.length-1;i++) {
			for(int j = 0;j<=n[i].length-1;j++) {
				System.out.print(n[i][j] + " ");
			}
			System.out.println("");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Provide n for size nxn for both matrices");
		int size = sc.nextInt();
		int[][] n1 = new int[size][size];
		int[][] n2 = new int[size][size];
		System.out.println("Give inputs for n1");
		n1 = matrixInput(n1, sc);
		System.out.println("Give inputs for n2");
		n2 = matrixInput(n2, sc);
		sc.close();
		displayMatrix(sum(n1, n2));
	}
}
