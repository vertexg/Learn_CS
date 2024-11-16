package abstraction;

//関数やメソッドが返すデータは、他のデータと同じように扱える。つまり、出力は他の関数やメソッドの入力として利用できる
//特に文字列の場合、この性質を利用して複数のメソッドをつなぎ合わせるように実行することをメソッドチェーン（method chain）という
public class demo2 {
  public static String doubleSubstring(String str) {
    return str + str;
  }

  public static void main(String[] args) {
    String message = "Hello";
    System.out.println(message);
    System.out.println(doubleSubstring(message));
    System.out.println(doubleSubstring(message).substring(1).indexOf("ll"));

    String mail = "recursion@info.com";
    System.out.println(mail.substring(0, mail.indexOf("@")));
    System.out.println(mail.replace("com", "jp"));
  }
}
