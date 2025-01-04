package list;

import java.util.HashMap;

public class hashMapCaching {
  // ハッシュテーブルとは、キーと配列のインデックスを関連付けるために使われるデータ構造
  // ハッシュテーブルは、キーと値のペアを格納するためのデータ構造で、キーを使って値を検索することができ.
  // キーに基づく検索や挿入、削除などの操作を効率的に行えるため、非常に便利なデータ構造
  public static boolean existsWithinList(int[] listL, int dataY) {
    HashMap<Integer, Integer> hashmap = new HashMap<>();

    // ハッシュマップに格納
    for (int i = 0; i < listL.length; i++) {
      hashmap.put(listL[i], listL[i]);

    }

    // 存在したら true、存在しなければ false
    return (hashmap.get(dataY) != null) ? true : false;
  }

  public static void main(String[] args) {
    // 固定配列を検索します
    int[] sampleList = { 3, 10, 23, 3, 4, 50, 2, 3, 4, 18, 6, 1, -2 };
    System.out.println(existsWithinList(sampleList, 23));
    System.out.println(existsWithinList(sampleList, -2));
    System.out.println(existsWithinList(sampleList, 100));
  }

}
