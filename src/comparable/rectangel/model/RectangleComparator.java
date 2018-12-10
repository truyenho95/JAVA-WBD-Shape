package comparable.rectangel.model;

import shape.model.Circle;
import shape.model.Rectangle;

import java.util.Comparator;

public class RectangleComparator implements Comparator<Rectangle> {

  @Override
  public int compare(Rectangle c1, Rectangle c2) {
    if (c1.getArea() > c2.getArea()) return 1;
    if (c1.getArea() < c2.getArea()) return -1;
    return 0;
  }
}
