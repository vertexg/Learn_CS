package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class duplicateArrays {
  public static int[] intersectionOfArraysRepeats(int[] intList1, int[] intList2) {
    HashMap<Integer, Integer> hashmap = new HashMap<>();

    for (int i = 0; i < intList2.length; i++) {
      if (hashmap.get(intList2[i]) == null)
        hashmap.put(intList2[i], 1);
      else
        hashmap.put(intList2[i], hashmap.get(intList2[i]) + 1);
    }

    ArrayList<Integer> results = new ArrayList<>();
    for (int i = 0; i < intList1.length; i++) {
      if (hashmap.get(intList1[i]) != null && hashmap.get(intList1[i]) > 0) {
        results.add(intList1[i]);
        hashmap.put(intList1[i], hashmap.get(intList1[i]) - 1);
      }
    }

    int[] result = new int[results.size()];
    for (int i = 0; i < results.size(); i++) {
      result[i] = results.get(i);
    }
    Arrays.sort(result);
    return result;
  }
}
