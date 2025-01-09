package node;

import java.util.ArrayList;

class Node {
  public int data;
  public Node prev;
  public Node next;

  public Node(int data) {
    this.data = data;
  }
}

class Deque {
  public Node head;
  public Node tail;

  public Deque() {
    this.head = null;
    this.tail = null;
  }

  public Integer peekFront() {
    if (this.head == null)
      return null;
    return this.head.data;
  }

  public Integer peekBack() {
    if (this.tail == null)
      return null;
    return this.tail.data;

  }

  public void enqueueFront(int data) {
    if (this.head == null) {
      this.head = new Node(data);
      this.tail = this.head;
    }

    Node node = new Node(data);
    this.head.prev = node;
    node.next = this.head;
    this.head = node;
  }

  public void enqueueBack(int data) {
    if (this.head == null) {
      this.head = new Node(data);
      this.tail = this.head;
    } else {
      Node node = new Node(data);
      this.tail.next = node;
      node.prev = this.tail;
      this.tail = node;
    }
  }

  public Integer dequeueFront() {
    if (this.head == null)
      return null;

    Node temp = this.head;
    this.head = this.head.next;
    if (this.head != null)
      this.head.prev = null;
    else
      this.tail = null;
    return temp.data;
  }

  public Integer dequeueBack() {
    if (this.tail == null)
      return null;

    Node temp = this.tail;
    this.tail = this.tail.prev;

    if (this.tail != null)
      this.tail.next = null;
    else
      this.head = null;
    return temp.data;
  }
}

class slidingWindow {
  public static ArrayList<Integer> getMaxWindows(int[] arr, int k) {
    ArrayList<Integer> results = new ArrayList<>();
    if (k > arr.length)
      return results;

    Deque deque = new Deque();

    // dequeの初期化
    for (int i = 0; i < k; i++) {

      while (deque.peekBack() != null && arr[deque.peekBack()] <= arr[i]) {
        deque.dequeueBack();
      }
      deque.enqueueBack(i);

    }

    for (int i = k; i < arr.length; i++) {
      // dequeの先頭は最大値
      results.add(arr[deque.peekFront()]);

      // ウィンドウ外にある要素は取り除く
      while (deque.peekFront() != null && deque.peekFront() <= i - k)
        deque.dequeueFront();
      // 現在の値とそれより小さい全てのdequeの値をチェック
      while (deque.peekBack() != null && arr[deque.peekBack()] <= arr[i])
        deque.dequeueBack();
      deque.enqueueBack(i);
    }

    // 最後のmax
    results.add(arr[deque.peekFront()]);
    return results;
  }

  public static void main(String[] args) {

    // [64, 64, 64, 34, 14, 353, 353, 353, 353, 63]
    int[] arr = new int[] { 34, 35, 64, 34, 10, 2, 14, 5, 353, 23, 35, 63, 23 };
    System.out.println(getMaxWindows(arr, 4));

  }

}
