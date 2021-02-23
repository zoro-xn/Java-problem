package lqbtigao;

import java.util.Scanner;

public class 偶数还是奇数 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n % 2 == 0) {
			System.out.println("even");
		} else
			System.out.println("odd");
	}

}
