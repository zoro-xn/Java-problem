package lqbtigao;

import java.math.BigInteger;
import java.util.Scanner;

public class 高精度除高精度 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger a = sc.nextBigInteger();
		BigInteger b = sc.nextBigInteger();
		System.out.println(a.divide(b));
	}

}
