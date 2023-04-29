package DZ_sem4;

import java.util.LinkedList;

/*
 * Реализуйте очередь с помощью LinkedList со следующими методами:
 * enqueue() - помещает элемент в конец очереди, 
 * dequeue() - возвращает первый элемент из очереди и удаляет его, 
 * first() - возвращает первый элемент из очереди, не удаляя.
 */

public class Task_2 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            enqueue(list, i); 
        }
        System.out.println(list);

        System.out.println(enqueue(list,22));
        System.out.println(list); 

        System.out.println(dequeue(list));
        System.out.println(list);

        System.out.println(first(list));
        System.out.println(list); 
    }

    static int enqueue(LinkedList<Integer> list, int num) {
        list.addLast(num);
        return num;
    }

    static int dequeue(LinkedList<Integer> list) {
        int num = list.get(0);
        list.remove(0);
        return num;
    }

    static int first(LinkedList<Integer> list) { // возвращает первый элемент из очереди, не удаляя
        int num = list.get(0);
        return num;
    }
}
