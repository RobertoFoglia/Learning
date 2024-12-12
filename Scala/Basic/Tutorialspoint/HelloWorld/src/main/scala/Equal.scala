trait Equal {
  def isEqual(x: Any): Boolean

  def isNotEqual(x: Any): Boolean = !isEqual(x)
}

trait EqualIgnoreCase {
  def isEqualIgnoringCase(x: Any): Unit
}

class Point2(xc: Int, yc: Int) extends Equal with EqualIgnoreCase {
  var x: Int = xc
  var y: Int = yc

  def isEqual(obj: Any): Boolean = obj.isInstanceOf[Point] && obj.asInstanceOf[Point].x == y

  override def isEqualIgnoringCase(x: Any): Unit = {
    println("OK")
  }
}

object Run extends App {
  new Point2(3,3).isEqualIgnoringCase(10)
}