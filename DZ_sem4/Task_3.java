package DZ_sem4;

import java.util.LinkedList;
import java.util.ListIterator;

/*
 * Найдите сумму всех элементов LinkedList, 
 * сохраняя все элементы в списке. 
 * Используйте итератор
 */

public class Task_3 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            enqueue(list, i); 
        }
        System.out.println(list);
        System.out.println(sumElem(list));
    }
    static int sumElem (LinkedList<Integer> list){
        int sum = 0;
        ListIterator<Integer> iterator = list.listIterator();
        while (iterator.hasNext()) {
            sum+=iterator.next();
        }
        return sum;
    }
    static int enqueue(LinkedList<Integer> list, int num) {
        list.add(num);
        return num;
    }
}
