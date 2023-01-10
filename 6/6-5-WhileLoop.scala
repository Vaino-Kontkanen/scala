/*
Create Scala program (Numbers.scala) that prints the following numbers 
10 20 30 40 50 60 70 80 90 100, using the while loop.
Example output:
10 20 30 40 50 60 70 80 90 100 
*/
object Numbers extends App {
	var x = 10
	while(x<101){
		print(x + " ")
		x+=10
	}
}