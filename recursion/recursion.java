package recursion;
// 再帰とは、関数が自分自身を呼び出すこと 再

//関数に戻り値を保証し、ループを終了させるステートメントをベースケース（base case）と呼ぶ

public class recursion {
  // 再帰を使わない場合
  public static int factorial(int n) {
    int result = 1;
    for (int i = 1; i <= n; i++) {
      result *= i;
    }
    return result;
  }

  // 再帰を使う場合
  public static int factorialRecursion(int n) {
    if (n == 1) { // ベースケース
      return 1;
    }
    return n * factorialRecursion(n - 1);
  }

  public static int multiply(int a, int b) {
    if (b == 1) { // ベースケース
      return a;
    }
    return a + multiply(a, b - 1);
  }

  // 再帰を使って文字列の長さを取得
  public static int lengthOfString(String str) {
    if (str.equals("")) { // ベースケース
      return 0;
    }
    return 1 + lengthOfString(str.substring(0, str.length() - 1));
  }

  public static void main(String[] args) {
    System.out.println(factorial(5)); // 120
    System.out.println(factorialRecursion(5)); // 120
    System.out.println(multiply(3, 4)); // 12
    System.out.println(lengthOfString("Hello")); // 5
  }

}
