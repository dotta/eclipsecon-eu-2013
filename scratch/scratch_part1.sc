import part1._

object scratch_part1 {
  println("Welcome to the Scala worksheet")

  // 1. Instance creation
  val timeJ = new TimeJava(1, 30)
  val timeS = new TimeScala(1, 30)

  // 2. Method call
  timeJ.getMinutes()
  timeS.minutes

  // 3. Equality - Java
  val timeJ2 = new TimeJava(1,30)
  timeJ.equals(timeJ2)

  val timeJ3 = new TimeJava(2,30)
  timeJ.equals(timeJ3)
  
  // 3. Equality - Scala
  val timeS2 = new TimeScala(1,30)
  timeS.equals(timeS2)

  val timeS3 = new TimeScala(2,30)
  timeS.equals(timeS3)

  val timeS4 = TimeScala()
  val timeS5 = TimeScala(hours = 10)
  val timeS6 = TimeScala(minutes = 40)
}