package hw;
/*
 * Topic: 請寫一個程式讓使用者輸入 a 與 b, 程式輸出 a 開 b 次方後的結果，例如 9.0 開 3次方 結果為 2.080083823051904
 * Date: 2016/09/19
 * Author: 105021057 張岳埕
 */
import java.util.Scanner;
public class hw04_105021057 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		float a = scn.nextInt();
		float b = scn.nextInt();
		double c = (double)Math.pow(a,1f/b);
		System.out.println(c);
	}

}
