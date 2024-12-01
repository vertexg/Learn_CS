package scope;

public class sideEffect {
  // 「副作用」 とはある処理を行った結果、意図していなかった別の変化が起きてしまうことを指す
  // グローバルスコープ（Global Scope）は、プログラム内のどこからでもアクセスできる最上位のスコープ。反対に、ローカルスコープ（Local
  // Scope）は、特定のブロック内でのみアクセスできるスコープ。

  // 副作用を持っています
  // この関数は間接的にクラス変数に影響
  // public static int square(int x) {
  // changeGlobalCounter(-12);
  // return x * x;}

  // public static void main(String[] args) {

  // incrementGlobalCounter();
  // System.out.println(globalCounter); // 1

  // incrementGlobalCounter();
  // System.out.println(globalCounter); // 2

  // incrementGlobalCounter();
  // System.out.println(globalCounter); // 3

  // // 他の開発者が square 関数を作成したと仮定
  // // square 関数によって、globalCounter の値が大きく変わる
  // square(10);
  // System.out.println(globalCounter);

  // incrementGlobalCounter();
  // 本来なら 4 が出力されますが、副作用のため -11 が出力

  /// 原因は、変数 globalCounter がローカルスコープの中ではなく、グローバルスコープでグローバル変数として使われているため
  /// --------------------------------------------------------------------------------------------------
  /// 上のコードの修正版

  public static void changeGlobalCounter(int x) {
    // この関数内での counter は -12 になります
    int counter = x;
  }

  // 副作用はありません
  public static int incrementOne(int x) {
    return x + 1;
  }

  public static int square(int x) {
    changeGlobalCounter(-12);
    return x * x;
  }

  // 副作用なしの関数
  public static int counterProcess() {
    int counter = 0;

    counter = incrementOne(counter);
    System.out.println(counter); // 1

    counter = incrementOne(counter);
    System.out.println(counter); // 2

    counter = incrementOne(counter);
    System.out.println(counter); // 3

    // counter への副作用はありません
    square(10);

    counter = incrementOne(counter);
    System.out.println(counter); // 4

    return counter;
  }

  public static void main(String[] args) {
    int finalCount = counterProcess();
    System.out.println(finalCount);
  }
}
