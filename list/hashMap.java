package list;

import java.util.ArrayList;
import java.util.HashMap;

public class hashMap {
  public static ArrayList<Integer> listIntersection(int[] targetList, int[] searchList) {
    HashMap<Integer, Integer> hashmap = new HashMap<>();
    ArrayList<Integer> results = new ArrayList<>();
    for (int i = 0; i < targetList.length; i++) {
      hashmap.put(targetList[i], targetList[i]);
    }
    for (int i = 0; i < searchList.length; i++) {
      if (hashmap.get(searchList[i]) != null)
        results.add(searchList[i]);
    }

    return results;
  }

  public static void main(String[] args) {
    int[] targetList = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int[] searchList = { 1, 3, 5, 7, 9 };
    System.out.println(listIntersection(targetList, searchList)); // [1, 3, 5, 7, 9]
  }
}
