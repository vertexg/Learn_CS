package list;

import java.util.HashMap;

public class duplicateArrays {
  public static int[] intersectionOfArraysRepeats(int[] intList1, int[] intList2) {
    HashMap<Integer, Integer> hashmap = new HashMap<>();
    for (int i = 0; i < intList2.length; i++) {
      if (hashmap.get(intList2[i]) == null) {
        hashmap.put(intList2[i], 1);
      } else {
        hashmap.put(intList2[i], hashmap.get(intList2[i]) + 1);
      }

    }

    // 関数を完成させてください
  }

}
