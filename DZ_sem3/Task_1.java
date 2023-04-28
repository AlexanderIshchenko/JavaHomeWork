package DZ_sem3;

import java.util.ArrayList;
import java.util.List;

/*
 * Пусть дан произвольный список целых чисел, 
 * удалить из него четные числа
 */

public class Task_1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(6);
        list.add(6);
        list.add(6);
        

        delOdd(list);
        System.out.println(list);      
    }
    static void delOdd(List<Integer> list){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)%2 == 0) {
                list.remove(i);
                i--;
            }
        }
    }
}
