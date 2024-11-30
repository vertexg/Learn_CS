package recursion;

public class stackProblem {
  public static int divideBy3Count(int n) {
    return divideBy3CountHelper(n, 0);
  }

  public static int divideBy3CountHelper(int n, int count) {
    if (n == 0) {
      return count;
    }
    if (n % 3 == 0) {
      return divideBy3CountHelper(n / 3, count + 1);
    }
    return count;
  }
  // --------------------------------------------------------------------------------

  public static String divisor(int number) {
    return divisorHelper(number, "", 1);
  }

  private static String divisorHelper(int number, String str, int count) {
    if (count > number) {
      return str;
    }
    if (number % count == 0) {
      // 最初の約数の場合はハイフンを付けない
      if (str.isEmpty()) {
        return divisorHelper(number, str + count, count + 1);
      } else {
        return divisorHelper(number, str + "-" + count, count + 1);
      }
    }
    return divisorHelper(number, str, count + 1);
  }
  // 別解
  // public static String divisor(int number){
  // return divisorHelper(number, 1);
  // }

  // public static String divisorHelper(int number, int i) {
  // // iがnumberと等しくなったら再帰を終了する
  // if (number <= i) return String.valueOf(number);
  // // numberを割り切れる数の場合、文字列を追加する
  // if (number % i == 0) return String.valueOf(i) + '-' + divisorHelper(number,
  // i+1);
  // else return divisorHelper(number, i+1);
  // }

  // --------------------------------------------------------------------------------
  public static void main(String[] args) {
    System.out.println(divideBy3Count(27)); // 3

  }

}
