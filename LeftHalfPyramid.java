public class LeftHalfPyramid {
  public static void main(String[] args) {
    int n = 4;
    for (int i = 1; i <= n; i++) { // outer loop for rows
      // two inner loops

      // here j will be local variable as its inside for loop so will have local
      // scope.
      for (int j = 1; j <= n - i; j++) { // to print space
        System.out.print(" ");
      }
      for (int j = 1; j <= i; j++) { // to print stars
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
