import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int secondsPassed = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("カップラーメンにお湯を入れてから経過した秒数を入力してください: ");
                secondsPassed = scan.nextInt();
                validInput = true;
            } catch (java.util.InputMismatchException e) {
                System.out.println("入力エラー: 整数を入力してください。");
                scan.nextLine(); // 入力バッファをクリアするために次の行を読み飛ばす
            }
        }

        int remainingSeconds = 60 - secondsPassed;

        System.out.println("カップラーメンを食べるまで残り " + remainingSeconds + " 秒です。");
    }
}
