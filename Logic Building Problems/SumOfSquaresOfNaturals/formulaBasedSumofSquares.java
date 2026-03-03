package SumOfSquaresOfNaturals;

public class formulaBasedSumofSquares {
  static int SumofSquares(int n) {
    return n * (n + 1) / 2 * (2 * n + 1) / 3;
  }

  public static void main(String[] args) {
    // A static method: here SumofSquares()
    // Belongs to the class
    // Does NOT belong to an object
    // Can be called without creating an object
    System.out.println(SumofSquares(3));
  }
}
