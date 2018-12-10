package resizeable.test;

import resizeable.model.Resizeable;
import shape.model.Circle;
import shape.model.Rectangle;
import shape.model.Square;

public class ResizeableTest {
  public static void main(String[] args) {
    Rectangle rectangle = new Rectangle(3,5);
    System.out.println(rectangle);
    Resizeable resizeableRect = (Rectangle) rectangle;
    resizeableRect.resize(150);
    System.out.println(rectangle);
    System.out.println("*****************");

    Circle circle = new Circle(3.5);
    System.out.println(circle);
    Resizeable resizeableCircle = (Circle) circle;
    resizeableCircle.resize(200);
    System.out.println(circle);
    System.out.println("*****************");

    Square square = new Square(2);
    System.out.println(square);
    Resizeable resizeableSquare = (Square) square;
    resizeableSquare.resize(50);
    System.out.println(square);
  }
}
