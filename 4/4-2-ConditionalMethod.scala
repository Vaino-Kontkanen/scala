/*
Create Scala program (TestMehod.scala) that contain method called isValidString. 
The method takes one string parameter and returns a boolean value. 
The method returns true if the length of given string parameter is 
greater or equals to 5 and less or equals to 10.
Call method two times with the following parameter values and print the returned value.
Test
SecondTest

Example output:
false
true
*/
object TestMethod extends App{
	def isValidString(x: String) ={
		var length = x.length()
		if(length >= 5 && length<=10){
			println("true")
		} else{
			println("false")
		}
	}
	isValidString("Test")
	isValidString("SecondTest")
}