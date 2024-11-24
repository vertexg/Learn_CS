package abstraction;

//関数の分解とは、一つ大きなをタスクを小さなタスクに分割し、それぞれを独立した関数として定義すること
//分解したものは、他の関数の入力として使うこともできるため再利用性が高まり、関数を組み合わせて新しい関数を作ることも容易になる。
public class demo4 {
  // 二次方程式の解の公式
  public static double solveQuadraticEquation(double a, double b, double c) {
    return Math.max((-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a), (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a));
  }

  // 体積の公式
  public static double calculateVolume(double r) {
    return 4.0 / 3.0 * 3.14159 * Math.pow(r, 3);
  }

  public static double calculateVolumeFromEquation(double a, double b, double c) {
    double r = solveQuadraticEquation(a, b, c);
    return calculateVolume(r);
  }
}
