package lqbtigao;

import java.util.Scanner;

public class 计数问题 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ans = 0;
		int n = sc.nextInt();
		int x = sc.nextInt();
		sc.close();
		for (int i = x; i <= n; i++) {
			int t = i;
			while (t > 0) {
				if (t % 10 == x)
					ans++;
				t /= 10;
			}
		}
		System.out.println(ans);
	}

}
