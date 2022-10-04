import org.apache.spark.sql.functions.{col, desc, lit}
import org.apache.spark.sql.{Row, SaveMode, SparkSession}
import org.apache.spark.sql.types.{IntegerType, StringType, StructField, StructType}
import scala.io.StdIn.readLine
import scala.reflect.internal.util.NoPosition.column

object SparkTest extends App{

  val spark = SparkSession.builder()
    .master("local[1]")
    .appName("Spark Test")
    .getOrCreate()
//
//  val zipDF = spark.read.json("C:\\Users\\Consultant\\Intellij projects\\Scala-Spark\\src\\main\\Files\\zips.json")
//  zipDF.show(10, false)
//
//  zipDF.filter(col("pop") > 4000).show(10, false)

  val adultData = spark.read
    .option("header", "true")
    .csv("C:\\Users\\Consultant\\Intellij projects\\Scala-Spark\\adult_data.csv")

  val hdfs1 = adultData.select("age", "occupation", "relationship").filter(col("age") > 20)
  hdfs1.write.option("header", "true").mode("overwrite").parquet("src/main/Files")

  val hdfs2 = spark.read.option("header", "true").parquet("src/main/Files")

  hdfs2.show()

  var ss = readLine()
//
//  println("First SparkSession:")
//  println("APP Name: "+ spark.sparkContext.appName)
//  println("Deploy Mode: "+ spark.sparkContext.deployMode)
//  println("Master: "+ spark.sparkContext.master)
//
//  val text = spark.sparkContext.parallelize(Seq("one,one,one,two,two"))
//  text.flatMap(line => line.split(",")).map(word => (word, 1)).reduceByKey(_ + _).collect().foreach(println)



}