package lqbtigao;

import java.util.Scanner;

public class 一元二次方程 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		double x1, x2;
		double t = b * b - 4 * a * c;
		if (t < 0) {
			System.out.println("NO");
		} else if (t == 0) {
			x1 = (-b) / (2 * a);
			System.out.println(x1);
		} else {
			x1 = (-b + Math.sqrt(t)) / (2 * a);
			x2 = (-b - Math.sqrt(t)) / (2 * a);
			System.out.println(x1 + " " + x2);
		}
	}

}
