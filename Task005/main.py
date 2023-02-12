# Задача 26: Напишите программу, 
# которая на вход принимает два числа A и B,
# и возводит число А в целую степень B с помощью
# рекурсии.
# A = 3; B = 5 -> 243 (3⁵)
# A = 2; B = 3 -> 8

def rank(x, y):
    if y == 1:
        return x
    if y != 1:
        return x * rank(x, y - 1)

a = int(input('Enter A '))
b = int(input('Enter B '))

print(rank(a, b))

# Задача 28: Напишите рекурсивную функцию sum(a, b),
# возвращающую сумму двух целых неотрицательных чисел.
# Из всех арифметических операций допускаются только +1 и -1.
# Также нельзя использовать циклы.
# 2 2
# 4

def sum(a, b):
    if b == 0:
        return a
    elif b > 0:
        return sum(a + 1, b - 1)
    else:
        return sum(a - 1, b + 1)

a = int(input('Enter A '))
b = int(input('Enter B '))
print(sum(a, b))