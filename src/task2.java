import java.util.Scanner;

public class task2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int a = sc.nextInt();
        if ( a % 2 == 0) {
            System.out.println("Число четное");
        }
        else {
            System.out.println("Число нечетное");
        }
    }

}
