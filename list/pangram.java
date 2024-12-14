package list;

import java.util.Arrays;

public class pangram {
  public static boolean isPangram(String string) {
    int[] cashe = new int[26];
    Arrays.fill(cashe, 0);

    for (int i = 0; i < string.length(); i++) {
      int c = (int) string.toLowerCase().charAt(i);
      if (c >= 'a' && c <= 'z') {
        cashe[c - 'a'] = 1;
      }
    }
    for (int i = 0; i < 26; i++)
      if (cashe[i] == 0)
        return false;
    return true;

  }

  // // 文字列がパングラムかどうかを単純なアプローチでチェックするメソッド
  // public static boolean isPangram(String text) {
  // // null または空文字列の場合はfalseを返す
  // if (text == null || text.isEmpty()) {
  // return false;
  // }

  // // ストリームを使用した簡潔な実装
  // return text.toLowerCase() // テキストを小文字に変換
  // .chars() // 文字のストリームに変換
  // .filter(Character::isLetter) // 文字のみをフィルタリング
  // .map(Character::toLowerCase) // すべてを小文字に変換
  // .distinct() // 重複を除去
  // .count() == 26; // 26個のユニークな文字があるかチェック
  // }

  // // 文字列がパングラムかどうかを最適化されたアプローチでチェックするメソッド
  // public static boolean isPangramOptimized(String text) {
  // // null または空文字列の場合はfalseを返す
  // if (text == null || text.isEmpty()) {
  // return false;
  // }

  // // より効率的な実装のためにビットマスクを使用
  // int letterMask = 0;

  // for (char c : text.toLowerCase().toCharArray()) {
  // if (c >= 'a' && c <= 'z') {
  // // 文字に対応するビットを設定
  // letterMask |= 1 << (c - 'a');
  // }
  // }

  // // すべての26ビットが設定されているかチェック
  // return letterMask == (1 << 26) - 1;
  // }

  public static void main(String[] args) {

    System.out.println(isPangram("we promptly judged antique ivory buckles for the next prize"));
    System.out.println(isPangram("a quick brown fox jumps over the lazy dog"));
    System.out.println(isPangram("sphinx of black quartz judge my vow"));
    System.out.println(isPangram("sheep for a unique zebra when quick red vixens jump over the yacht"));
    System.out.println(isPangram("the Japanese yen for commerce is still well-known"));
  }
}
