/*
Create executable Scala object called Person.

Declare the follwing three variables:

Variable name	Data type	Value
firstName	    String	    Lisa
lastName	    String	    Patterson
age	            Integer	       32
Use string interpolation to print the following text.

First name: Lisa, Last name: Patterson, Age: 32 years
*/
object Person extends App{
	var (firstName, lastName, age) = ("Lisa", "Patterson", 32)
	println("First name: " + firstName + ", Last name: " + lastName + ", Age: " + age + " years")
}