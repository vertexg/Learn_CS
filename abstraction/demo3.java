package abstraction;

//出力されたデータを、他の関数の入力として使うこともでき,関数の合成（function composition）という。関数の合成は一つの関数の出力を別の関数の入力として使うことができる。
//ユーザーが入力したメールアドレスが正しい形式であるかを簡単に確認するロジック
public class demo3 {
  public static boolean containAsSymbol(String str) {
    return str.contains("@");
  }

  public static boolean containDot(String str) {
    return str.contains(".");
  }

  public static boolean isEmail(String str) {
    return containAsSymbol(str) && containDot(str);
  }

  public static void main(String[] args) {
    System.out.println(isEmail("example@example.com"));
    System.out.println(isEmail("exampleexamplecom"));
  }
}
