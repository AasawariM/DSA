package PrimeTesting;

public class PrintPrimeInRange {
  static boolean printPrime(int n) {
    if (n <= 1)
      return false;
    // loop to check each of them is prime or not
    // main logic
    for (int i = 2; i <= Math.sqrt(n); i++) {
      if (n % i == 0)
        return false;
    }
    return true;
  }

  public static void main(String[] args) {
    // program to print prime numbers from 1 to 50
    int n = 50;
    // n here is 50
    // loop for 1 to 50
    for (int i = 1; i <= n; i++) {
      if (printPrime(i)) {
        System.out.print(i + " ");
      }
    }
  }
}
