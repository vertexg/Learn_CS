package list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Arrays;

public class shoppingList {
  public static int[] missingItems(int[] listA, int[] listB) {
    HashMap<Integer, Integer> hashmap = new HashMap<>();
    ArrayList<Integer> results = new ArrayList<>();

    for (int i = 0; i < listB.length; i++) {
      hashmap.put(listB[i], listB[i]);
    }
    for (int i = 0; i < listA.length; i++) {
      if (hashmap.get(listA[i]) == null)
        results.add(listA[i]);
    }
    int[] res = new int[results.size()];
    for (int i = 0; i < results.size(); i++) {
      res[i] = results.get(i);
    }

    return res;
  }

}
