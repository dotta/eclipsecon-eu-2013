import part1._

object scratch_part1 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  // 1. Instance creation
  val timeJ = new TimeJava(1, 30)                 //> timeJ  : part1.TimeJava = part1.TimeJava@44b01d43
  val timeS = new TimeScala(1, 30)                //> timeS  : part1.TimeScala = part1.TimeScala@3f77b3cd

  // 2. Method call
  timeJ.getMinutes()                              //> res0: Int = 30
  timeS.minutes                                   //> res1: Int = 30

  
}