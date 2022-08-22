# 1.find the longest non repeated substring length
# str="abca" => 3
# str=’trtr’ => 2

# str = "abca"
# finalStr = ""
#
# for letter in str:
#     if letter not in finalStr:
#         finalStr += letter
#
# print(finalStr)
# print(len(finalStr))

# 2.find the pair whose sum is equal to given number
# list=[2,3,4,5,6]
# sum=10

# list=[2,3,4,5,6]
# sum=10
# list=[1, 1, 2, 3, 4, 5]
# sum=5

# for x in range(len(list)-1):
#     for y in range(x+1, len(list)):
#         if list[x] + list[y] == sum:
#             print(list[x])
#             print(list[y])


# 3.find anagram in list of words.
# [abc,cba,cat,tac,dag]

# list = ['wsa','abc','cba','cat','tac','dag']
#
# for x in range(len(list)-1):
#     for y in range(x+1, len(list)):
#         if list[x] == list[y][::-1]:
#             print(list[x] + ',' + list[y])


# 4.Find unique and duplicate values from a list
# list=[2,3,3,4,6,7,8,9]
# unique elements=[2,4,6,7,8,9]
# duplicate element list[3]

# list=[2,3,3,4,6,7,8,9]
# duplicates = []
# unique = []
#
# for num in list:
#     if list.count(num) > 1 and num not in duplicates:
#         duplicates.append(num)
#     else:
#         unique.append(num)
#
# print(duplicates)
# print(unique)

# 1. Find factorial in python for given number (use function, number as argument)

# def factorial(num):
#     n=1
#     if num > 0:
#         for i in range(1, num+1):
#             n *= i
#         return n
#     else:
#         return 0
#
# print(factorial(7))

# 2. write python function for reverse a string (as argument)

# def reverse(str):
#     return str[::-1]
#
# print(reverse('Javier'))

# 3. write a function to validate ip address
# import re
# def validateIP(ip):
#     match = re.match(r"^(\d{1,3})\.(\d{1,3})\.(\d{1,3})\.(\d{1,3})$", ip)
#
#     if bool(match) is False:
#         print("IP address {} is not valid".format(ip))
#         return False
#
#     for part in ip.split("."):
#         if int(part) < 0 or int(part) > 255:
#             print("IP address {} is not valid".format(ip))
#             return False
#
#     print("IP address {} is valid".format(ip))
#     return True
#
# validateIP('192.168.1.20')
# validateIP('10.260.10.3000')

# 4. write a function of fibonacci series in python for given number
# def fibonacci(num):
#     i = 0
#     v1 = 0
#     v2 = 1
#
#     if (num == 0):
#         print(0)
#     if (num >= 2):
#         print(1)
#     while(i < num-1):
#         result = v1 + v2
#         v1 = v2
#         v2 = result
#         print(result)
#         i += 1
#
# fibonacci(4)

