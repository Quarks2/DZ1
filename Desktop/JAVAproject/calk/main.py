import logging

from calculator import ComplexCalculator
from operations import AdditionOperation, MultiplicationOperation, DivisionOperation

logging.basicConfig(filename='complex_calculator.log', level=logging.DEBUG)

def get_complex_input(prompt):
    real = int(input(prompt + " Введите действительную часть: "))
    imag = int(input(prompt + " Введите мнимую часть: "))
    return complex(real, imag)

operations = {'+': AdditionOperation, '*': MultiplicationOperation, '/': DivisionOperation}

a = get_complex_input("Первое комплексное число")
b = get_complex_input("Второе комплексное число")

operation = input("Введите операцию (+, *, /): ")
calculator = ComplexCalculator(operations[operation]())

result = calculator.execute(a, b)
logging.info(f'{a} {operation} {b} = {result}')
print(f'{a} {operation} {b} = {result}')



# Документация по запуску приложения
# Требования:
# Установленный Python 3
# Шаги по запуску:
# Создайте файл calculator.py и вставьте соответствующий код
# Создайте файл operations.py и вставьте соответствующий код
# Создайте файл main.py и вставьте соответствующий код
# Выполните команду python main.py в командной строке или терминале
# Введите значения комплексных чисел и операцию при запросе
# Результат выполнения будет выводиться на экран
# Логи операций будут записаны в файл complex_calculator.log