package recursion;

public class recursionProblem {
  // パスカルの三角形
  public static int numberOfDots(int x) {
    if (x == 0) {
      return 0;
    }
    return numberOfDots(x - 1) + x;
  }
  // ________________________________________________________________________

  // totalSquareArea
  public static int totalSquareArea(int x) {
    if (x == 0) {
      return 0;
    }
    return totalSquareArea(x - 1) + (int) Math.pow(x, 3);
  }

  public static String sheeps(int count) {
    return sheepsHelper(count, "");
  }
  // ________________________________________________________________________
  // sheepsCount

  public static String sheepsHelper(int count, String str) {
    if (count <= 0) {
      return str;
    }
    return sheepsHelper(count - 1, String.valueOf(count) + " sheep ~ " + str);
  }

  public static String reverseString(String s) {
    return reverseStringHelper(s.charAt(0) + "", 1, s);
  }

  public static String reverseStringHelper(String reverseStr, int index, String originalString) {

    if (index >= originalString.length())
      return reverseStr;

    return reverseStringHelper(originalString.charAt(index) + reverseStr, index + 1, originalString);
  }

  // ________________________________________________________________________
  // countSquare
  public static int gcd(int x, int y) {
    if ((x % y) == 0) {
      return y;
    } else {
      return gcd(y, x % y);
    }
  }

  public static int countSquare(int x, int y) {
    return x * y / (int) Math.pow(gcd(x, y), 2);
  }

  // ________________________________________________________________________
  public static int splitAndAdd(int digits) {
    // 関数を完成させてください
    return splitAndAddHelper(digits, 0);
  }

  public static int splitAndAddHelper(int digits, int sum) {
    if (digits == 0) {
      return sum;
    }
    return splitAndAddHelper(digits / 10, sum + digits % 10);
  }

  // ________________________________________________________________________
  public static int howLongToReachFundGoal(int capitalMoney, int goalMoney, int interest) {
    return howLongToReachFundGoalHelper(capitalMoney, goalMoney, interest, 0);
  }

  private static int howLongToReachFundGoalHelper(double capitalMoney, double goalMoney, double interest, int years) {
    if (capitalMoney >= goalMoney) {
      return years;
    }
    if (years >= 80) {
      return 80;
    }
    if (years % 2 == 0) {
      goalMoney *= 1.02;
    } else {
      goalMoney *= 1.03;
    }

    capitalMoney *= (1 + interest / 100.0);
    return howLongToReachFundGoalHelper(capitalMoney, goalMoney, interest, years + 1);
  }

  // ________________________________________________________________________
  public static int fibonacci(int n) {
    if (n == 0) {
      return 0;
    } else if (n == 1) {
      return 1;
    } else {
      return fibonacci(n - 1) + fibonacci(n - 2);
    }
  }

  // 末尾再帰
  public static int fibonacciTail(int n) {
    return fibonacciTailHelper(0, 1, n);
  }

  public static int fibonacciTailHelper(int a, int b, int n) {
    if (n == 0)
      return a;
    return fibonacciTailHelper(b, a + b, n - 1);
  }

  // ________________________________________________________________________
  public static int recursiveDigitsAdded(long digits) {
    long num = splitAndAdd(digits);
    if (num < 10) {
      return (int) num;
    }
    return (int) num + recursiveDigitsAdded(num);

  }

  public static long splitAndAdd(long digits) {
    return splitAndAddHelper(digits, 0);

  }

  public static long splitAndAddHelper(long digits, long sum) {
    if (digits == 0) {
      return sum;
    }
    return splitAndAddHelper((digits / 10), (sum + digits % 10));
  }

  public static void main(String[] args) {
    System.out.println(numberOfDots(5)); // 15
    System.out.println(totalSquareArea(5)); // 225
    System.out.println(sheeps(2)); // 2 sheep ~ 1 sheep ~
    System.out.println(reverseString("Hello")); // olleH
    System.out.println(countSquare(8, 12)); // 24
    System.out.println(splitAndAdd(12345)); // 15
    System.out.println(howLongToReachFundGoal(1000, 2000, 5)); // 29
    System.out.println(fibonacci(10)); // 55
    System.out.println(fibonacciTail(10)); // 55
    System.out.println(recursiveDigitsAdded(12345)); // 6
  }
}
