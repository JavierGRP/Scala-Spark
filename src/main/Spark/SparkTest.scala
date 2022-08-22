import org.apache.spark.sql.functions.{col, lit}
import org.apache.spark.sql.{Row, SparkSession}
import org.apache.spark.sql.types.{IntegerType, StringType, StructField, StructType}

import scala.reflect.internal.util.NoPosition.column

object SparkTest extends App{

  val spark = SparkSession.builder()
    .master("local[1]")
    .appName("Spark Test")
    .getOrCreate()

  val adultData = spark.read
    .option("header", "true")
    .csv("C:\\Users\\Consultant\\Intellij projects\\Scala-Spark\\adult_data.csv")

  adultData.show()

  println("First SparkSession:")
  println("APP Name: "+ spark.sparkContext.appName)
  println("Deploy Mode: "+ spark.sparkContext.deployMode)
  println("Master: "+ spark.sparkContext.master)

  val text = spark.sparkContext.parallelize(Seq("one,one,one,two,two"))
  text.flatMap(line => line.split(",")).map(word => (word, 1)).reduceByKey(_ + _).collect().foreach(println)
}