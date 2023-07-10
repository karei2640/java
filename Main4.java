import java.util.Scanner;

public class Main4 {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("整数 a を入力してください: ");
        int a = scan.nextInt();

        System.out.print("整数 b を入力してください: ");
        int b = scan.nextInt();

        int sum = add(a, b);
        System.out.println("a + b の結果は " + sum + " です。");

        int difference = subtract(a, b);
        System.out.println("a - b の結果は " + difference + " です。");
    }
}
