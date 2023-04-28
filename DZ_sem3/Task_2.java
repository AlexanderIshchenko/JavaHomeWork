package DZ_sem3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Задан целочисленный список ArrayList. 
 * Найти минимальное, максимальное и среднее арифметическое 
 * из этого списка. Collections.max()
 */

public class Task_2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(6);
        list.add(6);
        list.add(6);

        System.out.printf("Список: %s %n", list);
        System.out.printf("Минимальное число: %s %n", Collections.min(list));
        System.out.printf("Максимальное число: %s %n", Collections.max(list));
        System.out.printf("Среднее арифметическое число: %.2f %n", averageList(list));
    }

    static float averageList(List<Integer> list){
        int sum = 0;
        for (Integer item : list) {
            sum+=item;
        }
        float res = (float)sum/list.size();
        return res;
    }
}
