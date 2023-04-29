package DZ_sem4;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/*
 * Пусть дан LinkedList с несколькими элементами. 
 * Реализуйте метод, который вернет “перевернутый” список. 
 * Постараться не обращаться к листу по индексам.
 */

public class Task_1 {
    public static void main(String[] args) {
        List<Object> list = new LinkedList<>();
        list.add(1);
        list.add(" ");
        list.add("Привет");
        list.add(19);
        list.add("14");

        System.out.println(list);
        System.out.println(reverseList(list));
    }
    static Object reverseList (List<Object> list){
        ListIterator<Object> iterator = list.listIterator(list.size());
        List<Object> revlist = new LinkedList<>();
        while (iterator.hasPrevious()){
            revlist.add(iterator.previous());
        };        
        return revlist;
        
    }
    
}
