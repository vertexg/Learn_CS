package list;

import java.util.Arrays;

public class primeNumbers {
  public static int primesUpToNCount(int n) {
    boolean[] isPrime = new boolean[n];
    Arrays.fill(isPrime, true);

    int count = 2;

    for (int i = 2; i * i < n; i++) {
      int p = 2;
      while (i * p < n) {
        if (isPrime[i * p]) {
          isPrime[i * p] = false;
          count++;
        }

        p++;
      }
    }
    return isPrime.length - count;
    // 関数を完成させてください
  }

  public static void main(String[] args) {
    System.out.println(primesUpToNCount(10)); // 0
    System.out.println(primesUpToNCount(3)); // 1
    System.out.println(primesUpToNCount(5)); // 2
    System.out.println(primesUpToNCount(13)); // 5
    System.out.println(primesUpToNCount(18)); // 7
    System.out.println(primesUpToNCount(89)); // 23
    System.out.println(primesUpToNCount(97)); // 24
    System.out.println(primesUpToNCount(100)); // 25
    System.out.println(primesUpToNCount(367)); // 72
    System.out.println(primesUpToNCount(673)); // 121
    System.out.println(primesUpToNCount(1000)); // 168
    System.out.println(primesUpToNCount(3406)); // 478

  }
}
