package lqbtigao;

import java.util.Calendar;
import java.util.Scanner;

public class 日期计算 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int YYYY = sc.nextInt();
		int MM = sc.nextInt();
		int DD = sc.nextInt();
		Calendar calendar = Calendar.getInstance();
		// 1月份---12月份（0---11）
		calendar.set(YYYY, MM - 1, DD);
		// 星期日---星期一（1---7）
		int t = calendar.get(Calendar.DAY_OF_WEEK);
		if (t == 1)
			System.out.println(7);
		else
			System.out.println(t - 1);

	}

}
