package Swap2Numbers;

import java.util.Scanner;

public class UsingThirdVariable {
  static void swap(int x, int y) {
    int temp;
    temp = x;
    x = y;
    y = temp;
    System.out.println("after swapping " + x + " , " + y);

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.println("before swapping " + a + " , " + b);
    swap(a, b);
    // Variables store values in memory.
    // Swapping means reassigning values.
    // Java methods get copies of primitive values.
    // Swapping happens only in method memory.
    // Original a and b remain unchanged.
    // Because Java is:Pass by value
    // Not pass by reference (for primitives)i.e Java does NOT support pass by
    // reference for primitive data types.
    System.out.println("after method call " + a + " , " + b); // The original values of a and b in main() do NOT change
                                                              // after swap.

    // ** solution **
    // to Actually Swap in Main
    // or if another method (like above) used then return as array
    int p = 2, q = 3;
    System.out.println("a = " + a + " b = " + b);

    // Swap a and b using temp variable
    int temp = p;
    p = q;
    q = temp;

    System.out.println("a = " + p + " b = " + q);
    sc.close();
  }
}

// Important Difference From Earlier Java Example
// Earlier used:
// static void swap(int x, int y)
// That did NOT change original values because Java passes copy of values to
// methods.
// But here:
// Swapping happens directly inside main
// No method call
// So original variables actually change

// remember :
// Java supports pass by value only
// Primitive swapping inside same method works
// Swapping inside another method does NOT change original variables