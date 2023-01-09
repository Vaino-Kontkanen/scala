/*
Create Scala program (Greatest.scala) that asks 
three integers from a user. The program will then 
print the greatest number.
Example output:
Enter integer 1
3
Enter integer 2
12
Enter integer 3
-6
Greatest = 12
*/
object Greatest extends App{
        import scala.io.StdIn.readInt
        var int1:Int=0
        var int2:Int=0  
        var int3:Int=0  
        var greatest:Int=0  
        
        println("Enter integer 1")
        int1 = readInt()
        println("Enter integer 2")
        int2 = readInt()
        println("Enter integer 3")
        int3 = readInt()
        
        greatest = if (int1 > int2 && int1 > int3) int1 else if(int2 > int1 && int2 > int3) int2 else int3
        println("Greatest = "+greatest)  
}