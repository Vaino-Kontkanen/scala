/*
Create Scala program (LanguageProgram.scala) that contains the following array.
val languages = Array("Java", "Perl", "Python", "Scala", "C#")
Create a new file called languages.txt (Without any path) and 
write the content of the languages array into the file.
Then, read the file and print out the file content 
Example output:
Java
Perl
Python
Scala
C#
*/
object LanguageProgram extends App{
	import java.io.File
	import java.io.PrintWriter
	import scala.io.Source
	val languages = Array("Java", "Perl", "Python", "Scala", "C#")
	val langFile = new File("languages.txt")
	val myWriter = new PrintWriter(langFile)
	languages.foreach(name => myWriter.write(name + "\n"))
	myWriter.close()
	
	val readFile = Source.fromFile("languages.txt")
	while (readFile.hasNext){
		print(readFile.next)
	}
}