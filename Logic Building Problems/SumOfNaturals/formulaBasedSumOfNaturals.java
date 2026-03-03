
// Sum of first n natural numbers = (n * (n+1)) / 2
// For example: n = 5
// Sum = (5 * (5 + 1)) / 2 = (5 * 6) / 2 = 30 / 2 = 15

package SumOfNaturals;

import java.util.Scanner;

public class formulaBasedSumOfNaturals {
  public void sum(int n) {
    System.out.println(n * (n + 1) / 2);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number to calculate sum of natural numbers: ");
    int num = sc.nextInt();
    formulaBasedSumOfNaturals r = new formulaBasedSumOfNaturals();
    r.sum(num);
    sc.close();

  }
}
