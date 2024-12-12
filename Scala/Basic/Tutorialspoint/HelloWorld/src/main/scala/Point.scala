class Point (val xc: Int, val yc: Int) {
  var x: Int = xc
  var y: Int = yc

  def move(dx: Int, dy: Int): Unit = {
    x = x + dx
    y = y + dy
    println ("Point x location : " + x);
    println ("Point y location : " + y);

    methodIsNotinherited()
  }

  private def methodIsNotinherited(): Unit = {
    println("methodIsNotinherited")
  }
}
