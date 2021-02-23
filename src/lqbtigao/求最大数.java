package lqbtigao;

import java.util.Arrays;
import java.util.Scanner;

public class 求最大数 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[10];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		System.out.println(a[9]);
	}

}
