﻿// Задача 47. Задайте двумерный массив размером m×n, заполненный случайными вещественными числами.


// Console.WriteLine("введите количество строк");
// int linesVol = Convert.ToInt32(Console.ReadLine());
// Console.WriteLine("введите количество столбцов");
// int columnsVol = Convert.ToInt32(Console.ReadLine());
// double[,] numbers = new double[linesVol, columnsVol];
// FillArrayRandomNumbers(numbers);
// PrintArray(numbers);

// void FillArrayRandomNumbers(double[,] array)
// {
//     for (int i = 0; i < array.GetLength(0); i++)
//     {
//         for (int j = 0; j < array.GetLength(1); j++)
//         {
//             array[i, j] = Convert.ToDouble(new Random().Next(-100, 100)) / 10;
//         }
//     }
// }

// void PrintArray(double[,] array)
// {
//     for (int i = 0; i < array.GetLength(0); i++)
//     {
//         Console.Write("[ ");
//         for (int j = 0; j < array.GetLength(1); j++)
//         {
//             Console.Write(array[i, j] + " ");
//         }
//         Console.Write("]");
//         Console.WriteLine("");
//     }
// }



// Задача 50. Напишите программу, которая на вход принимает позиции элемента в двумерном массиве, 
// и возвращает значение этого элемента или же указание, что такого элемента нет.


// int[,] Create2dArray()
// {
//     int rows = new Random().Next(1, 5);
//     int columns = new Random().Next(1, 5);
//     int[,] createdArray = new int[rows, columns];

//     for (int i = 0; i < rows; i++)
//         for (int j = 0; j < columns; j++)
//             createdArray[i, j] = new Random().Next(-9, 10);

//     return createdArray;
// }

// void Show2dArray (int[,] array)
// {
//     for(int i = 0; i < array.GetLength(0); i++)
//     {
//         for(int j = 0; j < array.GetLength(1); j++)
//             Console.Write(array[i, j] + " ");
//         Console.WriteLine();
//     }
// }

// void FindElemFromPosition(int[,] array, int rowFind, int columnFind)
// {
//     if(rowFind < array.GetLength(0) && columnFind < array.GetLength(1))
//         Console.WriteLine($"There is your element with index [{rowFind}, {columnFind}]: {array[rowFind, columnFind]}");
//     else
//         Console.WriteLine($"There is not fond with your index [{rowFind}, {columnFind}] ");
// }

// Console.Write("Введите номер строки: ");
// int row = Convert.ToInt32(Console.ReadLine());
// Console.Write("Введите номер столбца: ");
// int column = Convert.ToInt32(Console.ReadLine());

// if(row >= 0 && column >= 0)
// {
//     int[,] randArray = Create2dArray();
//     Show2dArray(randArray);
//     FindElemFromPosition(randArray, row, column);
// }
// else Console.WriteLine("Индекс не может быть меньше 0. Пожалуйста, введите другой индекс.");



// Задача 52. Задайте двумерный массив из целых чисел. Найдите среднее арифметическое элементов в каждом столбце.

// int[,] Create2dArray()
// {
//     int rows = new Random().Next(1, 5);
//     int columns = new Random().Next(1, 5);
//     int[,] createdArray = new int[rows, columns];

//     for (int i = 0; i < rows; i++)
//         for (int j = 0; j < columns; j++)
//             createdArray[i, j] = new Random().Next(0, 10);

//     return createdArray;
// }

// void Show2dArray (int[,] array)
// {
//     for(int i = 0; i < array.GetLength(0); i++)
//     {
//         for(int j = 0; j < array.GetLength(1); j++)
//             Console.Write(array[i, j] + " ");
//         Console.WriteLine();
//     }
//     Console.WriteLine();
// }

// void ShowArray (double[] array)
// {
//     for(int i = 0; i < array.Length; i++)
//     {
//             Console.Write(array[i] + " ");
//     }
//     Console.WriteLine();
// }

// double [] MediumNumColumns (int [,] array)
// {
//     int rowCount = array.GetLength(0);
//     int colCount = array.GetLength(1);
//     double [] midColArray = new double [colCount];
//     for (int j = 0; j < colCount; j++)
//     {     
//         double midSum = 0;  
//         for(int i = 0; i < rowCount; i++)
//         {
//             midSum += array[i, j];
//         }
//         midColArray[j] = Math.Round(midSum / rowCount, 1);
//     }
//     return midColArray;
// }

// int [,] randArray = Create2dArray();
// Show2dArray(randArray);
// ShowArray(MediumNumColumns(randArray));