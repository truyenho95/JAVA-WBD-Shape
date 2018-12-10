package comparable.circle.model;

import shape.model.Circle;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {
  public ComparableCircle() {
  }

  public ComparableCircle(double radius) {
    super(radius);
  }

  public ComparableCircle(double radius, String color, boolean filled) {
    super(radius, color, filled);
  }

  @Override
  public int compareTo(ComparableCircle o) {
    // So sanh tang dan
    return Double.compare(getRadius(), o.getRadius());
    // if(getRadius() > o.getRadius()) return 1;
    // if (getRadius() < o.getRadius()) return -1;
    // return 0;
  }
}
