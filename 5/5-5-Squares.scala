/*
Create Scala program (Squares.scala) that creates an array with 
the values 2, 6, 1, 4, 3, 7. Use the map function to calculate
square of every number in the array and finally, print the sum of squares.

Example output:
The sum of squares is 115 
*/
object Squares extends App{
	var numbers = Array[Int](2,6,1,4,3,7)
	def square(x:Int)=x*x
	val squaredNumbers = numbers.map(square)
	val sum =squaredNumbers.foldLeft(0)(_+_)
	println("The sum of squares is "+ sum)
}