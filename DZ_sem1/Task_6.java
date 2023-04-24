package HomeWork.DZ_sem1;
/**
Task_6
Вводится массив (сначала количество элементов, потом сами элементы). 
Найдите сумму его элементов с чётными индексами и выведите её. 
А потом выведите числа, которые суммировались.
Sample Input:
4
1
2
3
4
Sample Output:
4
1
3
 */



import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество элементов массива: ");
        String temp = sc.nextLine();
        int count = Integer.parseInt(temp);

        int[] mas = new int[count];
        for (int i = 0; i < mas.length; i++) {
            System.out.print("Введите элемент массива: ");
            temp = sc.nextLine();
            int elem = Integer.parseInt(temp);
            mas[i] = elem;
        }
        int res = 0;
        for (int i = 0; i < mas.length; i+=2) {
            res += mas[i];
            System.out.println(mas[i]);
        }
        System.out.println(res);
        
    }
}