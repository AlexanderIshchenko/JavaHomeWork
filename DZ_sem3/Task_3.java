package DZ_sem3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * Заполнить список названиями планет Солнечной системы 
 * в произвольном порядке с повторениями. 
 * Вывести название каждой планеты и количество его повторений в списке
 */
public class Task_3 {
    public static void main(String[] args) {
        List<String> listOfPlanet= new ArrayList<>();
        listOfPlanet.add("Земля");
        listOfPlanet.add("Сатурн");
        listOfPlanet.add("Венера");
        listOfPlanet.add("Юпитер");
        listOfPlanet.add("Земля");
        listOfPlanet.add("Юпитер");
        listOfPlanet.add("Земля");
        listOfPlanet.add("Земля");

        System.out.println(listOfPlanet);
    
        Set<String> unique = new HashSet<String>(listOfPlanet); // в конструктор кладем наш список
        for (String key : unique) {
            System.out.println(key + " -> " + Collections.frequency(listOfPlanet, key) + " повтор.");
        }
    }
}
