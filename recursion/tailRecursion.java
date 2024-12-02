package recursion;
//コンピュータには物理制限があるため、n が大きくなるとスタックの保持上限を超えて、スタックオーバーフロー（stack overflow）と呼ばれる現象が発生してしまいます。スタックオーバーフローのよくある発生原因として、ベースケースが機能しておらず、再帰関数が無限に呼び出されたり、空間計算量が大きいこと（

//O(n)等）が挙げられます。

public class tailRecursion {
  // 通常の再帰（Regular Recursion）
  // java
  // public class RecursionExample {
  // public static int regularRecursiveFactorial(int n) {
  // // ベースケース
  // if (n == 0) {
  // return 1;
  // }
  // // 再帰呼び出し時に計算を実行
  // return n * regularRecursiveFactorial(n - 1);
  // }
  // }

  // 末尾再帰（Tail Recursion）
  // java
  // public class TailRecursionExample {
  // public static int tailRecursiveFactorial(int n) {
  // return tailRecursiveFactorialHelper(n, 1);
  // }

  // private static int tailRecursiveFactorialHelper(int n, int accumulator) {
  // // ベースケース
  // if (n == 0) {
  // return accumulator;
  // }
  // // 累積変数を使用して再帰
  // return tailRecursiveFactorialHelper(n - 1, n * accumulator);
  // }
  // }

}
