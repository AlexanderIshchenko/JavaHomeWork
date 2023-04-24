package HomeWork.DZ_sem1;
/*
 * Task_7
Дан список. Выведите те его элементы, которые встречаются в списке 
только один раз. Элементы нужно выводить в том порядке, 
в котором они встречаются в списке.
Входные данные
Вводится список чисел. Все числа списка находятся на одной строке.
Выходные данные
Выведите ответ на задачу.
Sample Input:
6
1
2
2
3
3
3
Sample Output:
1
 */

import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите список элеметов в строку через пробел: ");
        String list = sc.nextLine();
        String[] arr = list.split(" ");

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) count++;
            }
            if (count == 1) {
                System.out.println(arr[i]);
            }
            
        }
    }
}
