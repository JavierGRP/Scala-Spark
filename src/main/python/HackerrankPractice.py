# Given an array of integers, find the sum of its elements.
"""
# for index, value in enumerate(array):
#     print("{}: {}".format(index, value))

def simpleArraySum(ar):
    x=0
    for i in ar:
        x += i
    return sum(ar)

print(simpleArraySum([1, 2, 3, 4, 10, 11]))
"""

# Given an array of big integers, find the sum of its elements.
"""
def aVerySum(ar):
    return sum(ar)

print(aVerySum([1000000001, 1000000002, 1000000003, 1000000004, 1000000005]))
"""

# Compare the triplets
"""
def compareTriplets(a, b):

    finalA = 0
    finalB = 0

    for i in range(len(a)):
        if (a[i] > b[i]):
            finalA +=1
        elif (b[i] > a[i]):
            finalB += 1

    return finalA, finalB

print(compareTriplets([5, 6,7], [3, 6, 10]))
print(compareTriplets([17, 28, 30], [99, 16, 8]))
"""

# Ratio of positive, negative and zero
"""
def plusMinus(arr):
    positive = 0
    negative = 0
    zero = 0

    for i in arr:
        if (i > 0):
            positive += 1
        elif (i < 0):
            negative += 1
        else:
            zero += 1

    print(format(positive/len(arr), '.6f'))
    print(format(negative/len(arr), '.6f'))
    print(format(zero/len(arr), '.6f'))

plusMinus([1, 1, 0, -1, -1])
"""

# Staircase
"""
def staircase(n):
    done = False
    while not done:
        x=n-1
        for k in range(n):
            for j in range(n):
                if(j < x):
                    print(" ", end="")
                else:
                    print("#", end = "")
            print("")
            x -= 1
        done = True

staircase(4)
"""

# Min and max by summing 4 of 5 integers
"""
def miniMaxSum(arr):

    minSum = sorted(arr)
    minSum.pop(len(arr)-1)

    maxSum = sorted(arr)
    maxSum.pop(0)

    print(sum(minSum), sum(maxSum))

miniMaxSum([4, 5, 3, 1, 2])
miniMaxSum([5, 5, 5, 5, 5])
"""

# Birthday cake handles
"""
def birthdayCakeCandles(candles):
    x = max(candles)
    print(candles.count(x))

birthdayCakeCandles([3, 2, 1, 3])
birthdayCakeCandles([18, 90, 90, 13, 90, 75, 90, 8, 90, 43])
"""

# Diagonal difference
"""
def diagonalDifference(arr):

    diag1, diag2, iter1, iter2 = 0, 0, 0, len(arr)-1

    for row in range(len(arr)):
        for column in range(len(arr)):
            if (row == column):
                diag1 += arr[row][column]
            if ((row == iter1) and (column == iter2)):
                diag2 += arr[row][column]
                iter1 += 1
                iter2 -= 1
    return abs(diag1 - diag2)


print(diagonalDifference([[1,2,3], [4,5,6], [9,8,9]]))
"""

# Time conversion
"""
def timeConversion(s):
    if(s[8:] == "PM"):
        if(s[0:2] != "12"):
            return str(int(s[0:2]) + 12) + s[2:8]
        else:
            return s[0:8]

    if(s[8:] == "AM"):
        if(s[0:2] == "12"):
            return "00" + s[2:8]
        else:
            return s[0:8]

    return s[0:8]

print(timeConversion("12:05:45AM"))
"""

# Grading students
"""
def gradingStudents(grades):

    finalGrades = []

    for grade in grades:
        if grade >= 38:
            intPart, floatPart = divmod(grade/5, 1)
            next5Mul = grade + round((1 - round(floatPart, 1)) * 5)
            print(grade, next5Mul)

            if (next5Mul - grade) < 3:
                finalGrades.append(next5Mul)
            else:
                finalGrades.append(grade)
        else:
            finalGrades.append(grade)
    return finalGrades

print(gradingStudents([73, 45, 84, 67, 38, 33]))
"""

# Apple and orange trees
"""
def countApplesAndOranges(s, t, a, b, apples, oranges):
    appleCount, orangeCount = 0, 0

    for x in apples:
        applePosition = x + a
        if applePosition >= s and applePosition <= b:
            appleCount += 1
    print(appleCount)

    for x in oranges:
        orangePosition = x + b
        if orangePosition >= s and orangePosition <= t:
            orangeCount += 1
    print(orangeCount, end=" ")


countApplesAndOranges(2, 3, 1, 5, [-2], [-1])
countApplesAndOranges(7, 11, 5, 15, [-2, 2, 1], [5, -6])
"""

# Kangaroo
"""
def kangaroo(x1, v1, x2, v2):

    if v1 == v2 and x1 != x2:
        return "NO"
    else:
        jumps = (x2 - x1) / (v1 - v2)

        if jumps > 0 and jumps.is_integer():
            return "YES"
        else:
            return "NO"

kangaroo(2, 1, 1, 2)
kangaroo(0, 3, 4, 2)
kangaroo(0, 2, 5, 3)
kangaroo(21, 6, 47, 3)
kangaroo(43, 2, 70, 2)
"""

# Breaking records
"""
def breakingRecords(scores):

    min, max = scores[0], scores[0]
    countMin, countMax = 0, 0

    for score in scores:
        if score < min:
            countMin += 1
            min = score
        if score > max:
            countMax += 1
            max = score

    return (countMax, countMin)

print(breakingRecords([10, 5, 20, 20, 4, 5, 2, 25, 1]))
"""

# return 1st integer, sum of next 2, sum of next 3
"""
input = [1, 6, 8, 5, 9, 4, 7, 2, 3, 2, 1, 2]

keep = True
x = 1
output = []
output.append(input[0])
addTwo = True

while keep:
    if addTwo:
        output.append(sum(input[x: x+2]))
        x += 2
        addTwo = False
    else:
        output.append(sum(input[x: x+3]))
        x += 3
        addTwo = True

    if x >= len(input):
        keep = False

print(output)

string1 = "abc"
string2 = "cba"
print(string1 == string2[::-1])
"""

# Birthday chocolate
def birthday(s, d, m):
    count = 0
    for x in range(len(s)):
        num = sum(s[x: x+m])
        if num == d:
            count += 1
    return count

print(birthday([2, 2, 1, 3, 2], 4, 2))
print(birthday([1, 2, 1, 3, 2], 3, 2))
print(birthday([4], 4, 1))