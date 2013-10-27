package part1;

import java.util.ArrayList;

import scala.Tuple2;

public class TimeUtilJava {

  /** Partitions the passed `times` according to the provided `hour` */
  public static Tuple2<TimeJava[],TimeJava[]> partition(TimeJava[] times, int hour) {
    ArrayList<TimeJava> before = new ArrayList<TimeJava>();
    ArrayList<TimeJava> after = new ArrayList<TimeJava>();

    for(int i = 0; i < times.length; i++) {
      TimeJava time = times[i];
      if(time.getHours() < hour) {
        before.add(time);
      }
      else {
        after.add(time);
      }
    } 
    return new Tuple2<TimeJava[], TimeJava[]>(
        before.toArray(new TimeJava[before.size()]), 
        after.toArray(new TimeJava[after.size()])
    );
  }
}
