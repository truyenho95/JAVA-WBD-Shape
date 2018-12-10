package comparable.square.model;

import shape.model.Square;

import java.util.Comparator;

public class SquareComparator implements Comparator<Square> {
  @Override
  public int compare(Square o1, Square o2) {
    if (o1.getArea() > o2.getArea()) return 1;
    if (o1.getArea() < o2.getArea()) return -1;
    return 0;
  }
}
