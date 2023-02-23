# Задача 30:  Заполните массив элементами арифметической прогрессии. Её
# первый элемент, разность и количество элементов нужно ввести с клавиатуры.
# Формула для получения n-го члена прогрессии: an = a1 + (n-1) * d.
# Каждое число вводится с новой строки.

a = int(input())
d = int(input())
n = int(input())
for i in range(n):
    print(a + i * d)

# Задача 32: Определить индексы элементов массива (списка), значения которых
# принадлежат заданному диапазону (т.е. не меньше заданного минимума и не
# больше заданного максимума)

list_1 = [int(input('enter num ')) for i in range(n)]
min_number = int(input())
max_number = int(input())
for i in range(len(list_1)):
    if min_number <= list_1[i] <= max_number:
        print(i)

Vinny = input('Enter Vinny Song ')
VinnySong = Vinny.lower().split()
RitmOrNot = lambda x: sum(1 for i in x if i in 'аеёиоуыэюя')
if all([RitmOrNot(i) == VinnySong[0] for i in VinnySong]):
    print('Парам пам-пам')
else:
    print('Пам парам')