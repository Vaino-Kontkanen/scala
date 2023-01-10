/*
Create Scala program (ReplaceString.scala) that contain the following string value.
val str = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod 
tempor incididunt ut labore et dolore magna aliqua"

Use regular expression to replace all 'or' to 'OR'. Print the resulting string.
Example output:
LORem ipsum dolOR sit amet, consectetur adipiscing elit, sed do eiusmod tempOR 
incididunt ut labORe et dolORe magna aliqua
*/
object ReplaceString extends App{
	val pattern ="or".r
	val str = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua"
	val result = pattern.replaceAllIn(str, "OR")
	println(result)
}