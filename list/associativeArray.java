package list;

import java.util.Map;
import java.util.HashMap;

public class associativeArray {
  Map<String, String> map = new HashMap<>();

  public associativeArray() {
    map.put("key1", "value1");
    map.put("species", "Pomeranian");
    map.put("furColor", "Brown");
    map.put("born", "2018/05/06");
    map.put("favoriteFood", "Carrot sticks");
  }

  public static void main(String[] args) {
    associativeArray aa = new associativeArray();
    System.out.println(aa.map.get("species"));
  }
}
