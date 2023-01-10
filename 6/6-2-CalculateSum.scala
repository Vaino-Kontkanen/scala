/*
Create Scala program (Calculator.scala) that calculates the 
sum of first 20 natural numbers. Use for loop in the calculation.

Example output:
Sum = 210
*/
object Calculator extends App{
	var sum = 0
	var x = 0
	for(x <- 1 to 20){
		sum = sum + x
	}
	println("Sum = "+sum)
}