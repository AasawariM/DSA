// The idea is based on the observation that the sum of two opposite sides of a cubical dice is equal to 7. 
// So, just subtract the given n from 7 and print the answer.

package DiceProblem;

import java.util.Scanner;

public class DiceOppositeFormula {
  public static int oppFace(int n) {
    // input validation
    if (n < 1 || n > 6) {
      System.out.println("Invalid dice face! Enter number between 1 and 6.");
      return -1; // invalid value
    }
    return 7 - n;
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter dice face: ");
    int n = s.nextInt();
    int res = oppFace(n);
    if (res != -1) {
      System.out.println("Opposite face: " + res);
    }
    s.close();
  }
}
