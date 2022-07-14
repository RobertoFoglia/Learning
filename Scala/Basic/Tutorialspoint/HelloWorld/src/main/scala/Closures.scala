object Closures extends App {
  var factor = 3
  val multiplier = (i:Int) => i * factor
  println( "multiplier(1) value = " +  multiplier(1) )

  factor = multiplier(2) // factor will be 3
  println( "multiplier(2) value = " +  multiplier(1) ) // result 6

  // ## Output ######
  //  multiplier(1) value = 3
  //  multiplier(1) value = 6
  // ################


}
