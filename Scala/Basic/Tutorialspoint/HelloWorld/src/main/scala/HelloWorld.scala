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
}
