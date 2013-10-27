package part1

object TimeUtilScala {

  def partition(times: Array[TimeScala], hour: Int): (Array[TimeScala], Array[TimeScala]) = {
    times.partition(time => time.hours < hour)
  }
}