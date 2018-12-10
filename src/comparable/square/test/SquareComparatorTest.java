package comparable.square.test;

import comparable.square.model.SquareComparator;
import shape.model.Square;

import java.util.Arrays;

public class SquareComparatorTest {
  public static void main(String[] args) {
    Square[] squares = new Square[3];
    squares[0] = new Square(2.3);
    squares[1] = new Square();
    squares[2] = new Square(2.3, "blue", false);

    SquareComparator squareComparator = new SquareComparator();

    System.out.println("Pre-sorted by Area:");
    for (Square square : squares) {
      System.out.println(square);
    }

    Arrays.sort(squares, squareComparator);

    System.out.println("After-sorted by Area:");
    for (Square square : squares) {
      System.out.println(square);
    }
  }
}
