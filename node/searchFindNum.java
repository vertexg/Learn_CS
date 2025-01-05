package node;

public class searchFindNum {
  public static int findMinNum(SinglyLinkedListNode<Integer> head) {
    // head を iterator に代入します。
    SinglyLinkedListNode<Integer> iterator = head;
    // 暫定の最小値として Integer.MAX_VALUE を入れておきます。
    int minValue = Integer.MAX_VALUE;
    // 最小値を更新したら index も更新します。
    int index = 0;
    // リストのインデックスを追いかける変数
    int i = 0;

    // iteratorがnullでない間リストを走査します。
    while (iterator != null) {
      // 暫定の最小値よりもiteratorの値が小さかったら更新します。
      if (minValue >= iterator.data) {
        minValue = iterator.data;
        // その時の i を index に保存します。
        index = i;
      }
      // 次のノードへ進めます。
      iterator = iterator.next;
      // iをインクリメントします。
      i++;
    }
    return index;
  }
}
