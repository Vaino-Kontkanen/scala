/*
Create Scala program (NumberFile.scala) that contains the following array.
val nums = Array(5, 3, 12, 7, 8, 21, 1, 14, 17)
Use filter method to create a new array that contains only numbers 
from the nums array, that are greater than 10. Then, 
create a file called nums.txt (without any path) and 
write the content of the filtered array into the file.
*/
object NumberFile extends App{
	import java.io.File
	import java.io.PrintWriter
	import scala.io.Source
	val nums = Array(5, 3, 12, 7, 8, 21, 1, 14, 17)
	val filter = nums.filter(_ >10)
	val numFile = new File("C:\\hello.txt")
	val myWriter = new PrintWriter(numFile)
	filter.foreach(int => myWriter.write(int + "\n"))
	myWriter.close()
	
	val readFile = Source.fromFile("C:\\hello.txt")
	while (readFile.hasNext){
		print(readFile.next)
	}
}