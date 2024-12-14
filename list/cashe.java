package list;

public class cashe {
  public static long tabulationFib(int n) {
    long[] cashe = new long[n + 1];
    cashe[0] = 0;
    cashe[1] = 1;
    for (int i = 2; i <= n; i++) {
      cashe[i] = cashe[i - 1] + cashe[i - 2];
    }

    return cashe[n];
  }

  public static void main(String[] args) {
    System.out.println(tabulationFib(50));
  }
}
