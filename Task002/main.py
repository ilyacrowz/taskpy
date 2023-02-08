# Задача 10: На столе лежат n монеток. Некоторые из них лежат вверх решкой,
# а некоторые – гербом. Определите минимальное число монеток, 
# которые нужно перевернуть, чтобы все монетки были повернуты вверх одной и той же стороной.
#  Выведите минимальное количество монет, которые нужно перевернуть.
# 5 -> 1 0 1 1 0
# 2

CountCoins = int(input('Enter coins count: '))
CountFront = 0
CountBack = 0
for coin in range(CountCoins):
    CoinSide = int(input('Enter Side of the coin 1 or 0: '))
    if CoinSide != 1 and 0:
        print('Not corret')
    if CoinSide == 1:
        CountFront += 1
    else:
        CountBack += 1
if CountFront <= CountBack:
    print(CountFront)
else:
    print(CountBack)


# Задача 12: Петя и Катя – брат и сестра. Петя – студент, а Катя – школьница.
# Петя помогает Кате по математике. Он задумывает два натуральных числа X и Y (X,Y≤1000),
# а Катя должна их отгадать. Для этого Петя делает две подсказки.
# Он называет сумму этих чисел S и их произведение P. Помогите Кате отгадать задуманные Петей числа.
# 4 4 -> 2 2
# 5 6 -> 2 3

sum = int(input('Enter sum x, y: '))
prod = int(input('Enter product x, y: '))
count = 0
for i in range(sum + prod):
    if count:
        break
    for j in range(sum + prod):
        if i + j == sum and i * j == prod:
            count = 1
            print(*sorted([i, j]))
            break


# Задача 14: Требуется вывести все целые степени двойки (т.е. числа вида 2k),
# не превосходящие числа N.
# 10 -> 1 2 4 8

n = int(input('Enter num'))
m = 1
print(1)
while m < n:
    print(m)
    m *= 2