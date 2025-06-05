import java.util.Scanner;

public class セクション14 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		System.out.println("3つずつ増やして表示します．．");
		System.out.println("最小値を入力してください．");
		int min = scanner.nextInt();
		System.out.println("最大値を入力してください．");
		int max = scanner.nextInt();
		
		int count = 0;
		for (int i = min; i <= max; i +=3) {
			System.out.println(i);
			count++;
		}
		
		System.out.println("------");
		System.out.println("個数："+ count);
		}

}
