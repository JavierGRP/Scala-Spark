import scala.Array.ofDim
import scala.collection.mutable.ListBuffer

object HackerrankPractice extends App {

  //  Given an array of integers, find the sum of its elements.
  /*
  def simpleArraySum(ar: Array[Int]): Int = {
    var x = 0
    for (i <- ar){
      x += i
    }
    x
  }

  println(simpleArraySum(Array(1, 2, 3, 4, 10, 11)))
*/


  //  Given an array of big integers, find the sum of its elements.
  /*
  def aVeryBigSum(ar: Array[Long]): Long = {
    var x: Long = 0
    for (i <- ar){
      x += i
    }
    x
  }

  println(aVeryBigSum(Array(1000000001, 1000000002, 1000000003, 1000000004, 1000000005)))
*/

  //  Compare the triplets
  /*
  def compareTriplets(a: Array[Int], b: Array[Int]): Array[Int] ={

    var resultA = 0
    var resultB = 0

    for (i <- 0 to a.length-1){
      if (a(i) > b(i)) resultA += 1
      else if (b(i) > a(i)) resultB += 1
    }

    Array(resultA, resultB)
  }

  println(compareTriplets(Array(5, 6,7), Array(3, 6, 10)).mkString(" "))
  println(compareTriplets(Array(17, 28, 30), Array(99, 16, 8)).mkString(" "))
 */

  // Ratio of positive, negative and zero
  /*
def plusMinus(arr: Array[Int]): Unit ={

  var positive = 0.0
  var negative = 0.0
  var zero = 0.0

  for (i <- arr){
    if(i > 0) positive += 1
    else if(i < 0) negative += 1
    else zero += 1
  }

  println(f"${positive/arr.length}%.6f")
  println(f"${negative/arr.length}%.6f")
  println(f"${zero/arr.length}%.6f")
}

  plusMinus(Array(1, 1, 0, -1, -1))
*/

  // Staircase
  /*
  def stairCase(n: Int): Unit ={

    var done = false
    while(!done){
      var x = n
      for(k <- 0 to n-1){
        for(j <- 1 to n){
          if(j < x) print(" ")
          else print("#")
        }
        x -= 1
        println("")
      }
      done=true
    }
  }

  stairCase(6)
*/

  // Min and max by summing 4 of 5 integers
  /*
  def miniMaxSum(arr: Array[Int]): Unit = {

    var sumMin: BigInt = 0
    var sumMax: BigInt = 0

    val maxArray = arr.sorted.drop(1)
    val minArray = arr.sorted.dropRight(1)

    for(i <- 0 to minArray.length-1){
      sumMin += minArray(i)
      sumMax += maxArray(i)
    }

    println(s"$sumMin $sumMax")
  }
  miniMaxSum(Array(4, 5, 3, 1, 2))
  miniMaxSum(Array(5, 5, 5, 5, 5))
*/

  // Birthday cake handles
  /*
def birthdayCakeCandles(candles: Array[Int]): Unit ={
  println(candles.count(x => x == candles.max))

}

birthdayCakeCandles(Array(3, 2, 1, 3))
*/

  // Diagonal difference
  /*
  def diagonalDifference(arr: Array[Array[Int]]): Int ={
    var diag1, diag2, iter1 = 0
    var iter2 = arr.length-1
    for(i <- 0 to arr.length-1; j <- 0 to arr.length-1){
      if(i == j) diag1 += arr(i)(j)
      if((i == iter1) && (j == iter2)){
        diag2 += arr(i)(j)
        iter1 += 1
        iter2 -= 1
      }
    }
    (diag1 - diag2).abs
  }

  var arr = Array.ofDim[Int](3, 3)
  arr(0)(0) = 1
  arr(0)(1) = 2
  arr(0)(2) = 3
  arr(1)(0) = 4
  arr(1)(1) = 5
  arr(1)(2) = 6
  arr(2)(0) = 9
  arr(2)(1) = 8
  arr(2)(2) = 9
  println(diagonalDifference(arr))
 */

  // Time conversion
  /*
def timeConversion(s: String): String ={
  if(s.substring(8) == "PM"){
    if(s.substring(0,2) != "12") return (s.substring(0,2).toInt + 12).toString + s.substring(2, 8)
    else return s.substring(0, 8)
  }

  if(s.substring(8) == "AM"){
    if(s.substring(0,2) == "12") return "00" + s.substring(2, 8)
    else return s.substring(0, 8)
  }
  s.substring(0, 8)
}
println(timeConversion("11:05:45PM"))
*/

  // Grading students
  /*
  def gradingStudents(grades: Array[Int]): Array[Int] = {

    var finalGrades: Array[Int] = Array()

    for (grade <- grades) {
      if (grade >= 38) {
        val doubleNum = grade / 5.0
        val decimalNum = math.BigDecimal(doubleNum - doubleNum.toInt).setScale(1, math.BigDecimal.RoundingMode.HALF_UP)
        val next5Mul = (grade + ((1 - decimalNum) * 5)).toInt

        if ((next5Mul - grade) < 3) finalGrades = finalGrades :+ next5Mul
        else finalGrades = finalGrades :+ grade
      }
      else finalGrades = finalGrades :+ grade
    }
    finalGrades
  }

  gradingStudents(Array(73, 45, 84, 67, 38, 33)).foreach(println)
  */

  // Apple and orange trees
  /*
  def countApplesAndOranges(s: Int, t: Int, a: Int, b: Int, apples: Array[Int], oranges: Array[Int]): Unit = {
    var applesCount, orangesCount = 0

    for(x <- apples){
      val applePosition = x + a
      if(applePosition >= s && applePosition <= t){
        applesCount += 1
      }
    }
    println(applesCount)

    for(x <- oranges){
      val orangePosition = x + b
      if(orangePosition >= s && orangePosition <= t){
        orangesCount += 1
      }
    }
    print(orangesCount)
  }

//  countApplesAndOranges(7, 11, 5, 15, Array(-2, 2, 1), Array(5, -6))
  countApplesAndOranges(2, 3, 1, 5, Array(-2), Array(-1))
   */

  // Kangaroo
  /*
  def kangaroo(x1: Int, v1: Int, x2: Int, v2: Int): String = {
    val jumps = (x2 - x1) / (v1 - v2.toFloat)

    if (jumps > 0 & jumps.isValidInt) "YES"
    else "NO"
  }

  kangaroo(2, 1, 1, 2)
  kangaroo(0, 3, 4, 2)
  kangaroo(0, 2, 5, 3)
  kangaroo(21, 6, 47, 3)
  kangaroo(43, 2, 70, 2)
   */

  // Breaking best and worst records
"""
  def breakingRecords(scores: Array[Int]): Array[Int] ={

    var min, max = scores(0)
    var countMin, countMax = 0

    for (score <- scores){
      if(score < min) {
        countMin += 1
        min = score
      }
      if(score > max) {
        countMax += 1
        max = score
      }
    }

    Array(countMax, countMin)
  }

  println(breakingRecords(Array(10, 5, 20, 20, 4, 5, 2, 25, 1)).mkString(" "))
"""
// return 1st integer, sum of next 2, sum of next 3
"""
  var input = List(1, 6, 8, 5, 9, 4, 7, 2)
  var output = new ListBuffer[Int]()

  output += input.head
  var addTwo = true
  var keep = true
  var x = 1


  while (keep){
    if(addTwo){
      output += input.slice(x, x+2).sum
      x += 2
      addTwo = false
    }else {
      output += input.slice(x, x+3).sum
      x += 3
      addTwo = true
    }

    if(x >= input.length) keep = false
  }

  output.foreach(println)

  val string1 = "abc"
  val string2 = "cba"
  println(string1 == string2.reverse)
"""

// Birthday chocolate
"""
  def birthday(s: Array[Int], d: Int, m: Int): Int = {

    var count = 0
    for(x <- 0 to s.length-m){
      val num = s.slice(x, x + m).sum
      if (num == d) count += 1
    }

    count
  }

  println(birthday(Array(2, 2, 1, 3, 2), 4, 2))
  println(birthday(Array(1, 2, 1, 3, 2), 3, 2))
  println(birthday(Array(4), 4, 1))
"""

//  val col1 = List(1, 4, 7, 9)
//  val col2 = List(2, 4, 7, 8)
//  println(col1.intersect(col2))
//
//  println("Learning Scala".slice(3, 7))
//
//  val array = List(2, 2, 1)
//  val out = array.groupBy(identity).mapValues(_.size).filter(x => x._2 == 1).toList
//  println(out.head._2)

//  1. Write a Scala program that iterates through a string and prints every letter.

//    val str = "Antarctica"
//    for (c <- str) println(c)

//  2. Write a Scala program to append each item with a "Dr. " prefix to the list.

//    val list = List("Phil", "Oz", "Seuss", "Dre")
//    val drList = list.map(name => s"Dr. $name")
//    println(drList)


//  3. Write a Scala program that appends each number to the new list if it's positive.

//    val list = List(111, 32, -9, -45, -17, 9, 85, -10)
//    val positiveList = list.filter(num => num > 0)
//    println(positiveList)


//  4. Write a Scala program to convert the last 5 characters of a given string in upper case. If the length of the string has less than 5 then uppercase all the characters


//  def last5ToUpperCase(str: String): Unit ={
//    if (str.length - 5 > 0){
//      val diff = str.length - 5
//      for (i <- 0 until str.length){
//        if (i >= diff) print(str(i).toUpper)
//        else print(str(i))
//      }
//      println()
//    }else println(str.toUpperCase())
//  }
//
//  last5ToUpperCase("Hi")
//  last5ToUpperCase("hello")
//  last5ToUpperCase("Antarctica")
//  last5ToUpperCase("javier")



//  5. Write a Scala program to check whether two given positive integers have the same last two digit


//  def sameLastTwoDigits(num1: Int, num2: Int): Boolean = {
//    Math.abs(num1 % 100) == Math.abs(num2 % 100)
//  }
//
//  println(sameLastTwoDigits(1234, 9034))
//  println(sameLastTwoDigits(1234, 1987))
//  println(sameLastTwoDigits(3562, 3202))
//  println(sameLastTwoDigits(22, 22))
//  println(sameLastTwoDigits(1, 1))


//  6. Write a Scala program to check whether a given character presents in a string between 2 to 4 times


//  def checkChar(char: Char, str: String) {
//    val count = str.toLowerCase().count(_ == char)
//    if (count >= 2 && count <= 4) println(s"Yes! char $char is $count times in $str")
//    else println(s"No! char $char is $count times in $str")
//  }
//
//  checkChar('a', "Antarctica")
//  checkChar('l', "hello")
//  checkChar('u', "cucurucucu")

//  7. Write a Scala program to count the number of occurrences of each element in a given list.

//    val list = List("hi", "by", "hi")
//    println(list.groupBy(w => w))
//    println(list.groupBy(w => w).mapValues(_.size))

//  8. Write a Scala program to check whether a list contains a sublist.


//      def checkSublist(list: List[Any]){
//        val check = list.filter(x => {
//                if (x.getClass.toString.contains("collection")) true
//                else false
//              })
//
//              if(check.isEmpty) println("No contains a list")
//              else println("Contains a list")
//      }
//
//    checkSublist(List(1, 2, List(3, 4), 5, 6))
//    checkSublist(List(1, 2, 3, 4, 5, 6))


//  9. Write a Scala program to flatten a given List of Lists, nested list structure

//    val list = List(List(1, 2), List(3, 4))
//    val flattenList = list.flatten
//    println(flattenList)


//  10. Write a Scala program and create two Lists data structures as follows:
//    (1) The first List will have items named "pencil", "pen", "sharpener", and
//  (2) The second List will have items name "math book", "french book", "english book".
//
//    Merge the two List data structures such that the resulting combined data structure is of type List[List[String]]. Finally, output all items with the literal " is required in the classroom.".
//
//    Output:
//    pencil is required in the classroom.
//  pen is required in the classroom.
//  sharpener is required in the classroom.
//  math book is required in the classroom.
//    french book is required in the classroom.
//    english book is required in the classroom.

//  val list1 = List("pencil", "pen", "sharpener")
//  val list2 = List("math book", "french book", "english book")
//  val mergedList = List(list1, list2)
//  println(mergedList)
//
//  mergedList.flatten.map(_ + " is required in the classroom.").foreach(println)

//  def names(names: String*): Unit = {
//    println(names)
//    println(names.size)
//    names.foreach(println)
//  }
//
//  names("abc", "qwe")
//  names("w")

//  def foreverSum(input: List[Int]): Unit ={
//    var output = new ListBuffer[Int]()
//
//    output += input.head
//    var keep = true
//    var start = 1
//    var end = 3
//    var jump = 3
//
//    while (keep){
//      output += input.slice(start, end).sum
//      start = end
//      end += jump
//      jump += 1
//
//      if(start >= input.length) keep = false
//    }
//    println(output.toList)
//  }


//  Question #1 - Get number of consecutive non-repeated characters in the input string
//  input string:= "pwwkewp"
//  Output: 4

//    def getNonreaptedCount(str: String): Unit = {
//      var count, max = 0
//      for (x <- 0 until str.length-1){
//        if (str(x) != str(x+1)) {
//          count += 1
//          if (count > max) max = count
//        }
//        else count = 0
//      }
//      println(max)
//    }
//
//    getNonreaptedCount("pwwkewp")
//    getNonreaptedCount("abcdee")
//    getNonreaptedCount("wwass")
//    getNonreaptedCount("a")


//  Question #2 - Find most frequent element in a list
//  List = [2, 1, 2, 2, 1, 3]
//  Output = 2

//    def getMostFrequentNumber(list: List[Int]): Unit ={
//      val mappedList = list.groupBy(w => w).mapValues(_.size)
//      val maxValue = mappedList.values.max
//      println(mappedList.find(_._2 == maxValue).head._1)
//
//    }
//
//    getMostFrequentNumber(List(2, 1, 2, 2, 1, 3))
//    getMostFrequentNumber(List(7, 1, 2, 0, 7))

//  Question #3 - Find all the pairs from the Array which Sum is equal to Target Number:
//  input list:=[1,4,5,7,9,6,2]
//  Target =  10
//  Output = 	(1,9) (because 1 + 9 = 10 )
//  (4,6) (because 4 + 6 = 10 )

//    def getPairs(array: Array[Int], target: Int): Unit ={
//
//      for (x <- 0 until array.length; y <- 1 until array.length){
//        if (x < y && array(x) + array(y) == target)
//          println(array(x), array(y))
//      }
//    }
//
//    getPairs(Array(1, 4, 5, 7, 9, 6, 2), 10)


//  Question #4 - Execute the classic Word count example in IntelliJ using Spark/Scala

//def maxArea(height: List[Int]): Int = {
//  var maxarea = 0
//  var left = 0
//  var right = height.length - 1
//
//  while (left < right) {
//    val width = right - left
//    maxarea = List(maxarea, List(height(left), height(right)).min * width).max
//
//    if (height(left) <= height(right)) left += 1
//    else right -= 1
//  }
//
//  maxarea
//}
//
//  println(maxArea(List(1,8,6,2,5,4,8,3,10)))

  val N: Long = 777770077777L
  val s = N.toString
  println(N.toString.reverse.toLong == N)

}

