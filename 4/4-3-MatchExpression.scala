/*
Create Scala program (Direction.scala) that contains method direction. 
The method takes one integer parameter and returns a string value. 
In the table below, you can see what the method returns with the 
different parameter values. You must use match to define return 
value in the direction method.

Parameter value	Return value
0	North
1	West
2	South
3	East
< 0 || > 3	Invalid direction
Call the direction method three times with the following values: 2, 0 ,7 and print the returned value.
Example output:
South
North
Invalid direction
 */
 object Direction extends App{
	def direction(x: Int): String = x match {
		case 0 => "North"
  		case 1 => "West"
  		case 2 => "South"
  		case 3 => "East"
  		case x if x<0|| x>3=> "Invalid direction"
		case _ => "No number detected"
		}
	val s = direction(2)
    val n = direction(0)
    val i = direction(7)
	println(s + "\n" + n +"\n" + i)
}