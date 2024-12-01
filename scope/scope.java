package scope;
// スコープ（scope）とは、変数や関数が有効な範囲のことを指す。

public class scope {
  // 変数の宣言。Javaではグローバルスコープの変数は存在しない。グローバルスコープのクラスは存在するが、static変数ならどこでもインスタンスがなくても、アクセス可。
  public static String firstName = "Masamune";
  public static String lastName = "Watanabe";

  public static String userName() {
    // 変数の宣言
    String firstName = "Emily";
    String lastName = "Robertson";

    return firstName + " - " + lastName;
  }

  public static void main(String[] args) {
    System.out.println(firstName + " - " + lastName);

    String firstName = "Fernando";
    String lastName = "Yamato";
    System.out.println(firstName + " - " + lastName);

    System.out.println(userName());

    // 変数の上書き
    firstName = "Andy";
    lastName = "Jordan";
    System.out.println(firstName + " - " + lastName);
  }

}
