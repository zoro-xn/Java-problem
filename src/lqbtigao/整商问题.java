package lqbtigao;

import java.util.Scanner;

public class 整商问题 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the dividend:");
		int bcs = sc.nextInt();
		System.out.println("Please enter the divisor:");
		int cs = sc.nextInt();
		while (cs == 0) {
			System.out.println("Error: divisor can not be zero! Please enter a new divisor:");
			cs = sc.nextInt();
		}
		int ans = bcs / cs;
		System.out.println(ans);
	}
}