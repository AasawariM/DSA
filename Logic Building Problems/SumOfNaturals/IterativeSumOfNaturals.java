// Program for sum of n natural numbers
// Input: n = 5
// Output: 15 
// Explanation:  1 + 2 + 3 + 4 + 5 = 15

package SumOfNaturals;

public class IterativeSumOfNaturals {

  // Calculate the sum of all integers from 1 to n by iterating through a loop.
  static int findSum(int n) {
    int sum = 0;
    for (int i = 1; i <= n; i++) {
      sum += i;
    }
    return sum;
  }

  public static void main(String[] args) {
    int n = 10;
    System.out.println(findSum(n));
  }
}
