package lqbtigao;

import java.util.Scanner;

public class ×Ö·û´®Æ¥Åä {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int flag = sc.nextInt();
		if (flag == 0) {
			str = str.toLowerCase();
		}
		int n = sc.nextInt();
		String[] s = new String[n];
		for (int i = 0; i < n; i++) {
			s[i] = sc.next();
		}
		for (int i = 0; i < n; i++) {
			if (flag == 0) {
				if (s[i].toLowerCase().contains(str)) {
					System.out.println(s[i]);
				}
			} else {
				if (s[i].contains(str)) {
					System.out.println(s[i]);
				}
			}
		}
	}

}
