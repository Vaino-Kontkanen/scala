/*
Create Scala program (Filtering.scala) that creates an array 
with the following numbers: 2, 6, 1, 9, 3, 12, 21, 5, 16.

Create a new array using the for loop with filter, that contains 
only the numbers from the original array, that are greater than 6. 
Finally, use the for loop to print values of the filtered array.
Example output:
9
12
21
16
*/
object Filtering extends App{
	var numbers = Array(2,6,1,9,3,12,21,5,16)
	val filteredNumbers = for{ n <- numbers if n > 6}
	yield n
	filteredNumbers.foreach(println)
}