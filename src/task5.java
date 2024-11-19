import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f = sc.nextInt();
        int result = factorial(f);
        System.out.println(result);
    }

    public static int factorial(int num) {
        if (num == 1 || num == 0) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }
}
