package list;

import java.util.ArrayList;

public class arrayList {
  public static void main(String[] args) {
    printList(fizzbuzz(16));
  }

  public static ArrayList<String> fizzbuzz(int x) {
    ArrayList<String> list = new ArrayList<>();
    for (int i = 0; i < x; i++) {
      if (i % 3 == 0 && i % 5 == 0) {
        list.add("FizzBuzz");
      } else if (i % 3 == 0) {
        list.add("Fizz");
      } else if (i % 5 == 0) {
        list.add("Buzz");
      } else {
        list.add(String.valueOf(i));
      }
    }
    return list;
  }

  public static void printList(ArrayList<String> lists) {
    for (int i = 0; i < lists.size(); i++) {
      System.out.println(lists.get(i));
    }
  }
}
