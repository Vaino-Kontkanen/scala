/*
Create executable Scala object called Square. Create a function called square 
inside the object. The square function takes one integer parameter and 
returns the square of given parameter.
The program asks an integer from a user and then prints the result.
*/
object Square extends App{
    import scala.io.StdIn.readInt
    println("Type an integer")
    val input = readInt()
    def square(x:Int)= x*x
    println("Square = " + square(input))
}