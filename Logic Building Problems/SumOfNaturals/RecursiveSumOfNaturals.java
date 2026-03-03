package SumOfNaturals;

import java.util.Scanner;

public class RecursiveSumOfNaturals {
  public int sum(int n) {
    if (n <= 0) { // for 0 or negative numbers
      return 0;
    }
    return n + sum(n - 1);
    // for n = 4 =>
    // sum(4)
    // = 4 + sum(3)
    // = 4 + (3 + sum(2))
    // = 4 + (3 + (2 + sum(1)))
    // = 4 + (3 + (2 + (1 + sum(0))))
    // = 4 + 3 + 2 + 1 + 0
    // = 10

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number to calculate sum of natural numbers: ");
    int num = sc.nextInt();
    RecursiveSumOfNaturals s = new RecursiveSumOfNaturals();
    System.out.println(s.sum(num));
    sc.close();
  }
}
