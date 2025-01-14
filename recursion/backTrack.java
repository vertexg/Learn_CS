package recursion;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class backTrack {
  public boolean validTree(int N, int[][] edges) {
    List<List<Integer>> graph = new ArrayList<>();
    for (int i = 0; i < N; i++) {
      graph.add(new ArrayList<>());
    }
    for (int[] edge : edges) {
      int a = edge[0];
      int b = edge[1];
      graph.get(a).add(b);
      graph.get(b).add(a);
    }

    Deque<Pair<Integer, Integer>> queue = new ArrayDeque<>();
    queue.offer(new Pair<>(0, -1));

    Set<Integer> visited = new HashSet<>();
    while (!queue.isEmpty()) {
      Pair<Integer, Integer> pair = queue.poll();
      int u = pair.getKey();
      int parent = pair.getValue();

      if (visited.contains(u)) {
        continue;
      }

      visited.add(u);

      for (int v : graph.get(u)) {
        if (v == parent) {
          continue;
        }

        if (visited.contains(v)) {
          return false;
        }

        queue.offer(new Pair<>(v, u));
      }
    }

    return visited.size() == N;
  }

  private static class Pair<K, V> {
    private final K key;
    private final V value;

    public Pair(K key, V value) {
      this.key = key;
      this.value = value;
    }

    public K getKey() {
      return key;
    }

    public V getValue() {
      return value;
    }
  }

}
