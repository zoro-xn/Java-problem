package lqbtigao;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class ÖÊÊı {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		int n = sc.nextInt();
		int ans = 0;
		for (int i = 2; i < n; i++) {
			if (prime(i)) {
				ans++;
				list.add(i);
			}
		}

		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.print("\n" + ans);
	}

	public static boolean prime(int i) {
		for (int j = 2; j < i; j++) {
			if (i % j == 0) {
				return false;
			}
		}
		return true;
	}
}
