package recursion;

public class recursionProblem {
  // パスカルの三角形
  public static int numberOfDots(int x) {
    if (x == 0) {
      return 0;
    }
    return numberOfDots(x - 1) + x;
  }

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

  public static void main(String[] args) {
    System.out.println(numberOfDots(5)); // 15
    System.out.println(totalSquareArea(5)); // 225
    System.out.println(sheeps(2)); // 2 sheep ~ 1 sheep ~
  }
}
