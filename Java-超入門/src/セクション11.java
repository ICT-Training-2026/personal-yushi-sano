import java.util.Scanner;

public class セクション11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("テストの点数を入力してください．");
        int a = scanner.nextInt();
        String b = "";  
        String c = "";

        if (a < 60) {
            System.out.println("補修を受けましたか？（yes/no）");
            b = scanner.next(); 
        }

        if (a >= 80) {
            c = "A評価";
        } else if (a >= 60) {
            c = "B評価";
        } else if (b.equals("yes")) {
            c = "C評価";
        } else {
            c = "D評価";
        }

        System.out.println("結果：" + c);
    }
}