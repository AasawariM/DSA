public class Loops {

  public static void main(String[] args) {
    System.out.println("Loops in Java");

    // for loop
    for (int i = 0; i <= 10; i++) {
      System.out.print(i + " ");
    }

    // while loop
    int j = 0;
    while (j <= 10) {
      System.out.println(j + " ");
      j++;
    }

    // do while
    int k = 0;
    do {
      System.out.print(k + " ");
      k++;
    } while (k <= 10);
  }

  // for loop = When you want exact iterations
  // while Loop = When you need condition check first.
  // Do while Loop = When you need to run at least once
  
}
