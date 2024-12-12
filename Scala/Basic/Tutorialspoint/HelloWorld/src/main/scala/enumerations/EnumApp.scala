package enumerations

import com.sun.javaws.exceptions.InvalidArgumentException

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future
import scala.util.Try

object EnumApp extends App {
  new CelestialBodyEnum.Asteroid("").name;

  val j = Try("abc".toInt)
  println(j.map(_ + 1).getOrElse(321))


  val r = Try("1".toInt) flatMap {
    i => Try("abc".toInt).map(_ + i)
  }

  println(r.getOrElse(324))


//  val future =
    Future { throw new RuntimeException("") }
//    .recover {
//      case exception: RuntimeException => new RuntimeException("")
//    }

println("")

}
