/*
Create Scala executable object called Intials that asks firstname and lastname. 
The program will then print out the intials of a name.
Example output:
Type your firstname
John
Type your lastname
Smith
Your initials: J.S.
The verification of program output does not account for whitespace characters like "\n", "\t" and " " 
*/
object Initials extends App{
	import scala.io.StdIn.readLine
	println("Type your firstname")
	val input = readLine()
	println("Type your lastname")
	val input2 = readLine()
	println("Your initials: " + input.charAt(0) + "." + input2.charAt(0) + ".")
}