package node;

public class nodeTailValue {
  public static int linkedListLastValue(SinglyLinkedListNode<Integer> head) {
    SinglyLinkedListNode<Integer> current = head;
    while (current.next != null) {
      current = current.next;
    }
    return current.data;
  }

}
