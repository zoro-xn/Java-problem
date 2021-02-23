package lqbtigao;

import java.util.Scanner;

public class Å·À­º¯Êý {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long ans = n;
		for (int i = 2; i <= n / i; i++) {
			if (n % i == 0) {
				ans = ans / i * (i - 1);
				while (n % i == 0)
					n /= i;
			}
		}
		if (n > 1) {
			ans = ans / n * (n - 1);
			System.out.println(ans);
		} else {
			System.out.println(ans);
		}
	}

}
