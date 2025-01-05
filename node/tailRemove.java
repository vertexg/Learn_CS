package node;

public class tailRemove {
  public static SinglyLinkedListNode<Integer> deleteTail(SinglyLinkedListNode<Integer> head) {
    SinglyLinkedListNode<Integer> current = head;
    while (current != null) {
      if (current.next.next == null) {
        current.next = null;
        return head;
      }
      current = current.next;
    }
    return head;

  }

}
