import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число");
        int x = sc.nextInt();
        System.out.println("Введите второе число");
        int y = sc.nextInt();
        System.out.println("Сумма равна "+(x + y));
        System.out.println("Разность равна "+(x - y));
        System.out.println("Произведение равно "+(x * y));
        System.out.println("Частное равно "+(x / y));


    }
}
