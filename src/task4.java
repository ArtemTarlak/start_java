import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size_array = sc.nextInt();
        int first_number = sc.nextInt();
        int max = first_number;
        int min = first_number;
        int average = first_number;
        for (int i = 0; i < size_array - 1; i++){
            int number = sc.nextInt();
            if (max < number){
                max = number;
            }
            if (min > number) {
                min = number;
            }
            average += number;
        }
        System.out.println(" " + max +"," + min + "," + average/size_array);
    }
}
