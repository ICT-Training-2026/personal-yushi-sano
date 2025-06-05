import java.util.Scanner;

public class セクション10 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		System.out.println("整数aについて入力してください.");
		int a;
		a = scanner.nextInt();
		String b;
		if ( 1 <= a && a <= 100) {
			b = "1～100の範囲内です．";
		} else {
			b = "1～100の範囲外です．";
		}
		System.out.println(a+"は"+b);
	}

}
