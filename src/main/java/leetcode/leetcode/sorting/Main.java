package leetcode.leetcode.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
  private static class Interval implements Comparable<Interval> {
      int from, to;
      public Interval(int from, int to) {
          this.from = from; 
          this.to = to;
      }
      @Override
      public String toString() {
          return "[" + Integer.toString(from) + "," + Integer.toString(to) + "]";
      }
      // compareTo implements Comparable interface and allows us to compare and sort the class.
      @Override
      public int compareTo(Interval other) {
          return this.from - other.from;
      }
  }
  public static void main(String[] args) {
      List<Interval> list = Arrays.asList(
          new Interval(5, 7),
          new Interval(3, 8),
          new Interval(4, 6)
      );
      
      // We can create a comparator with lambda function:
      list.sort((a, b) -> a.from - b.from);
      System.out.println(list.toString());
      
      // This uses class' compareTo() function
      Collections.sort(list);
      System.out.println(list.toString());
  }
    /*
   Input: nums = [3,30,34,5,9] 3 5 9 30 34
Output: "9534330"
     */

}