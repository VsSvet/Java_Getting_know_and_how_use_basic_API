import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sign = "";
        while (!(sign.equals("+") || sign.equals("-") || sign.equals("*") || sign.equals("/"))) {
            System.out.println("Выберите операцию, сложение '+' , вычитание '-', умножение '*' или деление '/'");
            sign = sc.next();
        }
        System.out.println("Введите первое число: ");
        double number1 = sc.nextDouble();
        System.out.println("Введите второе число: ");
        double number2 = sc.nextDouble();
        if (sign.equals("+")) {
            System.out.println(number1 + number2);
        }
        if (sign.equals("-")) {
            System.out.println(number1 - number2);
        }
        if (sign.equals("*")) {
            System.out.println(number1 * number2);
        }
        if (sign.equals("/")) {
            if (number2 == 0.0) {
                System.err.println("На ноль делить нельзя!");
            }
            System.out.println(number1 / number2);
        }

    }
}