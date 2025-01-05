package node;

import java.util.ArrayDeque;
import java.util.Deque;

public class diceGame {
  private static final int BET_AMOUNT = 4;

  public static String diceStreakGamble(int[] player1, int[] player2, int[] player3, int[] player4) {
    // 関数を完成させてください

    Deque<Integer> d1 = consecutiveWalk(player1);
    Deque<Integer> d2 = consecutiveWalk(player2);
    Deque<Integer> d3 = consecutiveWalk(player3);
    Deque<Integer> d4 = consecutiveWalk(player4);

    Deque[] dList = new Deque[] { d1, d2, d3, d4 };
    int max = 0;
    int index = 0;
    for (int i = 0; i < dList.length; i++) {
      if (max < dList[i].size()) {
        max = dList[i].size();
        index = i;
      }
    }
    String result = "[" + dList[index].poll();
    while (dList[index].peek() != null) {
      result += "," + dList[index].poll();
    }
    result += "]";

    return "Winner: Player " + (index + 1) + " won $" + (max * BET_AMOUNT) + " by rolling " + result;
  }

  public static Deque<Integer> consecutiveWalk(int[] arr) {
    Deque<Integer> result = new ArrayDeque<>();
    result.addFirst(arr[0]);
    for (int i = 1; i < arr.length; i++) {
      if (result.peekLast() > arr[i]) {
        while (result.peekLast() != null)
          result.removeLast();
      }
      result.addFirst(arr[i]);
    }
    return result;
  }
}
