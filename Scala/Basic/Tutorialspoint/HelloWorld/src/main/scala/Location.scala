class Location
// ovveride fields are the parameter of parent class
(override val xc: Int, override val yc: Int, val zc: Int)
  extends Point(xc, yc) {
  var z: Int = zc

  def move(dx: Int, dy: Int, dz: Int): Unit = {
    x = x + dx
    y = y + dy
    z = z + dz
    println("Point x location : " + x)
    println("Point y location : " + y)
    println("Point z location : " + z)

//    super.methodIsNotinherited()
//    methodIsNotinherited()
  }

  // override method and call super method
  override def move(dx: Int, dy: Int): Unit = super.move(dx, dy)
}
