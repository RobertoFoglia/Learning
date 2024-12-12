package enumerations

sealed trait CelestialBodyEnum

object CelestialBodyEnum {
  case object Earth extends CelestialBodyEnum
  case object Sun extends CelestialBodyEnum
  case object Moon extends CelestialBodyEnum
  case class Asteroid(name: String) extends CelestialBodyEnum
}
