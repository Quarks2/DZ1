// Реализовать алгоритм сортировки слиянием и выборкой.
// (Самое эффективное , это изучить эти сортировки на Питоне , 
// и постараться написать их на java)

// Сортировка слиянием:

public class MergeSort {
    
    private int[] array;
    private int[] tempMergArr;
    private int length;

    public void sort(int inputArr[]) {
        this.array = inputArr;
        this.length = inputArr.length;
        this.tempMergArr = new int[length];
        doMergeSort(0, length - 1);
    }

    private void doMergeSort(int lowerIndex, int higherIndex) {
        
        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            doMergeSort(lowerIndex, middle);
            doMergeSort(middle + 1, higherIndex);
            mergeParts(lowerIndex, middle, higherIndex);
        }
    }

    private void mergeParts(int lowerIndex, int middle, int higherIndex) {

        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempMergArr[i] = array[i];
        }
        
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        
        while (i <= middle && j <= higherIndex) {
            if (tempMergArr[i] <= tempMergArr[j]) {
                array[k] = tempMergArr[i];
                i++;
            } else {
                array[k] = tempMergArr[j];
                j++;
            }
            k++;
        }
        
        while (i <= middle) {
            array[k] = tempMergArr[i];
            k++;
            i++;
        }
    }
}


Сортировка выборкой:

public class SelectionSort {
    
    public void sort(int[] arr) {
        
        int n = arr.length;
        
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
}


2. Пусть дан произвольный список целых чисел, удалить из него чётные числа

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<Integer>(); // Создаем список целых чисел

    // Заполняем список
    numbers.add(1);
    numbers.add(2);
    numbers.add(3);
    numbers.add(4);
    numbers.add(5);
    numbers.add(6);
    numbers.add(7);
    numbers.add(8);

    // Удаляем четные числа
    for (int i = 0; i < numbers.size(); i++) {
      if (numbers.get(i) % 2 == 0) {
        numbers.remove(i);
        i--; // Уменьшаем счетчик, чтобы не пропустить следующий элемент
      }
    }

    // Выводим результат
    System.out.println(numbers);
  }
}



Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.


import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        // Создаем список чисел
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(7);
        numbers.add(2);
        numbers.add(10);
        numbers.add(5);
        numbers.add(3);

        // Ищем минимальное значение
        int min = Collections.min(numbers);

        // Ищем максимальное значение
        int max = Collections.max(numbers);

        // Ищем среднее значение
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        double average = (double) sum / numbers.size();

        // Выводим результаты
        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
        System.out.println("Среднее значение: " + average);
    }
}
