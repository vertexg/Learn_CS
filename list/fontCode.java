package list;

public class fontCode {
  public static boolean isFirstStringLarger(String s1, String s2) {

    return getAscii(s1) > getAscii(s2);
  }

  public static int getAscii(String s) {
    int sum = 0;
    for (int i = 0; i < s.length(); i++) {
      sum += (int) s.charAt(i);
    }
    return sum;
  }
}
