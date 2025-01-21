package node;

public class insertSinglyLinkedList {
  public static SinglyLinkedListNode<Integer> insertAtPosition(SinglyLinkedListNode<Integer> head, int position,
      int data) {
    SinglyLinkedListNode<Integer> node = new SinglyLinkedListNode<Integer>(data);
    SinglyLinkedListNode<Integer> current = head;
    for (int i = 0; i < position; i++) {
      if (current.next == null) {
        return head;
      }
      current = current.next;
    }
    SinglyLinkedListNode<Integer> newNode = current.next;

    current.next = node;
    node.next = newNode;
    return head;

  }
}
