package DiceProblem;

import java.util.Scanner;

public class DiceOppositeIfElse {
  // Method to find opposite face of a dice
  static int oppFace(int n) {
    if (n == 6) {
      return 1;
    } else if (n == 5) {
      return 2;
    } else if (n == 4) {
      return 3;
    } else if (n == 3) {
      return 4;
    } else if (n == 2) {
      return 5;
    } else {
      return 6;
    }
  }

  public static void main(String[] args) {
    // Opposite faces in a normal 6-faced standard dice:
    // 1 ↔ 6
    // 2 ↔ 5
    // 3 ↔ 4
    // Hence a normal if-else-if block can be placed
    Scanner s = new Scanner(System.in);
    System.out.print("Enter dice face: ");
    int n = s.nextInt();
    System.out.println("Opposite face: " + oppFace(n));
    s.close();
  }
}
