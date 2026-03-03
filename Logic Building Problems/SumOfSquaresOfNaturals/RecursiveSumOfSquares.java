package SumOfSquaresOfNaturals;

public class RecursiveSumOfSquares {
  static int SumOfSquares(int n) {
    if (n <= 0) { // for 0 or negative numbers
      return 0;
    }
    // int sq = n * n;
    // double sq = Math.pow(n, 2);
    return n * n + SumOfSquares(n - 1);
  }

  public static void main(String[] args) {
    int n = 3;
    System.out.println(SumOfSquares(n));
  }
}
