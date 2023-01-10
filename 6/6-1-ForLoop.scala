/*
Create Scala program (Loops.scala) that prints the following numbers 
1, 4, 7, 10, 13 using the for loop.
Hint! Use by keyword in the range.
Example output:
1
4
7
10
13
*/
object Loops extends App{
	var x = 0
	for(x <- 1 to 13 by 3){
		println(s"$x")
	}
}