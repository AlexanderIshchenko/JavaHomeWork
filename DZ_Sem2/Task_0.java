package DZ_Sem2;

/**
 * Task_0
// Посчитайте сколько драгоценных камней в куче обычных камней
// Пример:
// jewels = “aB”, stones = “aaaAbbbB”
// Результат в консоль ”a3B1”
public static void main(String[] args) {
}
public String findJewelsInStones(String jewels, String stones) {
return "";
}
}
 */
public class Task_0 {

    public static void main(String[] args) {
        String jewels = "aB";
        String stones = "aaaAbbbB";

        System.out.print(findJewelsInStones(jewels, stones));      
    }
    public static String findJewelsInStones(String jewels,String stones){
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < jewels.length(); i++){
            int count = 0;
            for(int j = 0; j < stones.length(); j++){
                if(jewels.charAt(i) == stones.charAt(j)){
                    count++;
                }
            }
            res.append(jewels.charAt(i)).append(count);
        }
        return res.toString();
    }
}