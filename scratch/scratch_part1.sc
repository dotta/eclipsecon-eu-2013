import part1._

object scratch_part1 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  // 1. Instance creation
  val timeJ = new TimeJava(1, 30)                 //> timeJ  : part1.TimeJava = TimeJava [hours=1, minutes=30]
  val timeS = new TimeScala(1, 30)                //> timeS  : part1.TimeScala = TimeScala(1,30)

  // 2. Method call
  timeJ.getMinutes()                              //> res0: Int = 30
  timeS.minutes                                   //> res1: Int = 30

  // 3. Equality - Java
  val timeJ2 = new TimeJava(1,30)                 //> timeJ2  : part1.TimeJava = TimeJava [hours=1, minutes=30]
  timeJ.equals(timeJ2)                            //> res2: Boolean = true

  val timeJ3 = new TimeJava(2,30)                 //> timeJ3  : part1.TimeJava = TimeJava [hours=2, minutes=30]
  timeJ.equals(timeJ3)                            //> res3: Boolean = false
  
  // 3. Equality - Scala
  val timeS2 = new TimeScala(1,30)                //> timeS2  : part1.TimeScala = TimeScala(1,30)
  timeS.equals(timeS2)                            //> res4: Boolean = true

  val timeS3 = new TimeScala(2,30)                //> timeS3  : part1.TimeScala = TimeScala(2,30)
  timeS.equals(timeS3)                            //> res5: Boolean = false
}