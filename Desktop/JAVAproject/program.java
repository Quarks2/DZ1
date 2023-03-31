// Создайте массив, в котором будут храниться кубы чисел от 1 до 1000. 
// Затем вводятся 2 числа из этого диапазона. 
// Используя данные из массива найдите их кубы


// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         // создаем массив и заполняем его кубами чисел от 1 до 1000
//         int[] cubes = new int[1000];
//         for (int i = 1; i <= 1000; i++) {
//             cubes[i-1] = i * i * i;
//         }

//         // вводим 2 числа из заданного диапазона
//         Scanner scanner = new Scanner(System.in);
//         int a = scanner.nextInt();
//         int b = scanner.nextInt();

//         // находим кубы этих чисел, используя массив
//         int cubeA = cubes[a-1];
//         int cubeB = cubes[b-1];

//         // выводим результаты
//         System.out.println(cubeA);
//         System.out.println(cubeB);
//     }
// }


// Вводится число n, затем n чисел целых, по одному на каждой строке. 
// Затем вводится число, на которое нужно умножить все введённые выше числа. 
// Выведите на экран результат умножения построчно

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int n = scanner.nextInt();
//         int[] numbers = new int[n];
//         for (int i = 0; i < n; i++) {
//             numbers[i] = scanner.nextInt();
//         }
//         int factor = scanner.nextInt();
//         for (int i = 0; i < n; i++) {
//             System.out.println(numbers[i] * factor);
//         }
//     }
// }




// Реализовать простой калькулятор (+,-,=,*), только с целыми числами.

// import java.util.Scanner;

// public class SimpleCalculator {

//     public static void main(String[] args) {

//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter first number: ");
//         int num1 = scanner.nextInt();

//         System.out.print("Enter second number: ");
//         int num2 = scanner.nextInt();

//         System.out.print("Enter the operation (+, -, *, /): ");
//         char operator = scanner.next().charAt(0);

//         int result = 0;
//         switch (operator) {
//             case '+':
//                 result = num1 + num2;
//                 break;
//             case '-':
//                 result = num1 - num2;
//                 break;
//             case '*':
//                 result = num1 * num2;
//                 break;
//             case '/':
//                 result = num1 / num2;
//                 break;
//             default:
//                 System.out.println("Invalid operator!");
//         }

//         System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
//     }
// }



// Задано уравнение вида q + w = e, q, w, e >= 0. 
// Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69. 
// Требуется восстановить выражение до верного равенства. 
// Предложить хотя бы одно решение или сообщить, что его нет


// public class EquationSolver {
//     public static void main(String[] args) {
//         String equation = "2? + ?5 = 69";
//         int q, w, e;
//         for(q = 0; q <= 9; q++) {
//             for(w = 0; w <= 9; w++) {
//                 String eq = equation.replace("?",""+q).replace("?",""+w);
//                 String[] parts = eq.split(" ");
//                 if(parts.length == 3 && parts[1].equals("+")) {
//                     int x = Integer.parseInt(parts[0]);
//                     int y = Integer.parseInt(parts[2]);
//                     if(x >= 0 && y >= 0 && x + y == 69) {
//                         System.out.println(eq);
//                         return;
//                     }
//                 }
//             }
//         }
//         System.out.println("No solution found.");
//     }
// }
