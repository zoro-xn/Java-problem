package lqbtigao;

import java.util.Scanner;

public class 分解质因数 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		for (int i = 2; i <= n / i; i++) {
			if (n % i == 0) {
				while (n % i == 0) {
					System.out.print(i + " ");
					n /= i;
				}
			}
		}
		if (n > 1) {

			System.out.println(n);
		}
	}

}
