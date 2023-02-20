m = int(input('enter len list '))
list_1 = list()
for i in range(m):
    list_1.append(int(input('enter num ')))
i = 0
count = 0
while i < len(list_1) - 1:
    if  list_1[i] == list_1[i+1]:
        list_1.pop(list_1[i]) and list_1.pop(list_1[i+1])
        count += 1
print(count)

# def countfun(list):
#     count = 0
#     for i in range(len(list)):
#         if list[i] == list[i+1] and list[i+1] != list[i+2]:
#             count+=1
#     return count

# print(countfun(list_1))
