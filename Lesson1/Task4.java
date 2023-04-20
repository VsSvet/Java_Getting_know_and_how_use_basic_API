import java.util.ArrayList;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        ArrayList<Integer> result = new ArrayList<>();
        int[] numbers = new int[num];
        for (int i = 0; i < num; i++) {
            numbers[i] = sc.nextInt();
            if (i % 2 == 0) {
                result.add(numbers[i]);
                count += numbers[i];
            }
        }
        System.out.println(count);
        System.out.println(result);
    }
}