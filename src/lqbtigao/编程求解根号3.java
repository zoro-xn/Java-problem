package lqbtigao;

public class 编程求解根号3 {
	public static void main(String[] args) {
		double low = 1.0;
		double high = 2.0;
		double n = 3.0;
		double avg = 0, sum;
		for (int i = 0; i < 20; i++) {
			avg = (low + high) / 2;
			sum = avg * avg;
			if (sum > n)
				high = avg;
			else
				low = avg;
		}
		System.out.printf("%.5f", avg);
	}

}
