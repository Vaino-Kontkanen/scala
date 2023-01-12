/*
Create Scala program (PetProgram.scala) and create trait 
called Pet into the same file. 
Pet trait defines two methods sleep and eat. 
The both methods doesn't take and return any parameters.

Create class called Cat that inherits the Pet trait.
Cat class has one variable called name and a method called sayHello. 
The sayHello method prints 'Hello, my name is {name}'. 
The Cat class also implements both of the Pet trait methods.  
The eat method prints 'I am not hungry anymore' and 
the sleep method prints 'I am sleeping'.

Create a one Cat object using the name 'Garfield'. 
Call all three methods in the following order: sayHello, eat, sleep.
Example output:
Hello, my name is Garfield
I am not hungry anymore
I am sleeping
*/
object PetProgram extends App{
    val garf = new Cat()
	garf.catName
    garf.eat
    garf.sleep
	trait Pet{
		def sleep
		def eat
	}
	class Cat extends Pet{
		def catName()
		{
			println("Hello, my name is Garfield")
		}
		def sleep()
		{
			println("I am sleeping")
		}
		def eat(){
			println("I am not hungry anymore")
		}
	}
}