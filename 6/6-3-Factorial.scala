/* 
Create Scala (Factorial.scala) program that calculates the 
factorial of given integer using the for loop.
Hint!
Factorial is calculated by multiplying all whole numbers from given number down to 1.
For example, Factorial of 4 = 4 * 3 * 2 * 1 = 24
Example output:
Type the integer:
5
The factorial of 5 is 120
*/
object Factorial extends App{
	import scala.io.StdIn.readInt
	println("Type the integer:")
	var input = readInt()
	var factorial = 1
	var x = 0
	for(x <- 1 to input){
		factorial = factorial * x
	}
	println("The factorial of " + input + " is " + factorial)
}