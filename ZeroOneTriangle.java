public class ZeroOneTriangle {
  public static void main(String[] args) {
    int n = 5;
    int i, j;

    for (i = 1; i <= n; i++) {
      for (j = 1; j <= i; j++) {
        if ((i + j) % 2 == 0) {
          // even i+j sum position
          System.out.print("1 ");
        } else {
          // odd i+j sum position
          System.out.print("0" + " ");
        }
      }
      System.out.println();
    }
  }
}
