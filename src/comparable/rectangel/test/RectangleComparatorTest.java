package comparable.rectangel.test;

import comparable.rectangel.model.RectangleComparator;
import shape.model.Rectangle;

import java.util.Arrays;

public class RectangleComparatorTest {
  public static void main(String[] args) {
    Rectangle[] rectangles = new Rectangle[3];
    rectangles[0] = new Rectangle(3.9, 6);
    rectangles[1] = new Rectangle();
    rectangles[2] = new Rectangle(2.9, 8, "red", true);

    System.out.println("Pre-sorted by Area:");
    for (Rectangle rectangle : rectangles) {
      System.out.println(rectangle);
    }

    RectangleComparator rectangleComparator = new RectangleComparator();
    Arrays.sort(rectangles, rectangleComparator);

    System.out.println("After-sorted by Area:");
    for (Rectangle rectangle : rectangles) {
      System.out.println(rectangle);
    }
  }
}
