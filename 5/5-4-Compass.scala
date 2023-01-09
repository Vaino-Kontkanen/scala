/*
Create Scala program (Compass.scala) that asks point of compass 
from a user (N, S, W or E). The program then prints the textual 
presentation of the typed point (North, South, West or East).

Use Map in the program that contains the following key - value pairs:
 "N" -> "North", "W" -> "West", "S" -> "South", "E" -> "East"
Note! if or match statements are not allowed to use in this exercise
Example output:
Where are you going (N/W/S/E)?
S
You are going to South
*/
object Compass extends App{
	import scala.io.StdIn.readLine
	val direction = Map("N" -> "North", "W"->"West","S"->"South","E"->"East")
	
	
	println("Where are you going (N/W/S/E)?")
    val input = direction(readLine())
	println("You are going to " + input)
}