import scala.language.postfixOps

object HelloWorld extends App {
  // https://www.tutorialspoint.com/scala/scala_basic_syntax.htm

  /* This is my first java program.
  * This will print 'Hello World' as the output
  */
  println("Hello, world!\n") // prints Hello World

  // multiline string
  println(
    """
    |Multiline string
    |
    |the present string
      |spans three
      |lines.""".stripMargin
  )


  //#################################################
  // val or val VariableName : DataType = [Initial Value]
  //#################################################

  // var --> mutable variable
  var myVarDef : String = "Foo"

  // val --> immutable variable
  val myValDef : String = "Foo"

  // Variable Type Inference
  val typeInference = ""

  //##################################################


  var myVar :Int = 10;
  val myVal :String = "Hello Scala with datatype declaration.";
  var myVar1 = 20;
  val myVal1 = "Hello Scala new without datatype declaration.";

  println(myVar); println(myVal); println(myVar1);
  println(myVal1);

  //###### Classes & Objects ###################################
  val pt = new Point(10, 20)
  // Move to a new location
  pt.move(10, 10)

  val loc = new Location(10, 20, 15)
  // Move to a new location
  loc.move(10, 10, 5)
  loc.move(10, 10)
  //###########################################################

  // Scala for Comprehensions

  var dogBreeds = List("Doberman", "Yorkshire Terrier", "Dachshund", "Scottish Terrier", "Great Dane", "Portuguese Water Dog")

  dogBreeds foreach println
  List("Carla", "Sofia", "Roberto") foreach println

  dogBreeds = List("Doberman", "Yorkshire Terrier", "Dachshund", "Scottish Terrier", "Great Dane", "Portuguese Water Dog")
  println("\n\n--------------------------\n\n")
  dogBreeds filter isTerrier foreach println
  def isTerrier(breed: String) : Boolean = {
    breed contains "Terrier"
  }


//  (1 until 12).view()
}
