import java.util.Scanner;

public class task3 {
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = sc.nextLine();
        String stroka = "";
        for (int i = str.length()-1; i >= 0; i--){
            stroka += str.charAt(i);
        }
        System.out.println(stroka);
    }
}
