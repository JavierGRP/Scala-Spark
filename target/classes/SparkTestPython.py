from pyspark.sql import SparkSession
from pyspark.sql.types import *

spark = SparkSession.builder\
    .master("local[1]")\
    .appName("Pyspark test")\
    .getOrCreate()

print("First SparkSession:")
print("APP Name: " + spark.sparkContext.appName)
print("Master: " + spark.sparkContext.master)

data = [("20/03/2004", "18:00:00", 2.6, 1360, 150, 11.9, 166, 113),
        ("20/03/2004", "19:00:00", 2.0, 1292, 112, 9.4, 103, 92)]

schema = StructType().add("Date", StringType()) \
    .add("Time", StringType()) \
    .add("CO_(mg/m3)", DoubleType()) \
    .add("PT08.S1(CO)", IntegerType()) \
    .add("NMHC_(microg/m3)", IntegerType()) \
    .add("C6H6_(microg/m3)", DoubleType()) \
    .add("NOx_(ppb)", IntegerType()) \
    .add("NO2_(microg/m3)", IntegerType())

df = spark.createDataFrame(data, schema)
df.count()



