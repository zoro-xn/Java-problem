package lqbtigao;

import java.util.Scanner;

public class ¾Å¹¬¸ñ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] a = new int[3][3];
		int[] sum = new int[3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < 3; i++) {
			sum[0] += a[0][i];
		}
		for (int i = 0; i < 3; i++) {
			sum[1] += a[i][0];
		}
		for (int i = 0; i < 3; i++) {
			sum[2] += a[i][i];
		}
		if (sum[0] == sum[1] && sum[1] == sum[2])
			System.out.println(1);
		else
			System.out.println(0);
	}

}
