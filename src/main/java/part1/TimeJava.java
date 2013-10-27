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
}
