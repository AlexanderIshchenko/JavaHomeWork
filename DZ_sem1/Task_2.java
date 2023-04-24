package HomeWork.DZ_sem1;

/*
 * Вывести все простые числа от 1 до 1000
 */

public class Task_2 {
    public static void main(String[] args) {
        int max = 1000;
        int count = 0;
        for (int i = 2; i <= max; i++) {
            for (int j = 2; j <= i; j++) {
                if (i % j == 0) count++;
            }
            if (count == 1) System.out.println(i);
            count = 0;
        }
    }
    
}
