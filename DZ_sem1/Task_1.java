package HomeWork.DZ_sem1;

/*
 * 1. Вычислить n-ое треугольного число (сумма чисел от 1 до n), 
 * n! (произведение чисел от 1 до n)
 * Перейти по ссылке, реализовать формулу на Java.
 */

import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int i = sc.nextInt();
        int tri = (i * (i + 1)) / 2;
        System.out.printf("Треугольное число: %s\n", tri);
        System.out.printf("Факториал числа: %s\n", factorial(i));
    }
    static int factorial (int n) {
        if (n==1 || n==0) return 1;
        return n * factorial(n-1);
    }
}
