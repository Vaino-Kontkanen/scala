/*
Create Scala program (ShapeProgram.scala) that contains sealed trait called Shape. 
Create two case classes in the same file: Square(height: Int, width:Int) and 
Circle(radius: Int) and both classes extends the Shape trait.

Create method shapeInfo(shape: Shape): Unit that use pattern matching and 
prints 'This is square', if the passed argument is an instance of Square. 
If the passed argument is an instance of Circle, it prints 'This is circle'. 
In all other cases shapeInfo method prints 'Unknown shape'

Create an instance of Square and Circle classes and call the shapeInfo 
method using the both instances.
Example output:
This is square
This is circle
*/
object HelloScala extends App {
  sealed trait Shape

  case class Square(height: Int, width:Int) extends Shape
  case class Circle(radius: Int) extends Shape

  def shapeInfo(phone: Shape): Unit = {
    phone match {
      case Square(height, width) => println("This is square")
      case Circle(radius) => println("This is circle")
      case _ => println("Unknown shape")
    }
  }

  val shape1 = Square(5, 2)
  val shape2 = Circle(10)
  shapeInfo(shape1)
  shapeInfo(shape2)
}