import java.util.Scanner;

public class セクション9 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		String[] subName = new String[] {"A教科","B教科"};
		int[] subScore = new int[2];
		
		System.out.println(subName[0]+"の点数を入力してください.");
		subScore[0] = scanner.nextInt();
		
		System.out.println(subName[1]+"の点数を入力してください.");
		subScore[1] = scanner.nextInt();
		System.out.println();

		System.out.println(subName[0]+":"+subScore[0]+"点");
		System.out.println(subName[1]+":"+subScore[1]+"点");
		System.out.println("--------");
		System.out.println("平均"+((subScore[0]+subScore[1])/2.0)+"点");
	}

}
