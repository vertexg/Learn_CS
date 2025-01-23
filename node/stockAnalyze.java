package node;

import java.util.ArrayList;
import java.util.Deque; // インターフェース
import java.util.ArrayDeque; // スタックとして使う両端キュー

public class stockAnalyze {
  public static int[] stockSpan(int[] stocks) {
    Deque<Integer> stack = new ArrayDeque<Integer>();
    ArrayList<Integer> result = new ArrayList<>();
    for (int i = 0; i < stocks.length; i++) {
      int count = 1;
      int current = stocks[i];
      while (!stack.isEmpty() && stocks[stack.peek()] < current) {
        count += result.get(stack.pop());
      }

      result.add(count);
      // 両端キューstackには先頭からpush
      stack.push(i);

    }
    int[] res = new int[result.size()];
    for (int i = 0; i < result.size(); i++) {
      res[i] = result.get(i);
    }
    return res;
  }
}
