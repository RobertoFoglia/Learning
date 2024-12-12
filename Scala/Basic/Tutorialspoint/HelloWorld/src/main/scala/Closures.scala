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

  var myList1 = Array(1.9, 2.9, 3.4, 3.5)
  var myList2 = Array(8.9, 7.9, 0.4, 1.5)

  var myList3 =  Array.concat(myList1, myList2)

  println(myList3.mkString("Array(", ", ", ")"))

  val nums = 1 :: (2 :: (3 :: (4 :: Nil)))
  var another = 10::nums

  another.::(10)
  println(another.::(10))

  println(nums)

}
