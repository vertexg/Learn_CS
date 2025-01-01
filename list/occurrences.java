package list;

import java.util.Collections;
import java.util.HashMap;

public class occurrences {
  public static boolean findXTimes(String teams) {
    HashMap<Character, Integer> hashmap = new HashMap<>();
    for (int i = 0; i < teams.length(); i++) {
      if (hashmap.get(teams.charAt(i)) == null)
        hashmap.put(teams.charAt(i), 1);
      else
        hashmap.put(teams.charAt(i), hashmap.get(teams.charAt(i)) + 1);
      // 別解
      // char c = teams.charAt(i);
      // hashmap.put(c, hashmap.getOrDefault(c, 0) + 1);
    }
    return Collections.max(hashmap.values()) == Collections.min(hashmap.values());
  }
}
