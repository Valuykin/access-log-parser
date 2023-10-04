import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите первое число и нажмите клавишу <Enter>:");
        int firstNumber = Integer.parseInt(new Scanner(System.in).nextLine());
        System.out.println("Введите второе число и нажмите клавишу <Enter>:");
        int secondNumber = Integer.parseInt(new Scanner(System.in).nextLine());
        double quotinent = (double) firstNumber / secondNumber;
        System.out.println("Сумма введенных чисел = " + (firstNumber+secondNumber));
        System.out.println("Разность введенных чисел = " + (firstNumber-secondNumber));
        System.out.println("Произведение введенных чисел = " + (firstNumber*secondNumber));
        System.out.println("Частное введенных чисел = " + quotinent);
    }
}
