/*
Create Scala executable object called Message.

Create higher order function called msgFunc inside the Message object, 
that takes a function (String => String) and one String as a parameter.
Create two more functions inside the Message object (Use => notation):

helloMsg: Takes string parameter and returns string "Hello parameterValue"
goodbyeMsg: Takes string parameter and returns string "Goodbye parameterValue"

Finally, call the higher order msgFunc function by using the helloMsg function as 
parameter and then using the goodbyeMsg function as paramater. The second string 
parameter value should be "Lisa". Print the output in both cases.
*/
object Message extends App {
	def msgFunc(f: (String, String) => String, x: String, y: String): String = f(x, y)

  	val helloMsg = (x: String, y: String) => (x + y)
  	val goodbyeMsg = (x: String, y: String) => (x+ y)

  	val s1 = msgFunc(helloMsg, "Hello ", "Lisa")
  	val s2 = msgFunc(goodbyeMsg,"Goodbye ", "Lisa")

  	println(s1)
	println(s2)
}