// Recursion is a technique where a function calls itself to solve a smaller subproblem. 
// It must contain a base case to stop the recursion and a recursive case to reduce the problem size.
public class Recursive {
  static void printTable(int n, int i) {
    if (i > 10) { // base case (mandatory)=condition to stop the function
      return;
    }
    System.out.println(n + " * " + i + " = " + n * i);
    printTable(n, i + 1); // Recursive Case – function calling itself
  }

  public static void main(String[] args) {
    int n = 5;
    printTable(n, 1); // Start from 1
  }
}

// Recursion is when a function calls itself to solve a smaller version of
// the same problem.
// If there is no base case → program will run forever (infinite recursion).
// Every recursive call should move toward base case
// Uses call stack =>
// First call-> printTable(5, 1)
// It prints => 5 x 1 = 5
// Then calls -> printTable(5, 2)
// Continues until i > 10 => printTable(5, 11) → base case → return
// Then recursion stops
