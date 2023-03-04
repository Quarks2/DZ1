# Задача 26:  Напишите программу, которая на вход принимает два числа A и B,
# и возводит число А в целую степень B с помощью рекурсии.

# def power(x, n):
#     if n == 0:
#         return 1
#     if n < 0:
#         return 1/power(x, -n)
#     if n % 2 == 0:
#         return power(x, n // 2) * power(x, n // 2)
#     else:
#         return power(x, n - 1) * x
#
# x = int(input())
# n = int(input())
#
# print(power(x, n))

# Задача 28: Напишите рекурсивную функцию sum(a, b), возвращающую сумму двух целых неотрицательных чисел.
# Из всех арифметических операций допускаются только +1 и -1. Также нельзя использовать циклы.

# def sum(a, b):
#     if b == 0:
#         return a
#     if a == 0:
#         return b
#     else:
#         return sum(a, b - 1) + 1
# 
# a = int(input())
# b = int(input())
# 
# print(sum(a, b))