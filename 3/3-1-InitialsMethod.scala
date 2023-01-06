/* 
Create Scala executable object called Initials. It contains method called printInitials 
that takes two string paramaters:firstName and lastName. The method prints the intials of the name parameters. 
Call the method using the following values: firstName = "John", lastName = "Smith".
Example output:
J.S.
The output of the program must be exactly the same as the example output (the most strict comparison level)
*/
object Initials extends App {
	def printInitials = {
		val person =("John", "Smith")
		person
	}
	val user = printInitials;
	println(user._1.charAt(0) + "." + user._2.charAt(0) + ".")
}