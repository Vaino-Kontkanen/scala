/*
Create Scala program (SortedNames.scala) that asks three names from a user. 
The names are added to an array. Finally, the names are sorted and 
the program prints the first element of sorted array.

Example output:
Enter name
Lisa
Enter name
Annie
Enter name
Mike
The first in alphabetical order is: Annie
*/
object SortedNames extends App{
	import scala.collection.mutable.ArrayBuffer
	import scala.io.StdIn.readLine
	var names = new ArrayBuffer[String]()
	println("Enter name")
	names += readLine()
	println("Enter name")
	names += readLine()
	println("Enter name")
	names += readLine()
	println("The first in alphabetical order is: " + names.sorted.head)
}