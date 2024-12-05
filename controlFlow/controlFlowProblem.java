package controlFlow;

// 関数、式がどのような順序で評価されるかには一定のルールが存在。これらのルールは制御フロー（control flow）と呼ばれる
public class controlFlowProblem {
  public static boolean isPrime(int number) {
    for (int i = 2; i < number; i++) {
      if (number % i == 0) {
        return false;
      }
    }
    return number > 1 ? true : false;
  }

  // ________________________________________________________________________
  public static String doYouFail(String string) {
    int count = 0;
    for (int i = 0; i < string.length(); i++) {
      if (string.charAt(i) == 'A') {
        count++;
      }
    }
    return count < 3 ? "pass" : "fail";
  }

  // ________________________________________________________________________
  public static String notDivisibleNumbers(int x, int y) {
    String result = "";
    for (int i = 1; i <= x; i++) {
      if (i % y != 0)
        result += i + "-";

    }
    return result.substring(0, result.length() - 1);
  }

  // ________________________________________________________________________
  public static String fizzBuzz(int n) {
    String result = "";
    for (int i = 1; i <= n; i++) {
      if (i % 3 == 0 && i % 5 == 0) {
        result += "FizzBuzz-";
      } else if (i % 5 == 0) {
        result += "Buzz-";
      } else if (i % 3 == 0) {
        result += "Fizz-";
      } else {
        result += i + "-";
      }
    }
    return result.substring(0, result.length() - 1);
  }
  // ________________________________________________________________________

  public static boolean isPalindromeInteger(int n) {
    String str = String.valueOf(n);
    for (int i = 0; i < str.length() / 2; i++) {
      if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
        return false;
      }
    }
    return true;

  }

  public static int sumOfAllPrimes(int n) {
    return sumOfAllPrimesHelper(n, 0);
    // 関数を完成させてください
  }

  public static int sumOfAllPrimesHelper(int n, int sum) {
    for (int i = 2; i <= n; i++) {
      if (isPrime(i)) {
        sum += i;
      }
    }
    return sum;
  }

  // ________________________________________________________________________
  public static String decimalToBinary(int decNumber) {
    String result = "";
    while (decNumber != 0) {
      if (decNumber % 2 == 0) {
        result = "0" + result;
      } else {
        result = "1" + result;
      }
      decNumber /= 2;
    }
    return result;

  }

  // ________________________________________________________________________
  public static String decimalToHexadecimal(int decNumber) {
    String hexadecimal = "0123456789ABCDEF";
    String result = "";
    while (decNumber != 0) {
      int remainder = decNumber % 16;
      result = hexadecimal.charAt(remainder) + result;

      decNumber = decNumber /= 16;
    }
    return result;

  }

  public static void main(String[] args) {
    System.out.println(isPrime(7)); // 出力: true
    System.out.println(isPrime(10)); // 出力: false
    System.out.println(doYouFail("AAABBB")); // 出力: You fail!
    System.out.println(doYouFail("AAABBBCCC")); // 出力: You pass!
    System.out.println(notDivisibleNumbers(10, 3)); // 出力: 1-2-4-5-7-8-10
    System.out.println(fizzBuzz(15)); // 出力: 1-2-Fizz-4-Buzz-Fizz-7-8-Fizz-Buzz-11-Fizz-13-14-FizzBuzz
  }
}
