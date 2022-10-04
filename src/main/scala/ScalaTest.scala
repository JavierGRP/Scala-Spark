

object ScalaTest extends App {

//  5.write a program to do sum of 10 numbers in integer array in scala.

//  val array = Array(2, 1, 1, 2, 1, 1, 2, 1, 1, 3)
//  var x = 0
//
//  for (i <- array){
//    x += i
//  }
//
//  println(x)

//  6.Write a Scala program to find the largest and smallest number from a given list.

//  val list = List(20, -3, 100, 1, 99)
//  println(s"greatest: ${list.max}")
//  println(s"lowest: ${list.min}")

//  7.Write a Scala program to find the even and odd numbers from a given list.

//  val list = List(2, 43, 12, 3, 15)
//
//  list.foreach(x => if (x % 2 == 0) println(s"$x is even") else println(s"$x is odd"))

//  8.Write a Scala program to remove duplicates from a given list.

//  def SeatingStudents(arr: Array[Int]): Int ={
//    val K = arr(0)
//    val occupied = arr.tail
//
//    val rows = (K/2).toInt
//
//    import scala.collection.mutable.ListBuffer
//    var seats = new ListBuffer[Boolean]()
//    var seats2 = new ListBuffer[Boolean]()
//
//    var x = 0
//    var full_seat = false
//
//    for (i <- 0 until rows){
//      seats += seats2
//      for(j <- 0 to 2){
//        if(occupied.contains(x+1)) full_seat = true
//        else full_seat = false
//        seats(i) += full_seat.toString
//        x += 1
//      }
//    }
//
//    var seating = 0
//    for (i <- 0 to rows-1){
//      if(seats(i)(0) == false && seats(i)(1) == false) seating += 1
//
//      if(seats(i)(0) == false && seats(i+1)(0) == false) seating += 1
//
//      if(seats(i)(1) == false && seats(i+1)(1) == false) seating += 1
//
//      if(seats(rows-1)(0) == false && seats(rows-1)(1) == false) seating += 1
//    }
//
//    seating
//
////for i in range(rows-1):
//    //        if((seats[i][0] == str(False)) and (seats[i][1] == str(False))):
//    //            seating+=1
//    //
//    //        if((seats[i][0] == str(False)) and (seats[i+1][0] == str(False))):
//    //            seating+=1
//    //
//    //        if((seats[i][1] == str(False)) and (seats[i + 1][1] == str(False))):
//    //            seating+=1
//    //
//    //    if((seats[rows - 1][0] == str(False)) and (seats[rows - 1][1] == str(False))):
//    //        seating+=1
//    //    return seating
//
//
//  }

  def SeatingStudents(arr: Array[Int]): Int = {
    val totalDesks = arr(0)
    val rows = totalDesks / 2
    val occupied = arr.tail
    var seats = Array.ofDim[Int](totalDesks, 2)

    var x = 1
    for(i <- 0 until rows; j <- 0 to 1){
      if(occupied.contains(x)) seats(i)(j) = 0
      else seats(i)(j) = x
      x += 1
    }

//    for(i <- 0 until rows; j <- 0 to 1){
//      println(s"$i,$j - ${seats(i)(j)} ")
//    }

    var take = 0
    for(i <- 0 until rows){
        if(seats(i)(0) != 0 && seats(i)(1) != 0) take += 1
    }
//    println(s"take: $take")

    var take2 = 0
    for(i <- 0 until rows){
      if(seats(i)(0) != 0 && seats(i+1)(0) != 0) take2 += 1
      if(seats(i)(1) != 0 && seats(i+1)(1) != 0) take2 += 1
//      println(seats(i)(1))

    }
//    println(s"take2: $take2")
    take + take2
  }

  case class Dog(breed: String, age: Int)
  val fido = new Dog("lab", 4)
  println(fido.toString)

  val x = (_:String) IndexOf(_:Int)

  val y = {case 'r' => "Red";
  case 'r' => "Red";
  case 'r' => "Red";}

  val z = new Function1[Int, Int] {override def apply(in: Int): Int = in *2}

  var a = 10;
  var b: Unit = a = 2;

}

