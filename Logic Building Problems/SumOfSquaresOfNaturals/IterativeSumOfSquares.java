package SumOfSquaresOfNaturals;

public class IterativeSumOfSquares {
  static int SumOfSquares(int n) {
    int sum = 0;
    // The idea for this naive approach is to run a loop from 1 to n and sum up all
    // the squares.
    for (int i = 1; i <= n; i++) {
      // sum += (i * i);
      int square = (int) Math.pow(i, 2); // converted to int as Math.pow() returns double value
      sum += square;
    }
    return sum;
  }

  public static void main(String[] args) {
    int n = 3;
    System.out.println(SumOfSquares(n));
  }
}
