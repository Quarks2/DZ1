// // Task_3

// import java.util.ArrayDeque;
// import java.util.Arrays;
// import java.util.Deque;

// public class Task_3 {

//     public static void main(String[] args) {
//         Deque<Integer> deque = new ArrayDeque<>(Arrays.asList(1, 2, 3, 4, 5, 6));
//         System.out.println(checkOn(deque));
//         deque = new ArrayDeque<>(Arrays.asList(1, 2, 3, 3, 2, 1));
//         System.out.println(checkOn(deque));
//     }

//     public static boolean checkOn(Deque<Integer> deque) {
//         while (deque.size() > 1) {
           
//             if (!deque.removeFirst().equals(deque.removeLast())) {
//                 return false;
//             }
//         }
//         return true;
//     }
// }


// // Task_4


// import java.util.ArrayDeque;
// import java.util.Arrays;
// import java.util.Deque;

// public class Task_4 {

//     public static void main(String[] args) {
//         Deque<Integer> d1 = new ArrayDeque<>(Arrays.asList(1,2,3));
//         Deque<Integer> d2 = new ArrayDeque<>(Arrays.asList(5,4,7));
//         Deque<Integer> result = sum(d1, d2);
//         System.out.println(result); // [6, 6, 0, 1]
//     }

//     public static Deque<Integer> sum(Deque<Integer> d1, Deque<Integer> d2) {
//         Deque<Integer> result = new ArrayDeque<>();

//         int carry = 0; // запомненная единица
//         while (!d1.isEmpty() || !d2.isEmpty() || carry != 0) {
//             int sum = carry;
//             if (!d1.isEmpty()) sum += d1.removeFirst();
//             if (!d2.isEmpty()) sum += d2.removeFirst();
//             if (sum > 9) {
//                 carry = 1;
//                 sum -= 10;
//             } else {
//                 carry = 0;
//             }
//             result.addLast(sum);
//         }

//         return result;
//     }

// }


// Task_5

// public boolean validate(String input) {
//     Deque<Character> stack = new ArrayDeque<Character>();
//     for (int i = 0; i < input.length(); i++) {
//         char c = input.charAt(i);
//         if (c == '(' || c == '{' || c == '[') {
//             stack.push(c);
//         } else if (c == ')' || c == '}' || c == ']') {
//             if (stack.isEmpty()) {
//                 return false;
//             }
//             char prev = stack.pop();
//             if (prev == '(' && c != ')' || prev == '{' && c != '}' || prev == '[' && c != ']') {
//                 return false;
//             }
//         }
//     }
//     return stack.isEmpty();
// }

