package node;

public class nodeLength {
  public static int linkedListLength(SinglyLinkedListNode<Integer> head) {
    int length = 0;
    SinglyLinkedListNode<Integer> current = head;
    while (current != null) {
      length++;
      current = current.next;
    }
    return length;
  }
}
