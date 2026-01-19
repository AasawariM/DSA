public class FloydTriangle {
  public static void main(String[] args) {

    // Number Changing pyramid
    int n = 5;
    int i, j;
    int number = 1;
    for (i = 1; i <= n; i++) {
      for (j = 1; j <= i; j++) {
        System.out.print(number + " ");
        number++;
      }
      System.out.println();
    }
  }
}
