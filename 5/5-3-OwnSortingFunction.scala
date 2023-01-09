/*
Create Scala program (OwnSorting.scala) that contains the List 
with the following names: "Elisabeth", "Mike", "Lisa", "Annie", "John", "Layla".
Sort the list according to the second character of names and print the sorted list.
Example output:
List(Layla, Mike, Lisa, Elisabeth, Annie, John)
*/
object OwnSorting extends App{
	val names = List("Elisabeth","Mike","Lisa","Annie","John","Layla")
	val names2 = names.sortBy(name => name.charAt(1))
	println(names2)
}