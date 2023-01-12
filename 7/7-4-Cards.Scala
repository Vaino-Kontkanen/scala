/*
Create Scala program (CardProgram.scala) and create one class 
called Card into the same file. 
The Card class has two variables: suit: String and num: Int. 
Override toString method in the Card class and it returns the 
following string: 'Card: {num}{suit}'

Create six card objects using the following values.
suit = "Heart", num = 5
suit = "Clubs", num = 2
suit = "Spade", num = 9
suit = "Heart", num = 8
suit = "Spade", num = 3
suit = "Clubs", num = 4

Create an array and add card objects into the array. 
Filter the card array using the filter method. 
The filtered array should contain cards where suit is Heart. 
Finally, print out the content of filtered array.

Example output:
Card: 5 Heart
Card: 8 Hear
*/
object CardProgram extends App {
	var card1 = new Card("Heart",5)
  	var card2 = new Card("Clubs",2)
 	var card3 = new Card("Spade",9)
  	var card4 = new Card("Heart",8)
  	var card5 = new Card("Spade",3)
  	var card6 = new Card("Clubs",4)

  	val cardsList = Array[Card](card1, card2, card3, card4, card5,card5,card6)
  	val newList = cardsList.filter(_.suit=="Heart")
	
	class Card(var suit: String, var num: Int){
		override def toString: String = {
			s"Card: $num $suit"
		}
	}
	println(newList mkString "\n")
}