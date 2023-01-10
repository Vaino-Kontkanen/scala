/*
Create Scala program (ArrayElement.scala) that asks 
user to type an index. The program contains the following array
val arr = Array(1, 2, 3)
Print an element in the given index. Use try-catch to handle 
exceptions. In the case of exception, print out 'Element doesn't exist'.
Example output:
Type an index
0
1
*/
object ArrayElement extends App{
	import scala.io.StdIn.readInt
	println("Type an index")
	val input = readInt()
	try{
		val arr = Array(1, 2, 3)
		println(arr(input))
	}
	catch {
		case ex: IndexOutOfBoundsException => println("Element doesn't exist ")
	}
}