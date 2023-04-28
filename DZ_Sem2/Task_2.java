package DZ_Sem2;
import java.util.ArrayList;
/*
 * Task_2
На первой строке записывается натуральное число n - количество строчек 
в книге. Затем вводится n строк - строки книги. 
потом вводится натуральное число m - количество продуктов, 
на которые у человека аллергия. 
Потом вводится m строк - вида "продукт1 - продукт2", 
где продукт1 - продукт, 
на который у человека аллергия и продукт2 - продукт, 
на который следует заменить продукт1. 
Гарантируется что любой продукт состоит из 1 слова. 
название продуктов написаны строчными буквами. 
Гарантируется, что продукты, на которые нужно выполнить замену, 
не встречаются изначально в тексте.
Выходные данные
Замените все продукты в поваренной книге Васи и выведите 
их построчно на экран. На окончания не обращайте внимание. 
ВАЖНО!!! Если продукт, который следует заменить написан с большой буквы, 
то и замена тоже должна начинаться с большой буквы!
Sample Input:
2
Рецепт 1. Арахис 100гр, мороженое 200гр. Возьмите арахис и измелчите его. 
Посыпьте измельчённый арахис на мороженое.
Рецепт 2. Клубника 100гр, сгущенка 3кг. Смешать, есть) Радоваться жизни.
3
арахис - колбаса
клубника - вишня
сгущенка - молоко
Sample Output:
Рецепт 1. Колбаса 100гр, мороженое 200гр. Возьмите колбаса и измелчите его. Посыпьте измельчённый колбаса на мороженое.
Рецепт 2. Вишня 100гр, молоко 3кг. Смешать, есть) Радоваться жизни.
 * 
 */
import java.util.*;
public class Task_2 {
    public static void main(String[] args) {
        int n = 2; // Количество строк в книге
        int m = 3; // Количество продуктов на которые аллергия
        Scanner sc = new Scanner(System.in);
        List<String> recipesList = new ArrayList<>();
        for (int i = 0; i < n; i ++) {
            System.out.print("Введите строку --> ");
            recipesList.add(sc.nextLine());
        }
        List<String> changeList_1 = new ArrayList<>();
        List<String> changeList_2 = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            System.out.println("Введите продукты для замены через тире (арахис - колбаса) --> ");
            String[] temp = sc.nextLine().split(" - ");
            changeList_1.add(temp[0]);
            changeList_2.add(temp[1]);
        }
        sc.close();

        for (int i = 0; i < m; i ++) {
            changeList_1.add(changeList_1.get(i).substring(0, 1).toUpperCase()+changeList_1.get(i).substring(1));
            changeList_2.add(changeList_2.get(i).substring(0, 1).toUpperCase()+changeList_2.get(i).substring(1));
        }
        List<String> recipesListNew = new ArrayList<>();
        for (int i = 0; i < recipesList.size(); i ++) {
            String recipe = recipesList.get(i);
            for (int j = 0; j < changeList_1.size(); j ++)
                recipe = recipe.replaceAll(changeList_1.get(j), changeList_2.get(j));
            recipesListNew.add(recipe);
        }
        for (String recipe : recipesListNew)
            System.out.println(recipe);
    }
    
}
