package Swap2Numbers;

public class ArithmaticSwap {
  public static void main(String[] args) {
    int a = 2;
    int b = 3;

    System.out.println("Before Swap: " + a + "," + b);
    a = a + b; // a=2+3; so a=5;
    b = a - b; // b=5-3; so b=2;
    a = a - b;// a=5-2; so a=3;

    System.out.println("After Swap: " + a + "," + b);

  }
}

// Limitation
// Arithmetic swap can cause integer overflow.
// Example:
// int a = 1_000_000_000;
// int b = 2_000_000_000;
// a + b may exceed int range and give wrong result.
// Best Practice:
// Always use a temporary variable.
// It is safest, most readable, and modern compilers optimize it well.