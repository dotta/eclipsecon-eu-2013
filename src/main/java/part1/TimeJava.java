package part1;

public class TimeJava {
  final private int hours;
  final private int minutes;

  public TimeJava(int hours, int minutes) {
    this.hours = hours;
    this.minutes = minutes;
  }

  public int getHours() {
    return this.hours;
  }

  public int getMinutes() {
    return this.minutes;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + hours;
    result = prime * result + minutes;
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    TimeJava other = (TimeJava) obj;
    if (hours != other.hours)
      return false;
    if (minutes != other.minutes)
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "TimeJava [hours=" + hours + ", minutes=" + minutes + "]";
  }
}
