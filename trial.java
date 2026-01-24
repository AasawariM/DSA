public class trial {
  public static void main(String[] args) {
    int n = 4;
    for (int i = n; i >= 1; i--) {

      // for pritnting space
      for (int j = 1; j <= n - i; j++) {

        System.out.print(" ");
      }
      // for numbers
      for (int j = 1; j <= i; j++) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }
}
