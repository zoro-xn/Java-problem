package lqbtigao;

import java.util.Scanner;

public class ����ת�� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n == 0)
			System.out.println(0);
		else
			System.out.println(0 + (Integer.toOctalString(n)));
	}

}
