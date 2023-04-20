import java.util.*;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.println("Введите список чисел через пробел: ");
        String number = sc.nextLine();
        List<String> numbers = List.of(number.split(" "));
        Set<String> set = new HashSet<>(List.of(number.split(" ")));
        for (String name : set) {
            for (String s : numbers) {
                if (name.equals(s)) {
                    count += 1;
                }
            }
            if (count == 1){
                System.out.println(name);
            }
            count = 0;
        }
    }
}