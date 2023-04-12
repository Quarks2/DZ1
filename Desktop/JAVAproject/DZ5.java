// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.



// import java.util.*;

// public class PhoneBook {
//     private Map<String, List<String>> phoneBook;

//     public PhoneBook() {
//         this.phoneBook = new HashMap<>();
//     }

//     public void addContact(String name, String phone) {
//         List<String> phones = phoneBook.getOrDefault(name, new ArrayList<>());
//         phones.add(phone);
//         phoneBook.put(name, phones);
//     }

//     public List<String> getPhonesByName(String name) {
//         return phoneBook.get(name);
//     }

//     public void removeContact(String name) {
//         phoneBook.remove(name);
//     }

//     public void removePhoneForContact(String name, String phone) {
//         List<String> phones = phoneBook.get(name);
//         if (phones != null) {
//             phones.remove(phone);
//         }
//     }
// }


// Пусть дан список сотрудников:

// Иван Иванов

// Светлана Петрова

// Кристина Белова

// Анна Мусина

// Анна Крутова

// Иван Юрин

// Петр Лыков

// Павел Чернов

// Петр Чернышов

// Мария Федорова

// Марина Светлова

// Мария Савина

// Мария Рыкова

// Марина Лугова

// Анна Владимирова

// Иван Мечников

// Петр Петин

// Иван Ежов

// Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.



// import java.util.*;

// public class RepeatingNames {
//    public static void main(String[] args) {
//       List<String> employees = Arrays.asList("Иван Иванов", "Светлана Петрова", "Кристина Белова",
//                                              "Анна Мусина", "Анна Крутова", "Иван Юрин", "Петр Лыков",
//                                              "Павел Чернов", "Петр Чернышов", "Мария Федорова",
//                                              "Марина Светлова", "Мария Савина", "Мария Рыкова",
//                                              "Марина Лугова", "Анна Владимирова", "Иван Мечников",
//                                              "Петр Петин", "Иван Ежов");

//       Map<String, Integer> nameCount = new HashMap<>();
//       for (String name : employees) {
//          nameCount.put(name, nameCount.getOrDefault(name, 0) + 1);
//       }

//       List<Map.Entry<String, Integer>> sortedNames = new ArrayList<>(nameCount.entrySet());
//       Collections.sort(sortedNames, (a, b) -> b.getValue().compareTo(a.getValue()));

//       for (Map.Entry<String, Integer> entry : sortedNames) {
//          if (entry.getValue() > 1) {
//             System.out.println(entry.getKey() + " - " + entry.getValue());
//          }
//       }
//    }
// }


// Реализовать алгоритм пирамидальной сортировки (HeapSort)

// public class HeapSort {
//   public void sort(int arr[]) {
//     int n = arr.length;

//     // построение кучи (преобразование массива в кучу)
//     for (int i = n / 2 - 1; i >= 0; i--)
//       heapify(arr, n, i);

//     // извлечение элементов из кучи в упорядоченном порядке
//     for (int i = n - 1; i >= 0; i--) {
//       // перемещаем текущий корень в конец
//       int temp = arr[0];
//       arr[0] = arr[i];
//       arr[i] = temp;

//       // вызываем процедуру heapify на уменьшенной куче
//       heapify(arr, i, 0);
//     }
//   }

//   // процедура перестройки кучи
//   void heapify(int arr[], int n, int i) {
//     int largest = i; // инициализируем наибольший элемент как корень
//     int l = 2 * i + 1; // левый дочерний элемент
//     int r = 2 * i + 2; // правый дочерний элемент

//     // если левый дочерний элемент больше корня
//     if (l < n && arr[l] > arr[largest])
//       largest = l;

//     // если правый дочерний элемент больше, чем самый большой элемент на данный момент
//     if (r < n && arr[r] > arr[largest])
//       largest = r;

//     // если самый большой элемент не корень
//     if (largest != i) {
//       int swap = arr[i];
//       arr[i] = arr[largest];
//       arr[largest] = swap;

//       // вызываем процедуру heapify рекурсивно для поддерева
//       heapify(arr, n, largest);
//     }
//   }
// }
