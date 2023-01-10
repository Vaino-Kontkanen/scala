/*
Create Scala program (Name.scala) that contains the following method 
printName(name: Option[String]): Unit. If the passed value is an 
instance of Some(name), the method prints 'Hello {name}'. 
If the passed value is an instance of None, the method prints 'No name'.  
Call the printName method two times by passing the following values Some("John") and None. 
Example output:
Hello John
No name
*/
case class Person(
		firstName: Option[String]
		)
object Name extends App{
	def printName(name: Option[String]) = {
		name match {
			case Some(n) => println("Hello " + n)
			case None 	 => println("No name")
		}
	}
	val guy = Person(Some("John"))
	val guy2 = Person(None)
	printName(guy.firstName)
	printName(guy2.firstName)
}