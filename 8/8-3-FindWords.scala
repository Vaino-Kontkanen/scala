/*
Create Scala program (FindWords.scala) that contains the following string value.
val str = "Dolor aute irure dolor in reprehenderit in voluptate esse cillum dolor eu fugiat nulla pariatur."
Use regular expression to find amount of dolor or Dolor words from the string. The program prints the result.

Example output:
There are 3 Dolor or dolor words
*/
object FindWords extends App{
	val pattern = "[Dd]olor".r
	val str = "Dolor aute irure dolor in reprehenderit in voluptate esse cillum dolor eu fugiat nulla pariatur."
	
	val amount = pattern.findAllIn(str)
	println(s"There are ${amount.length} Dolor or dolor words")
}