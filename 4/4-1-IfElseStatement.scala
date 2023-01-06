/*
Create a program (AgeCheck.scala) that asks the age (integer) and 
prints Welcome if the given age is greater than 18. 
Otherwise it prints You are too young.
Example output:
What is your age?
16
You are too young
*/
object AgeCheck extends App{
	import scala.io.StdIn.readInt
	println("What is your age?")
	val input = readInt()
	if (input >= 18){
		println("Welcome")
	}
	else {
		println("You are too young")
	}
}