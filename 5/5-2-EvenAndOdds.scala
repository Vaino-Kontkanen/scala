/*
Create Scala program (EvenNumbers.scala) that creates and 
array with the following numbers: 1, 4, 6, 13, 16, 17, 22, 31, 33, 37.

Use the filter function to get amount of even numbers in the array.
Hint! You can check if the number is even or odd by using the modulo operator (num % 2 == 0 means even).
Finally, print the amount of even and odd numbers.

Example output:
The amount of even numbers is 4
The amount of odd numbers is 6
*/
object EvenNumbers extends App{
	var numbers = Array[Int](1,4,6,13,16,17,22,31,33,37)
    var ctr = 0;
    for (i <- 0 to numbers.length - 1) {
      if (numbers(i) % 2 == 0)
        ctr=ctr+1
    }
      println("The amount of even numbers is " + ctr);
      println("The amount of odd numbers is " + (numbers.length - ctr));
}//filter