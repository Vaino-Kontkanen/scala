/*
Create Scala program (NameCheck.scala) that asks firstname and 
check if that is valid. The typed firstname should start with 
capital letter followed by at least one lower case letter (no digits).

If the names is valid, the program prints 'Hello typed_name', 
otherwise it prints 'Name is invalid'
Example output:
Enter your firstname
Robert
Hello Robert
*/
object NameCheck extends App{
	import scala.io.StdIn.readLine
	println("Enter your firstname")
	val validName ="[A-Z]{1}[a-z]".r
	val str = readLine()
	validName.findFirstIn(str) match {
		case Some(_) => println ("Hello " + str)
		case None => println("Name is invalid")
	}
}