import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int resultat = fib(n);
        System.out.println(resultat);
    }
    public static int fib(int num){
        if (num == 1){
            return 1;
        }
        else if (num == 0) {
            return 0;
        }
        else {
            return fib(num - 2) + fib(num - 1);
        }
    }
}
