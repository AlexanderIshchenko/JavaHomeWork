package HomeWork.DZ_sem1;

/*
 * Реализовать простой калькулятор
Минимум -- > Условия + Цикл
Введите число 
Введите число 
Выберите операцию
1 - сложить 
2 - умножить
 */
import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = sc.nextInt();
        System.out.print("Введите второе число: ");
        int b = sc.nextInt();
        System.out.print("Введите операцию (1 - сложить или 2 - умножить): ");
        int oper = sc.nextInt();

        if (oper != 1 && oper != 2) {
            System.out.println("Не верно выбрана операция!");
            return;
        }
        if (oper == 1) System.out.println(a+b);
        if (oper == 2) System.out.println(a*b);
    }
}
