// Посчитайте сколько драгоценных камней в куче обычных камней


// public static void main(String[] args) {
//     String jewels = "aB";
//     String stones = "aaaAbbbB";
//     String result = findJewelsInStones(jewels, stones);
//     System.out.println(result);
// }

// public static String findJewelsInStones(String jewels, String stones) {
//     int[] count = new int[128]; // храним количество символов в ASCII таблице
//     for (int i = 0; i < stones.length(); i++) {
//         count[stones.charAt(i)]++;
//     }
//     StringBuilder sb = new StringBuilder();
//     for (int i = 0; i < jewels.length(); i++) {
//         sb.append(jewels.charAt(i)).append(count[jewels.charAt(i)]);
//     }
//     return sb.toString();
// }


// Вам дается строка S и целочисленный массив индексов int index[s.length].
// Напишите программу, которая перетасует символы в S таким образом,
// что символ c i-й позиции переместится на индекс index[i] в результирующей строке.

// public static String shuffle(final String s, final int[] index) {
//     char[] shuffled = new char[s.length()];
//     for (int i = 0; i < s.length(); i++) {
//         shuffled[index[i]] = s.charAt(i);
//     }
//     return new String(shuffled);
// }

// public static void main(String[] args) {
//     String s = "cba";
//     int[] index = {3, 2, 1};
//     String result = shuffle(s, index);
//     System.out.println(result);
// }




// Task_2


// import java.util.*;

// public class Main {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         sc.nextLine();
//         String[] recipes = new String[n];

//         for (int i = 0; i < n; i++) {
//             recipes[i] = sc.nextLine();
//         }

//         int m = sc.nextInt();
//         sc.nextLine();
//         Map<String, String> map = new HashMap<>(); // создаем Map для хранения пар продукт1 - продукт2

//         for (int i = 0; i < m; i++) {
//             String[] allergies = sc.nextLine().split(" - ");
//             map.put(allergies[0], allergies[1]); // добавляем пару в Map
//         }

//         for (int i = 0; i < n; i++) {
//             for (Map.Entry<String, String> entry : map.entrySet()) {
//                 recipes[i] = recipes[i].replaceAll(entry.getKey(), entry.getValue()); // замена
//                 recipes[i] = recipes[i].replaceAll(entry.getKey().substring(0, 1).toUpperCase()
//                                 + entry.getKey().substring(1), entry.getValue().substring(0, 1).toUpperCase()
//                         + entry.getValue().substring(1)); // замена с учетом регистра
//             }
//             System.out.println(recipes[i]); // выводим отредактированный рецепт
//         }
//     }
// }