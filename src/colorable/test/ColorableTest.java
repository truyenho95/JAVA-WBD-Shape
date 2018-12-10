package colorable.test;

import colorable.model.Colorable;
import shape.model.Circle;
import shape.model.Shape;
import shape.model.Square;

public class ColorableTest {
  public static void main(String[] args) {
    Shape[] shapes = new Shape[3];
    shapes[0] = new Square();
    shapes[1] = new Circle(2.6);
    shapes[2] = new Square(3, "red", true);

    for (Shape shape: shapes) {
      if (shape instanceof Square) {
        Colorable colorable = (Square) shape;
        System.out.println(shape);
        System.out.println(colorable.howToColor());
      }
    }
  }
}
